package com.flipkart.logistics.rules;

public interface IRule {
	IPredicate getPredicate();
	IAction getAction();
}
