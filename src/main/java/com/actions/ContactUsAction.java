package com.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.pages.ContactUsPage;
import com.pages.HomePage;
import com.utils.Log;

public class ContactUsAction {
	
	private static WebDriver driver;


		public static void moveToContactUsPage(){
			/**
			 * CLICK ON CONTACTUS LINK ON HOME PAGE TO REDIRECT
			 */

			HomePage.contact_us.click();

			/**
			 * ASSERTING WE ARE ON CONTACT US PAGE
			 *//*

			if (driver.getTitle().equals("Contact us - My Store")) {
				Log.info("We are in contact us page");
			} else {
				Log.info("We are not in contact us page");
			}

			*//**
			 * EXPLICIT WAIT
			 *//*

			ExpectedCondition<Boolean> e = new ExpectedCondition<Boolean>() {
				public Boolean apply(WebDriver driver) {
					// ContactUsPage.subjectHeading;
					driver.findElement(By.id("id_contact"));
					return Boolean.valueOf(true);

				}
			};

			WebDriverWait wait = new WebDriverWait(driver, 20);
			wait.until(e);
*/
		}
		
		public static void subjectHeading(String subjectheading){
			
			/**
			 * ENTERING DATA IN FIELDS FORM EXCEL FILE
			 */

			Select select = new Select(ContactUsPage.subjectHeading);
			select.selectByVisibleText(subjectheading);
		}
			
		
		public static void email(String email){
			

			try {
				ContactUsPage.email.clear();
				ContactUsPage.email.sendKeys(email);
				Log.info("Customer Email text box element is found");
			} catch (Exception e1) {
				Log.info("Customer Email text box element is not found");

			}
		}
			
		
		public static void orderReferance(String orderreferance){
			
			try {
				ContactUsPage.idOrder.sendKeys(orderreferance);
				Log.info("Order text box element is found");
			} catch (Exception e1) {
				Log.info("Order text box element is not found");
			}
			
		}
		

		public static void message(String message){
			
			try {
				ContactUsPage.message.sendKeys(message);
				Log.info("Message text are element is found");
			} catch (Exception e1) {
				Log.info("Message text are element is not found");
			}
			
		}
		

		public static void clickSend(){
			try {
				ContactUsPage.submitMessage.click();
				Log.info("Sumbit button element is found");
			} catch (Exception e1) {
				Log.info("Sumbit button element is not found");
			}
		}
			

		

	

}
