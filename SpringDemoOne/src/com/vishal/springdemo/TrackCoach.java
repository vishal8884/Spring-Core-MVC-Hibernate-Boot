package com.vishal.springdemo;

public class TrackCoach implements Coach {

	FortuneService fortuneService;
	
	
	
	public TrackCoach() {
	}

	public TrackCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		
		return "Ran a hard 5k";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}
	
	//add an init method
	public void doStarUpStuff()
	{
		System.out.println("TrackCoach : inside method doMyStartUpstuff");
	}
	
	
	//add a destroy method
	public void doMyCleanUpStuff()
	{
		System.out.println("TrackCoach: inside method doMyCleanupStuuff");
	}

}









