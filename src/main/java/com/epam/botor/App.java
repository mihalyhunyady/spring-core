package com.epam.botor;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.epam.botor.domain.Jedi;
import com.epam.botor.domain.Trooper;

/**
 * Start Wars App
 *
 */
public class App {
	public static void main(String[] args) {
		try (AbstractApplicationContext context = new ClassPathXmlApplicationContext("beans.xml")) {
			Jedi jedi = context.getBean("odanUrr", Jedi.class);

			System.out.println(jedi.fight());
			
			System.out.println(jedi.getIdentityHashCode());
			System.out.println(context.getBean("odanUrr", Jedi.class).getIdentityHashCode());
		
			Trooper trooper = context.getBean("trooper", Trooper.class);
			System.out.println(trooper.getName() + ": " + trooper.getIdentityHashCode());
			trooper = context.getBean("trooper", Trooper.class);
			System.out.println(trooper.getName() + ": " + trooper.getIdentityHashCode());
			
			trooper = context.getBean("trooper2", Trooper.class);
			System.out.println(trooper.getName() + ": " + trooper.getIdentityHashCode());
			
		}
	}
}
