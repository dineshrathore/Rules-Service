package com.flipkart.logistics.rules;

import java.util.List;
import java.util.Map;

public interface IValue {

	public enum VALUETYPE {
		INTEGER(Integer.class), FLOAT(Float.class), DOUBLE(Double.class), SET(Map.class), LIST(List.class);
		Class<?> valueType;
		private VALUETYPE(Class<?> valueType) {
			this.valueType = valueType;
		}
	}
	
}
