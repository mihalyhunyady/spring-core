package com.epam.botor;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.epam.botor.domain.Jedi;

/**
 * Start Wars App
 *
 */
public class App {
	public static void main(String[] args) {
		try (AbstractApplicationContext context = new ClassPathXmlApplicationContext("beans.xml")) {
			Jedi jedi = context.getBean("odanUrr", Jedi.class);

			System.out.println(jedi.fight());
		}
	}
}
