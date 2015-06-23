package com.stepdefinations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.actions.ContactUsAction;
import com.common.SharedDriver;
import com.pages.ContactUsPage;
import com.pages.HomePage;

import cucumber.api.java.en.*;
/**
 * 
 * @author Biswajit
 *
 */
public class ContactUsStepDef {
	
	public WebDriver driver;

	public ContactUsStepDef(SharedDriver driver) {
		this.driver = driver;
	}

	
	@Given("^I am in the contactus page$")
	public void i_am_in_the_contactus_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		PageFactory.initElements(driver, HomePage.class);
		PageFactory.initElements(driver, HomePage.BobyPage.class);
		PageFactory.initElements(driver, HomePage.HeaderPage.class);
		PageFactory.initElements(driver, ContactUsPage.class);
		driver.get("http://automationpractice.com/index.php");
		ContactUsAction.moveToContactUsPage();
	}

	@When("^I enter \"(.*?)\" form dropdown$")
	public void i_enter_form_dropdown(String subjectheading) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		PageFactory.initElements(driver, ContactUsPage.class);
		ContactUsAction.subjectHeading(subjectheading);
	}

	@When("^I enter \"(.*?)\" in email field$")
	public void i_enter_in_email_field(String email) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		PageFactory.initElements(driver, ContactUsPage.class);
		ContactUsAction.email(email);
	}

	@When("^I enter \"(.*?)\" in order field$")
	public void i_enter_in_order_field(String orderreferance) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		PageFactory.initElements(driver, ContactUsPage.class);
		ContactUsAction.orderReferance(orderreferance);
	}

	@When("^I enter \"(.*?)\" in text area$")
	public void i_enter_in_text_area(String message) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		PageFactory.initElements(driver, ContactUsPage.class);
		ContactUsAction.message(message);
	}

	@When("^I click on send$")
	public void i_click_on_send() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		PageFactory.initElements(driver, ContactUsPage.class);
		ContactUsAction.clickSend();
	}

	@Then("^I should a success message$")
	public void i_should_a_success_message() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	
	}

}
