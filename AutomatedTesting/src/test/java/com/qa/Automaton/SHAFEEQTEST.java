package com.qa.Automaton;

import static org.junit.Assert.*;

import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SHAFEEQTEST {
	WebDriver driver = null;
	
	@Before
	public void startup() {
		System.setProperty("webdriver.chrome.driver", "C:/Users/Admin/Desktop/chromedriver.exe");
		driver = new ChromeDriver();
	}

	@After
	public void teardown() {
		driver.close();
	}
	
	@Test
	public void testy() throws InterruptedException {
		driver.get(Constants.URL4);
		WebElement naiWa = (new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated(By.id("shafeeq")));
		Thread.sleep(3000);
		assertEquals("I HATE YOU!\n" + "-The Shafeeq",naiWa.getText());
	}
}