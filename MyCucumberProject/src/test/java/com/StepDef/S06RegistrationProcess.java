package com.StepDef;

import java.util.List;
import java.util.Map;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class S06RegistrationProcess {
	@Given("Launch registration page")
	public void launch_registration_page() {
	    System.out.println("Launching Registration Page");
	}

	@When("I pass the data as follows")
	public void i_pass_the_data_as_follows(io.cucumber.datatable.DataTable dataTable) {
	    System.out.println(dataTable);
	    
	    List<List<String>>data = dataTable.asLists();
	    for(List<String> d : data)
	    	System.out.println(d);
	    
	    for(List<String> d : data)
	    {
	    	for(String d1 : d)
	    		System.out.println(d1);
	    }
	}

	@Then("Registration success")
	public void registration_success() {
	    System.out.println("Registration was successful");
	}
	
	
	@When("I Enter the data as follows")
	public void i_enter_the_data_as_follows(io.cucumber.datatable.DataTable dataTable) {
		List<Map<String, String>>data = dataTable.asMaps();
		
		for(Map<String, String> d : data)
			System.out.println(d);
		
		System.out.println();
		
		for(Map<String, String> d : data)
		{
			System.out.println("First Name: " + d.get("FirstName"));
			System.out.println("Last Name : " + d.get("LastName"));
			System.out.println("Email Id  : " + d.get("EmailId"));
			System.out.println("Gender    : " + d.get("Gender"));
			System.out.println("Contact No: " + d.get("MobileNo"));
			System.out.println();
		}
	}

	@Then("Registration will successful")
	public void registration_will_successful() {
		
	}
}
