package com.vishal.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {

		//load the spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//retrive bean from spring container
		Coach theCoach = context.getBean("myCoach",Coach.class);  //myCoach is id in applicationContext.xml file
		//call methods on the bean
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());
		//close the context
		

		context.close();
		
	}

}











//FortuneService f  = context.getBean("myFortune",FortuneService.class); 
//System.out.println(f.getFortune());