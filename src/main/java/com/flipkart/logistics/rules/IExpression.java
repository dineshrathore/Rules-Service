package com.flipkart.logistics.rules;

public interface IExpression<T> {
	
	public enum OPERATION {
		EQUALS("="), NOTEQUALS("!="), CONTAINS("has"), IN("in");
		String name;
		private OPERATION(String name) {
			this.name = name;
		}
	}
	
	public ITerm<T> getTerm();
	public OPERATION getOperation();
	public IValue getValue();
}
