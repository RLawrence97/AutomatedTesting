package com.qa.Automaton;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShoppingFrontPage {
	@FindBy(id = "search_query_top")
	private WebElement search;
	
	public void searchTerm(String incSearch) {
		search.sendKeys(incSearch);
		search.submit();
	}
}
