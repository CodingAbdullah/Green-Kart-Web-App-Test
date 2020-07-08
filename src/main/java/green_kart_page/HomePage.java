package green_kart_page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
	private WebDriver driver;
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement getProductPricingNavbarLink() {
		return this.driver.findElement(By.xpath("//nav//div[contains(@class, 'navbar-collapse')][1]//ul//li[1]"));
	}
	
	public WebElement getHomePageNavbarLink() {
		return this.driver.findElement(By.xpath(""));
	}
	
	public WebElement getLoginLink() {
		return this.driver.findElement(By.xpath("//nav//div[contains(@class, 'navbar-collapse')][2]//ul//li[1]"));
	}
	
	public WebElement getSignUpLink() {
		return this.driver.findElement(By.xpath("//nav//div[contains(@class, 'navbar-collapse')][2]//ul//li[2]"));
	}
}
