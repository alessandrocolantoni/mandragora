package org.milyn.annotation;

import java.util.HashMap;
import java.util.Map;

public class ExtendedAnnotationManager {

	private static Map<Class<?>, ExtendedAnnotatedClass> classToAnnotatedMap = new HashMap<Class<?>, ExtendedAnnotatedClass>();	

	
	public static ExtendedAnnotatedClass getAnnotatedClass(Class<?> theClass){
		ExtendedAnnotatedClass extendedAnnotatedClass = classToAnnotatedMap.get(theClass);
		if (extendedAnnotatedClass == null){
			extendedAnnotatedClass = new ExtendedAnnotatedClassImpl(theClass);
			classToAnnotatedMap.put(theClass, extendedAnnotatedClass);
		}
		return extendedAnnotatedClass;
	}

}
