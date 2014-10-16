package com.flipkart.logistics.rules.impl;

import com.flipkart.logistics.rules.IAction;
import com.flipkart.logistics.rules.IPredicate;
import com.flipkart.logistics.rules.IRule;

public class SimpleRule<T> implements IRule {

	IPredicate predicate;
	IAction action;
	
	public SimpleRule(Class<T> klazz, String fieldName, Integer value) {
		predicate = new SimplePredicate<T>(klazz, fieldName, value);
	}

	public IPredicate getPredicate() {
		return predicate;
	}

	public IAction getAction() {
		return action;
	}
	
}
