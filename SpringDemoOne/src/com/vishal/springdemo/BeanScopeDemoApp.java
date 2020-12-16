package com.vishal.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {
		
		// load the spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
		
		
		//retrive bean from spring container
		Coach theCoach = context.getBean("myCoach",Coach.class);
		
		Coach alphaCoach = context.getBean("myCoach",Coach.class);
		
		
		//check if they are same beans
		
		boolean result = (theCoach == alphaCoach);
		
		System.out.println("\nPointing to same object :: "+result);
        
		System.out.println("Memory location of theCoach :: "+theCoach);
		System.out.println("Memory location of theCoach :: "+alphaCoach);
	}

}
