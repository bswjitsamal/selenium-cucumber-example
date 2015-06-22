package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ContactUsPage {
	


	private WebDriver driver;

	// Creating a constructor
	public ContactUsPage(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.ID, using = "id_contact")
	public static WebElement subjectHeading;

	@FindBy(how = How.ID, using = "email")
	public static WebElement email;

	@FindBy(how = How.ID, using = "id_order")
	public static WebElement idOrder;

	@FindBy(how = How.XPATH, using = ".//*[@class='clearfix']/div[2]/div/textarea")
	public static WebElement message;

	@FindBy(how = How.ID, using = "submitMessage")
	public static WebElement submitMessage;


}
