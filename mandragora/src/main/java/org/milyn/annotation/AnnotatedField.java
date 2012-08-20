package org.milyn.annotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

public interface AnnotatedField {
	
	public ExtendedAnnotatedClass getAnnotatedClass();	

	public Field getField();	
	
	
	public boolean isAnnotationPresent(Class<? extends Annotation> annotationClass);	

	public Annotation[] getAllAnnotations();	

	public <T extends Annotation> T getAnnotation(Class<T> annotationClass);	
	


}
