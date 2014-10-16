package com.flipkart.logistics.rules;

import java.lang.reflect.Field;

public interface ITerm<T> {
	Class<T> getClassObject();
	Field getFieldName();
}
