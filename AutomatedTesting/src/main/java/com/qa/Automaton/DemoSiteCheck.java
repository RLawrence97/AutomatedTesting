package com.qa.Automaton;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DemoSiteCheck {
	@FindBy(name = "username")
	private WebElement user;
	@FindBy(name = "password")
	private WebElement pass;
	@FindBy(name = "FormsButton2")
	private WebElement submit;
	
	@FindBy(xpath = "/html/body/table/tbody/tr/td[1]/big/blockquote/blockquote/font/center/b")
	private WebElement success;
	
	public boolean loginUser(String userIn, String passIn) {
		try {
			user.sendKeys(userIn);
			pass.sendKeys(passIn);
			submit.click();
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	public String getSuccess() {
		return success.getText();
	}
}
