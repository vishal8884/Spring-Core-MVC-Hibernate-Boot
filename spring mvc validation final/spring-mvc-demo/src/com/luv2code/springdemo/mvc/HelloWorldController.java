package com.luv2code.springdemo.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/hello") 
public class HelloWorldController {

	//need a controller method show initial form
	
	@RequestMapping("/showForm") //  /hello/showForm because we have global as /hello
	public String showForm()
	{
		return "helloworld-form";
	}
	
	// need to process form
	@RequestMapping("/processForm")
	public String processForm()
	{
		return "helloworld";
	}
	
	// new a controller method to read data
	//add data to model
	@RequestMapping("/processFormVersionTwo")
	public String letsShoutDude(HttpServletRequest request, Model model)
	{
		//read the request parameter from HTML form
		String theName= request.getParameter("studentName");
		//convert the data to all caps
		theName = theName.toUpperCase();
		//create he message
		String result = "Yo "+ theName;
		//add message to the model
		
		model.addAttribute("message", result);
		return "helloworld";
	}
	
	
	@RequestMapping("/processFormVersionThree")
	public String ProcessFormVersion3(@RequestParam("studentName") String theName  , 
			Model model)
	{
		 
		theName = theName.toUpperCase();
		//create he message
		String result = "Hello my friend "+ theName;
		//add message to the model
		
		model.addAttribute("message", result);
		return "helloworld";
	}
	
	
	
}
