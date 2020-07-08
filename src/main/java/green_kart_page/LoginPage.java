package green_kart_page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {
	private WebDriver driver;
	
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement getUserNameElement() {
		return this.driver.findElement(By.xpath(""));
	}
	
	public WebElement getPasswordElement() {
		return this.driver.findElement(By.xpath(""));
	}
	
	public WebElement getLoginButtonElement() {
		return this.driver.findElement(By.xpath(""));
	}
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "//Users//fresh//Desktop//chromedriver");
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost:3000/");
		
		driver.findElement(By.xpath("//div[@class='Navbar']//nav//div[3]//ul//li[1]")).click(); // Login navbar button
		
		// Username Element
		Thread.sleep(2000L);
		driver.findElement(By.xpath("//div[@class='login-form']//div//form//div[contains(@class, 'form-element')]//div[1]//div//input")).sendKeys("tellNet@telnet.ca");
		
		// Password Element
		Thread.sleep(2000L);
		driver.findElement(By.xpath("//div[@class='login-form']//div//form//div[contains(@class, 'form-element')]//div[2]//div//input")).sendKeys("123");

		// Login Button Element
		Thread.sleep(2000L);
		driver.findElement(By.xpath("//div[@class='login-form']//div//form//div[contains(@class, 'form-element')]//div[3]//div//button")).click();

	}

}
