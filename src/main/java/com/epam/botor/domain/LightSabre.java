package com.epam.botor.domain;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class LightSabre implements InitializingBean, DisposableBean {
	public static final int DEFAULT_DAMAGE = 30;
	
	
	private final String name;
	private final int damage;
	private Color color;
	
	public LightSabre(String name, int damage) {
		this.name = name;
		this.damage = damage;
	}


	public void setColor(Color color) {
		this.color = color;
	}




	public Color getColor() {
		return color;
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
