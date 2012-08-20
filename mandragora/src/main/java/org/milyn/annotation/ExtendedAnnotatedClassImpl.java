package org.milyn.annotation;

import java.lang.reflect.Field;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class ExtendedAnnotatedClassImpl extends AnnotatedClassImpl implements ExtendedAnnotatedClass{

	private Map<Field, AnnotatedField> fieldToAnnotatedMap = null;
	private AnnotatedField[] annotatedFields = null;
 

	
	ExtendedAnnotatedClassImpl (final Class<?> theClass){
		super(theClass);
	}	

		
	
	
	private Map<Field, AnnotatedField> getFieldMap(){
		if (fieldToAnnotatedMap == null) {
			fieldToAnnotatedMap = getFieldMapCalculated();
		}
		return fieldToAnnotatedMap;
	}
	
	
	private Map<Field, AnnotatedField> getFieldMapCalculated(){
		final HashMap<Field, AnnotatedField> result = new HashMap<Field, AnnotatedField>();
		//for (final Field field : getTheClass().getFields()) {
		for (final Field field : getTheClass().getDeclaredFields()) {
			result.put(field, new AnnotatedFieldImpl(this, field));
		}
		return result;
	}
	
	
	public AnnotatedField getAnnotatedField(final Field field) {
		return getFieldMap().get(field);
	}
	
	
	public AnnotatedField[] getAnnotatedFields() {
		if (annotatedFields == null) {
			annotatedFields = getAnnotatedFieldsCalculated();
		}
		return annotatedFields;
	}
	
	
	private AnnotatedField[] getAnnotatedFieldsCalculated() {
		final Collection<AnnotatedField> values = getFieldMap().values();
		return values.toArray(new AnnotatedField[0]);
	}
	
	
	public AnnotatedField getAnnotatedField(final String name) {
		try {
			return getAnnotatedField(getTheClass().getField(name));
		} catch (final SecurityException e) {
			throw new RuntimeException(e);
		} catch (final NoSuchFieldException e) {
			return null;
		}
	}
	
	
}
