package com.pages;

import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePage {

	private WebDriver driver;

	// Creating constructor
	public HomePage(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.LINK_TEXT, using = "Sign in")
	public static WebElement sign_in;

	@FindBy(how = How.LINK_TEXT, using = "Contact us")
	public static WebElement contact_us;

	@FindBy(how = How.LINK_TEXT, using = "Sign out")
	public static WebElement sign_out;

	@FindBy(how = How.CSS, using = ".logo.img-responsive")
	public static WebElement clickOnLogo;

	@FindBy(how = How.XPATH, using = ".//*[@class='products']/dt[starts-with(@data-id,'cart_block_product_')]/div/span")
	public static WebElement priceOnCart;

	public static class HeaderPage {

		@FindBy(how = How.LINK_TEXT, using = "Women")
		public static WebElement menu_women;

		@FindBy(how = How.XPATH, using = ".//*[@id='block_top_menu']/ul/li[2]/a")
		public static WebElement menu_dresses;

		@FindBy(how = How.XPATH, using = ".//*[@id='block_top_menu']/ul/li[3]/a")
		public static WebElement menu_tshirts;

		@FindBy(how = How.CSS, using = "#block_top_menu>ul>li:nth-of-type(2)>ul>li:nth-of-type(3)>a")
		public static WebElement subMenuSummerDress;

		@FindBy(how = How.CSS, using = "#block_top_menu>ul>li:nth-of-type(2)>ul>li:nth-of-type(2)>a")
		public static WebElement subMenuEveningDress;

		@FindBy(how = How.CSS, using = "#block_top_menu>ul>li:nth-of-type(2)>ul>li:nth-of-type(1)>a")
		public static WebElement subMenuCasualDress;

		@FindBy(how = How.CSS, using = ".shopping_cart>a")
		public static WebElement moveToCart;

		@FindBy(how = How.CSS, using = ".cart_block_product_name")
		public static List<WebElement> productTitleInMiniCart;

		@FindBy(how = How.CSS, using = "dt>div>.price")
		public static List<WebElement> productPriceInMiniCart;

		@FindBy(how = How.CSS, using = ".price.cart_block_total.ajax_block_cart_total")
		public static WebElement totalPrice;

		public static class DressesPage {

			@FindBy(how = How.XPATH, using = "//*a[@title='Summer Dresses']")
			public static WebElement summer_dresses;

		}

	}

	public static class BobyPage {

		@FindBy(how = How.CSS, using = "#homefeatured>li:nth-of-type(1)")
		public static WebElement shortSleeveTShirt;

		@FindBy(how = How.CSS, using = "#homefeatured>li:nth-of-type(1)>div>div:nth-of-type(2)>h5>a")
		public static WebElement shortSleeveTShirtProductTitle;

		@FindBy(how = How.CSS, using = "#homefeatured>li:nth-of-type(1)>div>div:nth-of-type(2)>div:nth-of-type(2)>a:nth-of-type(2)>span")
		public static WebElement shortSleeveTShirtDetails;

		@FindBy(how = How.CSS, using = "#homefeatured>li:nth-of-type(1)>div>div:nth-of-type(2)>div:nth-of-type(2)>a:nth-of-type(1)>span")
		public static WebElement shortSleeveTShirtAddToCart;

		@FindBy(how = How.CSS, using = "#homefeatured>li:nth-of-type(2)")
		public static WebElement blouse;

		@FindBy(how = How.CSS, using = "#homefeatured>li:nth-of-type(2)>div>div:nth-of-type(2)>div:nth-of-type(2)>a:nth-of-type(2)>span")
		public static WebElement blouseDetails;

		@FindBy(how = How.CSS, using = "#homefeatured>li:nth-of-type(2)>div>div:nth-of-type(2)>div:nth-of-type(2)>a:nth-of-type(1)>span")
		public static WebElement blouseAddToCart;

		@FindBy(how = How.CSS, using = "#homefeatured>li:nth-of-type(2)>div>div:nth-of-type(2)>h5>a")
		public static WebElement blouseProducTitle;

		@FindBy(how = How.CSS, using = "#homefeatured>li:nth-of-type(3)")
		public static WebElement printedDress;

		@FindBy(how = How.CSS, using = "#homefeatured>li:nth-of-type(3)>div>div:nth-of-type(2)>div:nth-of-type(2)>a:nth-of-type(2)>span")
		public static WebElement printedDressDetails;

		@FindBy(how = How.CSS, using = "#homefeatured>li:nth-of-type(4)")
		public static WebElement printedDress2;

		@FindBy(how = How.CSS, using = "#homefeatured>li:nth-of-type(4)>div>div:nth-of-type(2)>div:nth-of-type(2)>a:nth-of-type(2)>span")
		public static WebElement printedDress2Details;

		@FindBy(how = How.CSS, using = "#homefeatured>li:nth-of-type(5)")
		public static WebElement printedSummerDress;

		@FindBy(how = How.CSS, using = "#homefeatured>li:nth-of-type(5)>div>div:nth-of-type(2)>div:nth-of-type(2)>a:nth-of-type(2)>span")
		public static WebElement printedSummerDressDetails;

		@FindBy(how = How.CSS, using = "#homefeatured>li:nth-of-type(6)")
		public static WebElement printedSummerDress2;

		@FindBy(how = How.CSS, using = "#homefeatured>li:nth-of-type(6)>div>div:nth-of-type(2)>div:nth-of-type(2)>a:nth-of-type(2)>span")
		public static WebElement printedSummerDress2Details;

		@FindBy(how = How.CSS, using = "#homefeatured>li:nth-of-type(7)")
		public static WebElement printedChiffonDress;

		@FindBy(how = How.CSS, using = "#homefeatured>li:nth-of-type(5)>div>div:nth-of-type(2)>div:nth-of-type(2)>a:nth-of-type(2)>span")
		public static WebElement printedChiffonDressDetails;

		@FindBy(how = How.CSS, using = "btn.btn-default.button.button-medium>span")
		public static WebElement proceedToCheckOut;

		@FindBy(how = How.CSS, using = ".continue.btn.btn-default.button.exclusive-medium>span")
		public static WebElement continueShopping;

		@FindBy(how = How.CSS, using = ".cross")
		public static WebElement closeWindow;

	}

}
