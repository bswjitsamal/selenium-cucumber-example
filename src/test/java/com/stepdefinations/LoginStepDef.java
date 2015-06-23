package com.stepdefinations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.actions.SignInAction;
import com.common.SharedDriver;
import com.pages.HomePage;
import com.pages.LoginPage;

import cucumber.api.java.en.*;
/**
 * 
 * @author Biswajit
 *
 */
public class LoginStepDef {

	public WebDriver driver;

	public LoginStepDef(SharedDriver driver) {
		this.driver = driver;
	}

	@Given("^I am in the login page$")
	public void i_am_in_the_login_page() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		driver.get("http://automationpractice.com/index.php");
	}

	@When("^I enter valid credentials$")
	public void i_enter_valid_credentials() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		PageFactory.initElements(driver, HomePage.class);
		PageFactory.initElements(driver, HomePage.HeaderPage.class);
		PageFactory.initElements(driver, LoginPage.class);
		PageFactory.initElements(driver, HomePage.BobyPage.class);

		SignInAction.execute();
	}

	@Then("^I see the dashboard page$")
	public void i_see_the_dashboard_page() throws Throwable {
		// Write code here that turns the phrase above into concrete actions

	}

}
