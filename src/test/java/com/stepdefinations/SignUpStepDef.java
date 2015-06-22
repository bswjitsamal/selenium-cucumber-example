package com.stepdefinations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.actions.SignUpAction;
import com.common.SharedDriver;
import com.pages.HomePage;
import com.pages.LoginPage;
import com.pages.SignUpPage;

import cucumber.api.java.en.*;

public class SignUpStepDef {
	
	public WebDriver driver;

	public SignUpStepDef(SharedDriver driver) {
		this.driver = driver;
	}

	@Given("^I am in the automationpractice web page$")
	public void i_am_in_the_automationpractice_web_page() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
         driver.get("http://automationpractice.com/index.php");
	}

	@When("^I move to register page$")
	public void i_move_to_register_page() throws Throwable {
		
		// Write code here that turns the phrase above into concrete actions
		
		PageFactory.initElements(driver, HomePage.class);
		PageFactory.initElements(driver, HomePage.BobyPage.class);
		PageFactory.initElements(driver, HomePage.HeaderPage.class);
		PageFactory.initElements(driver, LoginPage.class);
		PageFactory.initElements(driver, SignUpPage.class);
		
		SignUpAction.execute();

	}

	@When("^Enter valid credentials then hit submit$")
	public void enter_valid_credentials_then_hit_submit() throws Throwable {
		// Write code here that turns the phrase above into concrete actions

	}

	@Then("^user should register successfully$")
	public void user_should_register_successfully() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		
		//Assert.assertTrue(condition);

	}

}
