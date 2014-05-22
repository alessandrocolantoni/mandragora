package org.milyn.annotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class AnnotatedFieldImpl implements AnnotatedField{
	
	private final ExtendedAnnotatedClass extendedAnnotatedClass;
	
	
	private final Field field;
	
	private Map<Class<?>, Annotation> classToAnnotationMap;
	
	private Annotation[] annotations;
	
	AnnotatedFieldImpl(final ExtendedAnnotatedClass extendedAnnotatedClass, final Field field) {
		super();
		this.extendedAnnotatedClass = extendedAnnotatedClass;
		this.field = field;
	}
	
	private Map<Class<?>, Annotation> getAllAnnotationMap(){
		if (classToAnnotationMap == null) {
			classToAnnotationMap = getAllAnnotationMapCalculated();
		}
		return classToAnnotationMap;
	}
	
	
	private Map<Class<?>, Annotation> getAllAnnotationMapCalculated(){
		
		final HashMap<Class<?>, Annotation> result = new HashMap<Class<?>, Annotation>();
		final Class<?> superClass = getAnnotatedClass().getTheClass().getSuperclass();
		// Get the superclass's overriden method annotations
		if (superClass != null) {
			fillAnnotationsForOneField(result,
					ExtendedAnnotationManager.getAnnotatedClass(superClass).getAnnotatedField(getField().getName()));
		}
		
		for (final Class<?> c : getAnnotatedClass().getTheClass().getInterfaces()){
			fillAnnotationsForOneField(result,
					ExtendedAnnotationManager.getAnnotatedClass(c).getAnnotatedField(getField().getName()));
		}
		
		for (final Annotation annotation : getField().getDeclaredAnnotations()) {
			result.put(annotation.getClass().getInterfaces()[0], annotation);
		}
	
		return result;
	}	

	private void fillAnnotationsForOneField(final HashMap<Class<?>, Annotation> result, final AnnotatedField annotatedField) {
	 
		if (annotatedField == null) {
			return;
		}
		addAnnotations(result, annotatedField.getAllAnnotations());
	}	

	
	private void addAnnotations(final Map<Class<?>, Annotation> result, final Annotation[] annotations) {
		for (final Annotation annotation : annotations) {
			if (annotation == null) {
				continue;
			}
			result.put(annotation.getClass().getInterfaces()[0], annotation); /*It means to take the last annotation*/
		}
	}
	
	public Annotation[] getAllAnnotations() {
		if (annotations == null) {
			annotations = getAllAnnotationsCalculated();
		}
		return annotations;
	}
	
	
	private Annotation[] getAllAnnotationsCalculated() {
		final Collection<Annotation> values = getAllAnnotationMap().values();
		return values.toArray(new Annotation[0]);
	}
	
	
	public ExtendedAnnotatedClass getAnnotatedClass() {
		return extendedAnnotatedClass;
	}
	
	
	@SuppressWarnings("unchecked")
	public <T extends Annotation> T getAnnotation(final Class<T> annotationClass) {
		return (T) getAllAnnotationMap().get(annotationClass);
	}
	
	
	public Field getField() {
		return field;
	}


	public boolean isAnnotationPresent(  final Class<? extends Annotation> annotationClass) {
		return getAnnotation(annotationClass) != null;
	}	

	

	


}
