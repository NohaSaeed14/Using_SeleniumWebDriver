package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class Home {
	// variables
	private WebDriver driver;
	private String url = "https://www.google.com/";
	// locators
	private By searchBox = By.name("q");

	// constructor
	public Home(WebDriver driver) {
		this.driver = driver;
	}

	// keywords / actions
	public void navigate() {
		driver.navigate().to(url);
	}

	public void search(String query) {
		driver.findElement(searchBox).sendKeys(query + Keys.ENTER);
	}

}
