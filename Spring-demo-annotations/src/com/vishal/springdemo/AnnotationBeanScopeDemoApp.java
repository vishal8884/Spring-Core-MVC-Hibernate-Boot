package com.vishal.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {

	public static void main(String[] args) {
		
      //load spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		
	  //retrive bean from spring container
		
		Coach theCoach = context.getBean("tennisCoach",Coach.class);
		
		Coach alphaCoach = context.getBean("tennisCoach",Coach.class);
		
	  //checl if they are same
		
		boolean result = (theCoach == alphaCoach);
		
		System.out.println("are they same :: "+result);
		
		System.out.println("memory location of theCoach :: "+theCoach);
		
		System.out.println("memory location of alphaCoach :: "+alphaCoach);
		
		
		//close the context
		
		context.close();
	}

}
