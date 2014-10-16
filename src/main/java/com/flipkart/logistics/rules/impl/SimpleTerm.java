package com.flipkart.logistics.rules.impl;

import java.lang.reflect.Field;

import com.flipkart.logistics.rules.ITerm;

/** This class will always get valid field name associated with class **/

public class SimpleTerm<T> implements ITerm {  

	Class<T> klazz;
	Field fieldName;
	
	public SimpleTerm(Class<T> klazz, Field field) {
		this.klazz = klazz;
		this.fieldName = field;
	}
	
}
