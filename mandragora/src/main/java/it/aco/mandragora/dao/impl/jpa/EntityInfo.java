package it.aco.mandragora.dao.impl.jpa;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Iterator;

import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Transient;

public class EntityInfo  implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	static private org.apache.log4j.Category log = org.apache.log4j.Logger.getLogger(EntityInfo.class.getName());

	private Class entityClass;
	
	private String[] pkNames;
	
	private ArrayList<String> listPkNames;

	private boolean idAnnotated = false;
	
	private boolean embeddedIdAnnotated = false;
	
	private boolean embeddable = false;
	
	private EmbeddedId embeddedId;
	
	private Id id;
	
	private Field idField = null;
	
	
	
	
	
	
	
	public EntityInfo(Class entityClass) throws Exception {
		try {
			
			this.entityClass = entityClass;
			//ExtendedAnnotatedClass extendedAnnotatedClass = ExtendedAnnotationManager.getAnnotatedClass(entityClass);
			
			/******* start looking for EmbeddedId or Id anntoations on fields*******/
			Field[] fields = entityClass.getDeclaredFields();
			for(int i=0; i<fields.length; i++){
				
				if(fields[i].isAnnotationPresent(EmbeddedId.class)){
				//if(extendedAnnotatedClass.getAnnotatedField(fields[i]).isAnnotationPresent(EmbeddedId.class)){
					embeddedId = fields[i].getAnnotation(EmbeddedId.class);
					//embeddedId = extendedAnnotatedClass.getAnnotatedField(fields[i]).getAnnotation(EmbeddedId.class);
					embeddedIdAnnotated=true;
					idField=fields[i];
					break;
				}else if(fields[i].isAnnotationPresent(Id.class)){
				//else if(extendedAnnotatedClass.getAnnotatedField(fields[i]).isAnnotationPresent(Id.class)){
					id = fields[i].getAnnotation(Id.class);
					//id = extendedAnnotatedClass.getAnnotatedField(fields[i]).getAnnotation(Id.class);
					idAnnotated=true;
					idField=fields[i];
					break;
				}
			}
			
			/******* start looking for EmbeddedId or Id anntoations on getters*******/
			if(idField==null){
				Method[] methods = entityClass.getMethods();
				
				for(int i=0; i<methods.length; i++){
					if( methods[i].isAnnotationPresent(EmbeddedId.class)){
					//if(extendedAnnotatedClass.getAnnotatedMethod( methods[i]).isAnnotationPresent(EmbeddedId.class)){
						embeddedId = methods[i].getAnnotation(EmbeddedId.class);
						//embeddedId = extendedAnnotatedClass.getAnnotatedMethod( methods[i]).getAnnotation(EmbeddedId.class);
						embeddedIdAnnotated=true;
						idField=entityClass.getDeclaredField(methods[i].getName().substring(3,3).toLowerCase()+methods[i].getName().substring(4));
						break;
					}else if( methods[i].isAnnotationPresent(Id.class)){
						id  = methods[i].getAnnotation(Id.class);
						//id  = extendedAnnotatedClass.getAnnotatedMethod( methods[i]).getAnnotation(Id.class);
						idAnnotated=true;
						idField=entityClass.getDeclaredField(methods[i].getName().substring(3,3).toLowerCase()+methods[i].getName().substring(4));
						break;
						
					}
					
				}
			}
			if(idField == null){
				if(entityClass.isAnnotationPresent(Embeddable.class)){
				//if(extendedAnnotatedClass.isAnnotationPresent(Embeddable.class)){
					embeddable=true;
				}else{
					throw new Exception("Error in in constructor EntityInfo(Class entityClass): No EmbeddedId nor Id presente and not Embeddable class");
				}
			}
		} catch (SecurityException e) {
            log.error("SecurityException caught in constructor EntityInfo(Class entityClass): " + e.toString());
            throw new Exception("Error in constructor EntityInfo(Class entityClass): " + e.toString(),e);
		} catch (NoSuchFieldException e) {
            log.error("NoSuchFieldException caught in constructor EntityInfo(Class entityClass): " + e.toString());
            throw new Exception("Error in constructor EntityInfo(Class entityClass): " + e.toString(),e);
		}
	}

	public boolean isEmbeddable() {
		return embeddable;
	}

	public Class getEntityClass() {
		return entityClass;
	}

	public ArrayList<String> getListPkNames() throws Exception {
		log.debug("Entering");
		try {
			if(listPkNames==null){
				listPkNames = new ArrayList<String>();
				
				if(isEmbeddable()){
					Field[] fields = entityClass.getDeclaredFields();
					for (int i=0; i<fields.length;i++){
						if(!fields[i].getType().isAnnotationPresent(Transient.class) && !Modifier.isStatic(fields[i].getModifiers())){
							listPkNames.addAll(getFieldPkNames(fields[i]));
							 
						}
					}
				}else if(isIdAnnotated()||isEmbeddedIdAnnotated()){
					listPkNames.addAll(getFieldPkNames(idField));
				}
			}
		} catch (SecurityException e) {
            log.error("SecurityException caught in EntityInfo.getListPkNames(): " + e.toString());
            throw new Exception("Error in EntityInfo.getListPkNames(): " + e.toString(),e);
		} catch (Exception e) {
            log.error("Exception caught in EntityInfo.getListPkNames(): " + e.toString());
            throw new Exception("Error in EntityInfo.getListPkNames(): " + e.toString(),e);
		}
		log.debug("Done");
		return listPkNames;
	}
	
	
	private ArrayList<String> getFieldPkNames(Field field) throws Exception{
		log.debug("Entering");
		ArrayList<String> fieldPkNames;
		try {
			fieldPkNames = new ArrayList<String>();
			Class fieldClass=field.getType();
			if(fieldClass.isAnnotationPresent(Entity.class) || fieldClass.isAnnotationPresent(Embeddable.class)){
				EntityInfo idFieldEntityInfo = new EntityInfo(fieldClass);
				ArrayList<String> idFieldListPkNames =idFieldEntityInfo.getListPkNames();
				Iterator<String> idFieldListPkNamesIterator = idFieldListPkNames.iterator();
				while(idFieldListPkNamesIterator.hasNext()){
					//fieldPkNames.add(idField.getName()+"."+idFieldListPkNamesIterator.next());
					fieldPkNames.add(field.getName()+"."+idFieldListPkNamesIterator.next());
				}
			}else{
				//fieldPkNames.add(idField.getName());
				fieldPkNames.add(field.getName());
			}
		} catch (Exception e) {
            log.error("Exception caught in EntityInfo.getFieldPkNames(Field field): " + e.toString());
            throw new Exception("Error in EntityInfo.getFieldPkNames(Field field): " + e.toString(),e);
		}
		log.debug("Done");
		return fieldPkNames;
		
	}

	public String[] getPkNames() throws Exception {
		if(pkNames==null){
			pkNames=getListPkNames().toArray(new String[0]);
			
		}
		return pkNames;
	}

	public boolean isIdAnnotated() {
		return idAnnotated;
	}

	public boolean isEmbeddedIdAnnotated() {
		return embeddedIdAnnotated;
	}

	public EmbeddedId getEmbeddedId() {
		return embeddedId;
	}

	public Id getId() {
		return id;
	}

	public Field getIdField() {
		return idField;
	}

}
