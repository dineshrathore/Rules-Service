package com.flipkart.logistics.rules;

public interface IExpression {
	
	public enum OPERATION {
		EQUALS("="), NOTEQUALS("!="), CONTAINS("has"), IN("in");
		String name;
		private OPERATION(String name) {
			this.name = name;
		}
	}
	
	public ITerm getTerm();
	public OPERATION getOperation();
	public IValue getValue();
}
