package com.bhargav.spring.sample.controller;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class SpringApplicationContext implements ApplicationContextAware{

	private static ApplicationContext context=null;
	
	public static ApplicationContext getInstance()
	{
		return context;
	}

	@SuppressWarnings("static-access")
	@Override
	public void setApplicationContext(ApplicationContext arg0)
			throws BeansException {
		// TODO Auto-generated method stub
		this.context = arg0;
	}
	
}
