package com.epam.botor.domain;

import java.beans.ConstructorProperties;

public class Jedi extends Person {
    private LightSabre lightsabre;
    
    private Jedi bestFriend;
    
    @ConstructorProperties( { "name", "gender"})
    public Jedi(String name, Gender gender) {
    	super(name, gender);
    	this.bestFriend = null;
    }
    
    public void setBestFriend(Jedi bestFriend) {
		this.bestFriend = bestFriend;
	}

    
    public void setLightsabre(LightSabre lightsabre) {
		this.lightsabre = lightsabre;
	}


	@Override
	public String toString() {
		return "Jedi [lightsabre=" + lightsabre + ", bestFriend=" + (bestFriend == null ? "none" : bestFriend.getName()) + ", getName()=" + getName() + "]";
	}

	@Override
	public String fight() {
        return lightsabre.hit();
    }

    public LightSabre createLightSabre(String name) {
    	return new LightSabre(getName() + " - " + name, 100);
    }
    
    
}
