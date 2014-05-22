package org.milyn.annotation;

import java.lang.reflect.Field;

public interface ExtendedAnnotatedClass extends AnnotatedClass {
	
	public AnnotatedField[] getAnnotatedFields();	

	public AnnotatedField getAnnotatedField(String name);	

	public AnnotatedField getAnnotatedField(Field field);


}
