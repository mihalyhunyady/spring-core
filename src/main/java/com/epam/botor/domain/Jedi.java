package com.epam.botor.domain;

public class Jedi extends Person {
    private final LightSabre lightsabre;

    public Jedi(String name, Gender gender, LightSabre lightSabre) {
        super(name, gender);
    	this.lightsabre = lightSabre;
    }

    public String fight() {
        return lightsabre.hit();
    }

    public LightSabre createLightSabre(String name) {
    	return new LightSabre(getName() + " - " + name, 100);
    }
}
