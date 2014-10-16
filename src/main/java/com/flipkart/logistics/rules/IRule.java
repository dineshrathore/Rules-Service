package com.flipkart.logistics.rules;

/** if <predicate> then directive **/

public interface IRule {
	
	IPredicate getPredicate();
	IDirective getDirective();
}
