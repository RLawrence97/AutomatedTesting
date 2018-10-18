package com.qa.Automaton;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShoppingLandedSolution {
	@FindBy(className="heading-counter")
	private WebElement head;
	
	public String getNumber() {
		return head.getText();
	}
}
