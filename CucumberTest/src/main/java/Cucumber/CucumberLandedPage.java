package Cucumber;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CucumberLandedPage {

		public String checkURL(WebDriver driver) {
			return driver.getCurrentUrl();
		}
		
		public boolean checkItems(WebDriver driver) {
			return driver.findElements(By.id("wsb-element-00000000-0000-0000-0000-000453230000")).isEmpty();
		}
}
