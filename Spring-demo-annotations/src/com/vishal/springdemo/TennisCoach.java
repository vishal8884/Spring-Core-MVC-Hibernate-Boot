package com.vishal.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;

@Component
//@Scope("prototype")
public class TennisCoach implements Coach {
	
	
	    
	

	@Autowired// directly do here insted of setter or costructor injection (called as field injection)
	@Qualifier("restFortuneService") //this is used because multiple are compitating
	private FortuneService fortuneService;
	
	//define default constructors
	
	public TennisCoach()
	{
		System.out.println(" inside default constructor tennis coaach");
	}
	
	
	
//    @Autowired  // Spring will scan for the component(class) that implements fortuneService interface ie:: happyfortuneservice
//	public TennisCoach(FortuneService fortuneService) {
//		this.fortuneService = fortuneService;
//	}
	
//	//define setter method
//	@Autowired  // Spring will scan for the component(class) that implements fortuneService interface ie:: happyfortuneservice
//	public void DoSomeCrazyStuff(FortuneService fortuneService) {   //Autowired will work for any method name
//		this.fortuneService = fortuneService;
//		System.out.println("Inside do some crazy stuff");
//	}

	

	@Override
	public String getDailyWorkout() {
		
		return "Practice your backhand volly";
	}

	
	@Override
	public String getDailyFortune() {

		return fortuneService.getFortune();
	}

	
	
}
