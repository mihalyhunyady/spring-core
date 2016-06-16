package com.epam.botor.domain;

public class Trooper extends Person {

	public Trooper(String name, Gender gender) {
		super(name, gender);
		
	}

	@Override
	public String toString() {
		return "Trooper [getName()=" + getName() + "]";
	}

	
	public static Trooper maleTrooperFactory(String name) {
		return new Trooper(name, Gender.MALE);
	}

	@Override
	public String fight() {
		return "Trooper fighting";
	}
	
	
	
	
}
