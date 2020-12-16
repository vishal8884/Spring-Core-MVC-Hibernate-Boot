package com.vishal.springdemo;

public class CricketCoach implements Coach {

	private FortuneService fortuneService;
	
	//add new fields
	
	private String emailAddress;
	private String team;
	
	
	public CricketCoach() {
		System.out.println("Inside constructor :: CricketCoach");
	}

	

	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("Inside setter Fortune method :: CricketCoach");
		this.fortuneService = fortuneService;
	}



	@Override
	public String getDailyWorkout() {
		return "practice fast bowling for 15 min a day";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

	
	
	public String getEmailAddress() {
		return emailAddress;
	}



	public void setEmailAddress(String emailAddress) {
		System.out.println("Inside setter Email :: CricketCoach");
		this.emailAddress = emailAddress;
	}



	public String getTeam() {
		return team;
	}



	public void setTeam(String team) {
		System.out.println("Inside setter team :: CricketCoach");
		this.team = team;
	}
}
