package com.epam.botor;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.epam.botor.domain.Jedi;

/**
 * Start Wars App
 *
 */
public class App {
	public static void main(String[] args) {
		BeanFactory factory = 
				new XmlBeanFactory(new ClassPathResource("beans.xml"));

		Jedi jedi = factory.getBean("odanUrr", Jedi.class);

    
		System.out.println(jedi.fight());
	}
}
