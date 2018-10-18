package Cucumber;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import static org.junit.Assert.*;

public class TeaStep {
	
	WebDriver driver = null;
	CucumberLandedPage clp;
	CucumberMainPage cmp;
	
	@Before
	public void startup() {
		System.setProperty("webdriver.chrome.driver","C:/Users/Admin/Desktop/chromedriver.exe");
		driver = new ChromeDriver();
		cmp = PageFactory.initElements(driver, CucumberMainPage.class);
		clp = PageFactory.initElements(driver, CucumberLandedPage.class);
	}
	
	@After
	public void teardown() {
		driver.close();
	}
	
	@Given("^the correct web address$")
	public void the_correct_web_address() throws Throwable {
	    driver.get(Constant.TeaMainURL);
	    assertEquals("Main Page Check/Given: ", Constant.TeaMainURL, driver.getCurrentUrl());
	}

	@When("^I navigate to the 'Menu' page$")
	public void i_navigate_to_the_Menu_page() throws Throwable {
	    assertEquals("Menu button clicked?", true, cmp.clickMenu());
	    assertEquals("Menu navigated to? ",Constant.TeaMenuURL, clp.checkURL(driver));
	}

	@Then("^I can browse a list of the available products\\.$")
	public void i_can_browse_a_list_of_the_available_products() throws Throwable {
	    assertEquals("Do items appear? ", false, clp.checkItems(driver));
	}

	@When("^I click the checkout button$")
	public void i_click_the_checkout_button() throws Throwable {
		assertEquals("Checkout button clicked?", true, cmp.clickCheckout());
	}

	@Then("^I am taken to the checkout page$")
	public void i_am_taken_to_the_checkout_page() throws Throwable {
	    assertEquals("CheckOut arrived", Constant.TeaCheckoutURL, clp.checkURL(driver));
	}
}
