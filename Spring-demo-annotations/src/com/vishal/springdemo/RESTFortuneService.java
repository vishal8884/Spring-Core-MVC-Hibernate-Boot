package com.vishal.springdemo;

import java.util.Random;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("restFortuneService") //restFortuneService will be name of qualifier if used
public class RESTFortuneService implements FortuneService {

	@Value("${foo.email}")
	private String email;
	
	@Value("${foo.name}")
	private String teamName;
	
	
	
	
	private Random random = new Random();
	
	@Override
	public String getFortune() {
		
		String[] data = {email , teamName};
		int index = random.nextInt(data.length);
		
		String fortune = data[index];
		return fortune;
	}


}
