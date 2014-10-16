package com.flipkart.logistics.rules.impl;

import com.flipkart.logistics.rules.IExpression;
import com.flipkart.logistics.rules.IPredicate;

public class SimplePredicate<T> implements IPredicate {

	IExpression expression;
	
	public SimplePredicate(Class<T> klazz, String fieldName, Integer value) {
		expression = new SimpleExpression<T>(klazz, fieldName, value);
	}
	
}
