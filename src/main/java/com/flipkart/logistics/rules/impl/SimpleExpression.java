package com.flipkart.logistics.rules.impl;

import java.lang.reflect.Field;

import com.flipkart.logistics.rules.IExpression;
import com.flipkart.logistics.rules.ITerm;
import com.flipkart.logistics.rules.IValue;

public class SimpleExpression<T> implements IExpression {

	ITerm term;
	IValue value;
	
	public SimpleExpression(Class<T> klazz, String fieldName, Integer value) {
		Field field = inspect(klazz, fieldName);
		if (field != null) {
			this.term = new SimpleTerm<T>(klazz, field);
			this.value = new ValueInteger(value);
		}
	}
	
    static <T> Field inspect(Class<T> klazz, String fieldName) {
        Field[] fields = klazz.getDeclaredFields();
        for (Field field : fields) {
        	if (fieldName.equalsIgnoreCase(field.getName())) {
        		return field;
        	}
        }
        return null;
    }
	
}
