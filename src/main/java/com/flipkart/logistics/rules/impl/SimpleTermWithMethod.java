package com.flipkart.logistics.rules.impl;

import java.lang.reflect.Method;

import com.flipkart.logistics.rules.ITerm;

public class SimpleTermWithMethod<T> implements ITerm<T> {

	Class<T> klazz;
	CLAUSETYPE clauseType;
	Method methodName;
	
	public SimpleTermWithMethod(Class<T> klazz, Method method) {
		this.klazz = klazz;
		this.clauseType = CLAUSETYPE.METHOD;
		this.methodName = method;
	}

	public Class<T> getClassObject() {
		return klazz;
	}

	public Method getFieldName() {
		return methodName;
	}

	public CLAUSETYPE getClauseType() {
		return CLAUSETYPE.METHOD;
	}

	public Object getClause() {
		return methodName;
	}
	
}
