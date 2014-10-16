package com.flipkart.logistics.rules;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public interface ITerm<T> {
	
	public enum CLAUSETYPE {
		FIELD(Field.class), METHOD(Method.class);
		Class<?> clauseType;
		CLAUSETYPE(Class<?> clauseType) {
			this.clauseType = clauseType;
		}
	}
	
	Class<T> getClassObject();
	CLAUSETYPE getClauseType();
	Object getClause();
}
