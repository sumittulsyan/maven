package com.qa.stepdefinition;

import com.qa.pages.RegisterPage;
import com.qa.util.TestBase;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class stepdefinition extends TestBase {

	
	
	@When("^I tap on register button$")
	public void i_tap_on_register_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		RegisterPage rp= new RegisterPage(driver);
		rp.register();
	
	}

	@Then("^I enter first name$")
	public void i_enter_first_name() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		RegisterPage rp= new RegisterPage(driver);
		rp.first("Sumit");
	}

	@Then("^I enter last name$")
	public void i_enter_last_name() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		RegisterPage rp= new RegisterPage(driver);
		rp.lastname("Tulsyan");
	}

}
