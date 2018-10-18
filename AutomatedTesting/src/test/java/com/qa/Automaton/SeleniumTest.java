package com.qa.Automaton;

import static org.junit.Assert.*;

import java.io.IOException;
import java.util.List;

import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.*;

@RunWith(Parameterized.class)
public class SeleniumTest {
	
	@Parameters
	public static List<String[]>Data() throws IOException{
		Unlimited utw = new Unlimited();
		return utw.makeList();
	}
	WebDriver driver = null;
	static ExtentReports report = null;
	ExtentTest test;
	private String user;
	private String pass;
	private String expected;
	private int fightthepowah;
	
	public SeleniumTest(String incUser, String incPass, String incpected, String rowrow){
		user = incUser;
		pass = incPass;
		expected = incpected;
		fightthepowah = Integer.parseInt(rowrow);
	}
	
	@BeforeClass
	public static void starto() {
		report = new ExtentReports(Constants.pathReport + Constants.fileReport1,true);
	}
	@Before
	public void startup() {
		System.setProperty("webdriver.chrome.driver","C:/Users/Admin/Desktop/chromedriver.exe");
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
	public void testy() throws IOException {
		test = report.startTest("Create");
		driver.manage().window().maximize();
		driver.get(Constants.URL1);
		test.log(LogStatus.INFO, "User creation page visited");
		DemoSiteAdd add = PageFactory.initElements(driver, DemoSiteAdd.class);
		test.log(add.addUser(user, pass) ? LogStatus.PASS : LogStatus.FAIL, "User add attempted");
		report.endTest(test);
	}
	
	@Test
	public void testz() throws IOException{
		test = report.startTest("Verify");
		driver.manage().window().maximize();
		driver.get(Constants.URL2);
		test.log(LogStatus.INFO, "User validation page visited");
		DemoSiteCheck check = PageFactory.initElements(driver, DemoSiteCheck.class);
		test.log(check.loginUser(user, pass) ? LogStatus.PASS : LogStatus.FAIL, "User check attempted");
		test.log(check.getSuccess().equals(expected) ? LogStatus.PASS : LogStatus.FAIL, "Login attempt");
		//WorksWrite ww = new WorksWrite();
		//ww.saveResult(check.getSuccess(), fightthepowah);
		assertEquals("The only flippin' test!", expected, check.getSuccess());
		report.endTest(test);
	}
}
