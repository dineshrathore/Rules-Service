package com.flipkart.logistics.rules.impl;

import com.flipkart.logistics.rules.IValue;

public class ValueInteger implements IValue {

	Integer value;
	
	public ValueInteger(Integer value) {
		this.value = value;
	}
	
}
