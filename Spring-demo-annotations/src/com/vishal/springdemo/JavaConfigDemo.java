package com.vishal.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JavaConfigDemo {
	
public static void main(String[] args) {

		
		//read spring config java class
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);
		
		//get the bean from spring container
		
		Coach theCoach = context.getBean("tennisCoach", Coach.class);
		
		//call a methid on the bean
		
		System.out.println(theCoach.getDailyWorkout());
		
		System.out.println(theCoach.getDailyFortune());
		
		
		//close the context
		context.close();
		
	}

}
