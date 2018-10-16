package com.qa.Automaton;

import static org.junit.Assert.*;

import org.junit.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class SeleniumTest {
	WebDriver driver = null;
	@Before
	public void startup() {
		System.setProperty("webdriver.chrome.driver","C:/Users/Admin/Desktop/chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	@After
	public void teardown() {
		driver.close();
	}
	
	@Test
	public void testy() {
		String user = "Ross!";
		String pass = "Sting";
		driver.manage().window().maximize();
		driver.get("http://thedemosite.co.uk/addauser.php");
		DemoSiteAdd add = PageFactory.initElements(driver, DemoSiteAdd.class);
		add.addUser(user, pass);
		driver.get("http://thedemosite.co.uk/login.php");
		DemoSiteCheck check = PageFactory.initElements(driver, DemoSiteCheck.class);
		check.loginUser(user, pass);
		assertEquals("The only flippin' test!", "**Successful Login**", check.getSuccess().getText());
	}
}
