package com.qa.Automaton;

import static org.junit.Assert.*;

import org.junit.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.*;

public class automatedShopping {
	WebDriver driver = null;
	static ExtentReports report = null;
	ExtentTest test;

	@BeforeClass
	public static void starto() {
		report = new ExtentReports(Constants.pathReport+Constants.fileReport2, true);
	}

	@Before
	public void startup() {
		System.setProperty("webdriver.chrome.driver", "C:/Users/Admin/Desktop/chromedriver.exe");
		driver = new ChromeDriver();
	}

	@After
	public void teardown() {
		driver.close();
	}

	@AfterClass
	public static void finé() {
		report.flush();
	}
	
	@Test
	public void testy() throws InterruptedException {
		test = report.startTest("Verify item found");
		driver.manage().window().maximize();
		driver.get(Constants.URL3);
		ShoppingFrontPage sfp = PageFactory.initElements(driver, ShoppingFrontPage.class);
		sfp.searchTerm("Dress");
		ShoppingLandedSolution sls = PageFactory.initElements(driver, ShoppingLandedSolution.class);
		int check = Integer.parseInt(sls.getNumber().substring(0, 1));
		boolean itemsFound = (check >= 1 ? true : false);
		test.log(itemsFound ? LogStatus.PASS : LogStatus.FAIL, "Did items appear?");
		assertEquals("Element found?", true, itemsFound);
		Thread.sleep(5000);
		report.endTest(test);
	}
}
