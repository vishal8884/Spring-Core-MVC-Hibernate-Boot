package com.vishal.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
//@ComponentScan("com.vishal.springdemo")
@PropertySource("classpath:sport.properties")
public class SportConfig {

	//define bean for our sad fortune service
	
	@Bean
	public FortuneService restFortuneService()  //bean id will be sadFortuneService
	{
		return new RESTFortuneService();
	}
	
	
	//define bean for our swim coach AND inject dependency
	@Bean
	public Coach swimCoach()
	{
		return new SwimCoach(restFortuneService() );  //sadFortuneService dependency is injected here
	}
	
	
	
}
