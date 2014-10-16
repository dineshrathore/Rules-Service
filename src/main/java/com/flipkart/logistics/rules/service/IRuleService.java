package com.flipkart.logistics.rules.service;

import java.util.List;

import com.flipkart.logistics.rules.IRule;

public interface IRuleService<T> {
	/** Fetch rules for a class **/
	List<IRule> fetchRulesFor(Class<T> klazz);
}
