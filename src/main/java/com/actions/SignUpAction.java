package com.actions;

import org.openqa.selenium.support.ui.Select;

import com.pages.HomePage;
import com.pages.LoginPage;
import com.pages.SignUpPage;
import com.utils.Log;


public class SignUpAction {
	
	public static String emailTest= "abc@t.com";
	
	public static void execute() {

			
		HomePage.sign_in.click();
		
		Log.info("Clicking on SignIn link");

		LoginPage.emailCreate.sendKeys(emailTest);
	
		Log.info("Entering an email to register");

		LoginPage.submitCreate.click();
	
		Log.info("Clicking on Register button");

		SignUpPage.titleMr.click();
	
		Log.info("Clicked on Title radio button");

		SignUpPage.firstName.sendKeys("ABC");
	
		Log.info("Enterd first name in the text field");

		SignUpPage.lastName.sendKeys("DEF");
	
		Log.info("Enterd last name in the text field");

		SignUpPage.password.sendKeys("password");
	
		Log.info("Enterd password in the text field");

		Select dropDownDays = new Select(SignUpPage.days);
		dropDownDays.selectByValue("5");
	
		Log.info("Selecting days for Date of birth form the Dropdown");

		Select dropDownMonths = new Select(SignUpPage.months);
		dropDownMonths.selectByVisibleText("August ");
	
		Log.info("Selecting Months for Date of birth form the Dropdown");

		Select dropDownYears = new Select(SignUpPage.years);
		dropDownYears.selectByVisibleText("1984  ");
	
		Log.info("Selecting Years for Date of birth form the Dropdown");

		SignUpPage.myfirstname.sendKeys("Raju");
	
		Log.info("Entering first name for shipping details");

		SignUpPage.mylastname.sendKeys("Singh");
		
		Log.info("Entering last name for shipping details");

		SignUpPage.mycompany.sendKeys("Ubique");
	
		Log.info("Entering company name for shipping details");

		SignUpPage.myAddressField1.sendKeys("Kolkata");
		
		Log.info("Entering address1 for shipping details");

		SignUpPage.myAddressField2.sendKeys("Kolkata");
		
		Log.info("Entering address2 for shipping details");

		SignUpPage.myCity.sendKeys("Kolkata");
		
		Log.info("Entering city for shipping details");

		Select dropDownState = new Select(SignUpPage.myState);
		dropDownState.selectByVisibleText("Nevada");
		
		Log.info("Entering state for shipping details");

		SignUpPage.myPostCode.sendKeys("00000");
		
		Log.info("Entering zip code for shipping details");

		Select dropDownCountry = new Select(SignUpPage.myCountry);
		dropDownCountry.selectByVisibleText("United States");
	
		Log.info("Entering country for shipping details");

		SignUpPage.myPhone.sendKeys("1234567890");
		
		Log.info("Entering Mobile Number for shipping details");

		SignUpPage.myAliasAddress.sendKeys("Kolkata, kestapur");
		
		Log.info("Entering alias address for shipping details");

		SignUpPage.register.click();
		
		Log.info("Clicking on Register button");

	}





}
