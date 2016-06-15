package com.epam.botor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.epam.botor.domain.Jedi;
import com.epam.botor.domain.Trooper;

/**
 * Start Wars App
 *
 */
public class App {
	private static final Logger LOGGER = LoggerFactory.getLogger(App.class);
	
	public static void main(String[] args) {
		
		try (AbstractApplicationContext context = new ClassPathXmlApplicationContext("beans.xml")) {
			Jedi jedi = context.getBean("odanUrr", Jedi.class);

			LOGGER.debug(jedi.fight());
			
			LOGGER.debug("" + jedi.getIdentityHashCode());
			LOGGER.debug("" + context.getBean("odanUrr", Jedi.class).getIdentityHashCode());
		
			Trooper trooper = context.getBean("trooper", Trooper.class);
			LOGGER.debug(trooper.getName() + ": " + trooper.getIdentityHashCode());
			trooper = context.getBean("trooper", Trooper.class);
			LOGGER.debug(trooper.getName() + ": " + trooper.getIdentityHashCode());
			
			trooper = context.getBean("trooper2", Trooper.class);
			LOGGER.debug(trooper.getName() + ": " + trooper.getIdentityHashCode());
		
			LOGGER.debug("" + context.getBean("odanUrrLightSabre"));
		}
	}
}
