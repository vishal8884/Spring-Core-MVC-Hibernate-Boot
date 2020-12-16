package com.vishal.springdemo;

public class MyApp {

	public static void main(String[] args) {

		//create the object
		
		Coach theCoach = new TrackCoach();  // not configurable so we use spring 
		
		System.out.println(theCoach.getDailyWorkout());
		
		
		
		//from here my own test for understanding
		HappyFortuneService s = new HappyFortuneService();
		
		TrackCoach c = new TrackCoach(s);
		
		System.out.println(c.getDailyFortune()+" :: test");
		
	}

}
