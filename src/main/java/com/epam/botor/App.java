package com.epam.botor;

import com.epam.botor.domain.Jedi;

/**
 * Start Wars App
 *
 */
public class App {
	public static void main(String[] args) {
		Jedi jedi = new Jedi();
		System.out.println(jedi.fight());
	}
}
