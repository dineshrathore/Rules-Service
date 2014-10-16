package com.flipkart.logistics.rules.impl;

import java.lang.reflect.Field;

import com.flipkart.logistics.rules.ITerm;

/** This class will always get valid field name associated with class **/

public class SimpleTermWithAttribute<T> implements ITerm<T> {  

	Class<T> klazz;
	CLAUSETYPE clauseType;
	Field fieldName;
	
	public SimpleTermWithAttribute(Class<T> klazz, Field field) {
		this.klazz = klazz;
		this.clauseType = CLAUSETYPE.FIELD;
		this.fieldName = field;
	}

	public Class<T> getClassObject() {
		return klazz;
	}

	public CLAUSETYPE getClauseType() {
		return CLAUSETYPE.FIELD;
	}

	public Object getClause() {
		return fieldName;
	}
	
}
