package com.epam.botor;

import com.epam.botor.domain.Jedi;
import com.epam.botor.domain.LightSabre;

/**
 * Start Wars App
 *
 */
public class App {
	public static void main(String[] args) {
		LightSabre lightSabre = new LightSabre("Slicer", 10);
		Jedi jedi = new Jedi(lightSabre);
		System.out.println(jedi.fight());
	}
}
