package com.epam.botor.domain;

public class Jedi {
    private final LightSabre lightsabre;

    public Jedi(LightSabre lightSabre) {
        this.lightsabre = lightSabre;
    }

    public String fight() {
        return lightsabre.hit();
    }

}
