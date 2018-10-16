package com.qa.Automaton;

import static org.junit.Assert.*;

import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class actionTestPaint {
	WebDriver driver = null;
	Actions action = null;
	@Before
	public void startup() {
		System.setProperty("webdriver.chrome.driver","C:/Users/Admin/Desktop/chromedriver.exe");
		driver = new ChromeDriver();
		action = new Actions(driver);
	}
	
	@After
	public void teardown() {
		driver.close();
	}
	
	@Test
	public void testy() throws InterruptedException {
		driver.manage().window().maximize();
		driver.get("https://www.youidraw.com/apps/painter/#");
		action.moveToElement(driver.findElement(By.id("brush"))).click().perform();
		action.moveByOffset(500, 100).clickAndHold().moveByOffset(0, 200).release().moveByOffset(0, -200).clickAndHold().moveByOffset(75, 0).moveByOffset(20, 40).moveByOffset(-20, 40).moveByOffset(-75, 0).moveByOffset(95, 120).release().perform();
		action.moveByOffset(55, -200).clickAndHold().moveByOffset(120, 0).moveByOffset(0, 200).moveByOffset(-120, 0).moveByOffset(0, -200).release().perform();
		action.moveByOffset(295, 0).clickAndHold().moveByOffset(-120, 0).moveByOffset(0, 100).moveByOffset(120, 0).moveByOffset(0, 100).moveByOffset(-120, 0).release().perform();
		action.moveByOffset(295, -200).clickAndHold().moveByOffset(-120, 0).moveByOffset(0, 100).moveByOffset(120, 0).moveByOffset(0, 100).moveByOffset(-120, 0).release().perform();
		Thread.sleep(5000);
	}
}
