package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SignUpPage {

	private WebDriver driver;

	public SignUpPage(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.ID, using = "id_gender1")
	public static WebElement titleMr;

	@FindBy(how = How.ID, using = "customer_firstname")
	public static WebElement firstName;

	@FindBy(how = How.ID, using = "customer_lastname")
	public static WebElement lastName;

	@FindBy(how = How.ID, using = "passwd")
	public static WebElement password;

	@FindBy(how = How.ID, using = "days")
	public static WebElement days;

	@FindBy(how = How.ID, using = "months")
	public static WebElement months;

	@FindBy(how = How.ID, using = "years")
	public static WebElement years;

	@FindBy(how = How.ID, using = "firstname")
	public static WebElement myfirstname;

	@FindBy(how = How.ID, using = "lastname")
	public static WebElement mylastname;

	@FindBy(how = How.ID, using = "company")
	public static WebElement mycompany;

	@FindBy(how = How.ID, using = "address1")
	public static WebElement myAddressField1;

	@FindBy(how = How.ID, using = "address2")
	public static WebElement myAddressField2;

	@FindBy(how = How.ID, using = "city")
	public static WebElement myCity;

	@FindBy(how = How.ID, using = "id_state")
	public static WebElement myState;

	@FindBy(how = How.ID, using = "postcode")
	public static WebElement myPostCode;

	@FindBy(how = How.ID, using = "id_country")
	public static WebElement myCountry;

	@FindBy(how = How.ID, using = "phone_mobile")
	public static WebElement myPhone;

	@FindBy(how = How.ID, using = "alias")
	public static WebElement myAliasAddress;

	@FindBy(how = How.ID, using = "submitAccount")
	public static WebElement register;

}
