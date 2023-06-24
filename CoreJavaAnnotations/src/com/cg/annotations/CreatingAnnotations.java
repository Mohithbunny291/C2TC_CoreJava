package com.cg.annotations;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class CreatingAnnotations {

	public static void main(String[] args) throws IllegalAccessException, InvocationTargetException {

		Cat myCat = new Cat("Stella");
		
		if(myCat.getClass().isAnnotationPresent(WarningFree.class)) {
			System.out.println("Annotated");
		}else {
			System.out.println("No");
		}
		
		for(Method method : myCat.getClass().getDeclaredMethods()) {
			if(method.isAnnotationPresent(RunImmediately.class)) {
				RunImmediately annotation = method.getAnnotation(RunImmediately.class);
				for(int i = 0; i < annotation.times(); i++) {
					method.invoke(myCat);
				}
		
			}
		}
	}

}
