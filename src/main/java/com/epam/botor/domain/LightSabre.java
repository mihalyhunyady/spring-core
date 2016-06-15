package com.epam.botor.domain;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class LightSabre implements InitializingBean, DisposableBean {

	private final String name;
	private final int damage;
	private final Color color;
	
	public LightSabre(String name, int damage) {
		this(name, damage, null);
	}

	
	public LightSabre(String name, int damage, Color color) {
		super();
		this.name = name;
		this.damage = damage;
		this.color = color;
	}


	public String hit() {
		return "ZZzzzzzzzzzz";
	}

	

	@Override
	public String toString() {
		return "LightSabre [name=" + name + ", damage=" + damage + ", color=" + color + "]";
	}


	@Override
	public void destroy() throws Exception {
		System.out.println("destroy()");
		
	}
	
	@PostConstruct
	public void init() {
		System.out.println("init()");
	}

	public void destroy2() {
		System.out.println("destroy2() (xml)");
	}

	
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("afterPropertiesSet()");
		
	}
	
//	@PostConstruct
//	public void postConstruct() {
//		System.out.println("postConstruct()");
//	}
	
	@PreDestroy
	public void preDestroy() {
		System.out.println("preDestroy()");
	}
	
}
