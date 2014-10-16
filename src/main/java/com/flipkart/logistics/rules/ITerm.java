package com.flipkart.logistics.rules;

public interface ITerm {

	public enum OPERATION {
		EQUALS("="), NOTEQUALS("!="), CONTAINS("has"), IN("in");
		String name;
		private OPERATION(String name) {
			this.name = name;
		}
	}
	
}
