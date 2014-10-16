package com.flipkart.logistics.rules.service.impl;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

import com.flipkart.logistics.domain.Counter;
import com.flipkart.logistics.domain.SampleObject;

public class Orchestrator {

	private List<Class<?>> domainKlazzMap;
	
	public Orchestrator() {
		domainKlazzMap = new ArrayList<Class<?>>();
		domainKlazzMap.add(Counter.class);
		domainKlazzMap.add(SampleObject.class);
	}
	
	public List<Class<?>> getSupportedClasses() {
		return domainKlazzMap;
	}
	
	public static void main(String[] args) {
		
		Orchestrator orchestrator = new Orchestrator();
		
		for (Class klazz : orchestrator.getSupportedClasses()) {
			System.out.println(klazz.getName());
			for (Field field : klazz.getDeclaredFields()) {
				System.out.println(field.getName());
			}
		}
		
	}
	
}
