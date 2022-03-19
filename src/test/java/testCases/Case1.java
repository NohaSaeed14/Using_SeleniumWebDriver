package testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.Home;
import pages.SearchResults;

public class Case1 {
	private WebDriver driver;
	private Home home;
	private SearchResults results;

@Test
public void assertTheFirstResult() {
	home.search("Selenium WebDriver");
	String text = results.getFirstResult();
	/*Make Assertion is WebDriver | Selenium 
	Because It appears as a first result when search in Google Chrome*/
	Assert.assertEquals(text, "WebDriver | Selenium");
}
	@BeforeMethod
	public void beforeMethod() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		home = new Home(driver);
		home.navigate();

		results = new SearchResults(driver);
	}

	@AfterMethod
	public void afterMethod() {
		driver.quit();
	}
}
