package com.epam.botor.domain;

import java.beans.ConstructorProperties;

public class Jedi extends Person {
    private final LightSabre lightsabre;

    @ConstructorProperties( { "name", "gender", "lightSabre" })
    public Jedi(String name, Gender gender, LightSabre lightSabre) {
        super(name, gender);
    	this.lightsabre = lightSabre;
    }

    @Override
	public String toString() {
		return "Jedi [lightsabre=" + lightsabre + ", getName()=" + getName() + ", getGender()=" + getGender() + "]";
	}

	public String fight() {
        return lightsabre.hit();
    }

    public LightSabre createLightSabre(String name) {
    	return new LightSabre(getName() + " - " + name, 100);
    }
    
    
}
