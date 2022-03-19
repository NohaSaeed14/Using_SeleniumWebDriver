package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchResults {
	// variables
	private WebDriver driver;

	// locators
	private By searchResult = By.xpath("//span[text()='WebDriver | Selenium']");

	// constructor
	public SearchResults(WebDriver driver) {
		this.driver = driver;
	}

	public String getFirstResult() {

		return driver.findElement(searchResult).getText();
	}

}
