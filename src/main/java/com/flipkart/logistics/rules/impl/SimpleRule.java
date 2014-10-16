package com.flipkart.logistics.rules.impl;

import com.flipkart.logistics.rules.IDirective;
import com.flipkart.logistics.rules.IPredicate;
import com.flipkart.logistics.rules.IRule;

public class SimpleRule<T> implements IRule {

	IPredicate predicate;
	IDirective action;
	
	public SimpleRule(Class<T> klazz, String fieldName, Integer value) {
		predicate = new SimplePredicate<T>(klazz, fieldName, value);
	}

	public IPredicate getPredicate() {
		return predicate;
	}

	public IDirective getDirective() {
		return action;
	}
	
}
