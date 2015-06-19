package com.actions;

import org.openqa.selenium.support.ui.Select;

import com.pages.HomePage;
import com.pages.LoginPage;
import com.pages.SignUpPage;
import com.utils.Log;


public class SignUpAction {
	


	 /*
	 * static Random rand = new Random(); static String email =
	 * rand.nextInt(999) + "@test.com";
	 */
	public static String emailTest=null;
	
	public static void execute(String email, String firstName, String lastName,
			String password, String myfirstname, String mylastname,
			String mycompany, String myAddressField1, String myAddressField2,
			String myCity, String myPostCode, String myPhone,
			String myAliasAddress) {

		emailTest=email;
		HomePage.sign_in.click();
		
		Log.info("Clicking on SignIn link");

		LoginPage.emailCreate.sendKeys(email);
	
		Log.info("Entering an email to register");

		LoginPage.submitCreate.click();
	
		Log.info("Clicking on Register button");

		SignUpPage.titleMr.click();
	
		Log.info("Clicked on Title radio button");

		SignUpPage.firstName.sendKeys(firstName);
	
		Log.info("Enterd first name in the text field");

		SignUpPage.lastName.sendKeys(lastName);
	
		Log.info("Enterd last name in the text field");

		SignUpPage.password.sendKeys(password);
	
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

		SignUpPage.myfirstname.sendKeys(myfirstname);
	
		Log.info("Entering first name for shipping details");

		SignUpPage.mylastname.sendKeys(mylastname);
		
		Log.info("Entering last name for shipping details");

		SignUpPage.mycompany.sendKeys(mycompany);
	
		Log.info("Entering company name for shipping details");

		SignUpPage.myAddressField1.sendKeys(myAddressField1);
		
		Log.info("Entering address1 for shipping details");

		SignUpPage.myAddressField2.sendKeys(myAddressField2);
		
		Log.info("Entering address2 for shipping details");

		SignUpPage.myCity.sendKeys(myCity);
		
		Log.info("Entering city for shipping details");

		Select dropDownState = new Select(SignUpPage.myState);
		dropDownState.selectByVisibleText("Nevada");
		
		Log.info("Entering state for shipping details");

		SignUpPage.myPostCode.sendKeys(myPostCode);
		
		Log.info("Entering zip code for shipping details");

		Select dropDownCountry = new Select(SignUpPage.myCountry);
		dropDownCountry.selectByVisibleText("United States");
	
		Log.info("Entering country for shipping details");

		SignUpPage.myPhone.sendKeys(myPhone);
		
		Log.info("Entering Mobile Number for shipping details");

		SignUpPage.myAliasAddress.sendKeys(myAliasAddress);
		
		Log.info("Entering alias address for shipping details");

		SignUpPage.register.click();
		
		Log.info("Clicking on Register button");

	}





}
