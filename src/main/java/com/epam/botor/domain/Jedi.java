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


}
