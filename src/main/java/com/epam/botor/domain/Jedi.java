package com.epam.botor.domain;

import java.beans.ConstructorProperties;

public class Jedi extends Person {
    private LightSabre lightsabre;

    @ConstructorProperties( { "name", "gender"})
    public Jedi(String name, Gender gender) {
        super(name, gender);
    }
    
    public void setLightsabre(LightSabre lightsabre) {
		this.lightsabre = lightsabre;
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
