package com.epam.botor;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.epam.botor.domain.Army;
import com.epam.botor.domain.BlasterPistol;
import com.epam.botor.domain.FighterType;
import com.epam.botor.domain.Jedi;
import com.epam.botor.domain.Person;
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
		
			Trooper trooper = context.getBean("trooper", Trooper.class);
			LOGGER.debug(trooper.getName() + ": " + trooper.getIdentityHashCode());
			trooper = context.getBean("trooper", Trooper.class);
			LOGGER.debug(trooper.getName() + ": " + trooper.getIdentityHashCode());
			
			trooper = context.getBean("trooper2", Trooper.class);
			LOGGER.debug(trooper.getName() + ": " + trooper.getIdentityHashCode());
		
			LOGGER.debug("" + context.getBean("odanUrrLightSabre"));
			
			LOGGER.debug("" + context.getBean("mace"));
			
			LOGGER.debug("Total memory: " + context.getBean("runtime", Runtime.class).totalMemory());
			LOGGER.debug("" + context.getBean("johan"));
			List<Person> fighters = context.getBean("lightArmy", Army.class).getFighters();
			LOGGER.debug("" + fighters + " " + fighters.getClass());
			LOGGER.debug("" + (fighters.get(0) == fighters.get(1)));
			
			LOGGER.debug("" + context.getBean("trooper3"));
			LOGGER.debug("" + context.getBean("odanUrr", Jedi.class));
			
			LOGGER.debug("" + context.getBean("defaultLightSabre"));
			LOGGER.debug("" + context.getBean("ageOfTrooper3"));
			LOGGER.debug("" + context.getBean("obi"));
			
			LOGGER.debug("" + context.getBean(BlasterPistol.class));
			LOGGER.debug("" + context.getBean(BlasterPistol.class));
			LOGGER.debug("" + context.getBean(BlasterPistol.class));
		}
	}
}
