package com.luv2code.springdemo.mvc;

import java.util.LinkedHashMap;

public class Student {
	
	private String firstName;
	private String lastName;
	private String country;
	
	private LinkedHashMap<String,String> countryOptions;
	
	private String favourateLanguage;
	
	 private LinkedHashMap<String, String> favoriteLanguageOptions;
	 
	 private String[] operatingSystems;
	
	public Student()
	{
		//populate contry optios : used ISO country code
		countryOptions = new LinkedHashMap<>();
		
		countryOptions.put("BR","Brazil");
		countryOptions.put("FR","France");
		countryOptions.put("DE","Germany");
		countryOptions.put("IN","India");
		countryOptions.put("US","United states");
		
		/////////
		
		// populate favorite language options
				favoriteLanguageOptions = new LinkedHashMap<>();

				// parameter order: value, display label
				//
				favoriteLanguageOptions.put("Java", "Java");
				favoriteLanguageOptions.put("C#", "C#");
				favoriteLanguageOptions.put("PHP", "PHP");
				favoriteLanguageOptions.put("Ruby", "Ruby");
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	
	public LinkedHashMap<String, String> getCountryOptions() {
		return countryOptions;
	}

	
	
	public String getFavourateLanguage() {
		return favourateLanguage;
	}

	public void setFavourateLanguage(String favourateLanguage) {
		this.favourateLanguage = favourateLanguage;
	}
	
	public LinkedHashMap<String, String> getFavoriteLanguageOptions() {
        return favoriteLanguageOptions;
    }
	
	

	public String[] getOperatingSystems() {
		return operatingSystems;
	}

	public void setOperatingSystems(String[] operatingSystems) {
		this.operatingSystems = operatingSystems;
	}

	@Override
	public String toString() {
		return "Student [firstName=" + firstName + ", lastName=" + lastName + "]";
	}
	
	
	

}
