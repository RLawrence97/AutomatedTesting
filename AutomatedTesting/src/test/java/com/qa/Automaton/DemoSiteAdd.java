package com.qa.Automaton;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DemoSiteAdd {
	@FindBy(name = "username")
	private WebElement user;
	@FindBy(name = "password")
	private WebElement pass;
	@FindBy(name = "FormsButton2")
	private WebElement submit;
	
	public void addUser(String userIn, String passIn) {
		user.sendKeys(userIn);
		pass.sendKeys(passIn);
		submit.click();
	}
}
