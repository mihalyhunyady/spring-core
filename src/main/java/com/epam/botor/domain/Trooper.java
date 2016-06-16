package com.epam.botor.domain;

public class Trooper extends Person {

	private int age;
	
	public Trooper(String name, Gender gender) {
		super(name, gender);
		
	}

	

	
	@Override
	public String toString() {
		return "Trooper [age=" + age + ", getName()=" + getName() + "]";
	}




	public static Trooper maleTrooperFactory(String name) {
		return new Trooper(name, Gender.MALE);
	}

	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String fight() {
		return "Trooper fighting";
	}
	
	
	
	
}
