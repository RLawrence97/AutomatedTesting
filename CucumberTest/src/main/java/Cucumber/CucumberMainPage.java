package Cucumber;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CucumberMainPage {
	
	@FindBy(linkText = "Menu")
	private WebElement menuButton;
	
	@FindBy(linkText = "Check Out")
	private WebElement checkoutButton;

	public boolean clickMenu() {
		try {
			menuButton.click();
			return true;
		} catch (Exception e) {
			System.out.println(e);
			return false;
		}
	}

	public boolean clickCheckout() {
		try {
			checkoutButton.click();
			return true;
		} catch (Exception e) {
			return false;
		}
	}
}
