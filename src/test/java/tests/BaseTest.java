package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest {
	  protected WebDriver driver;

		 @BeforeClass
		 public void setUp() {
				System.setProperty("webdriver.chrome.driver","/Users/leandro.valenzuela/Documents/chromedriver");
		        driver = new ChromeDriver();
		        driver.get("https://the-internet.herokuapp.com/dynamic_controls");
		 }
		 
		 @AfterClass
		 public void tearDown() {
			 driver.quit();
	    }
}
