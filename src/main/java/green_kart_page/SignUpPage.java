package green_kart_page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SignUpPage {

	private WebDriver driver;
	
	public SignUpPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement getFirstNameElement() {
		return this.driver.findElement(By.xpath(""));
	}
	
	public WebElement getLastNameElement() {
		return this.driver.findElement(By.xpath(""));
	}
	
	public WebElement getAgeElement() {
		return this.driver.findElement(By.xpath(""));
	}
	
	public WebElement getEmailElement() {
		return this.driver.findElement(By.xpath(""));
	}
	
	public WebElement getPasswordElement() {
		return this.driver.findElement(By.xpath(""));
	}
	
	public WebElement getAddressElement() {
		return this.driver.findElement(By.xpath(""));
	}
	
	public WebElement getGenderElement() {
		return this.driver.findElement(By.xpath(""));
	}
	
	public WebElement getSignUpButtonElement() {
		return this.driver.findElement(By.xpath(""));
	}
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "//Users//fresh//Desktop//chromedriver");
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost:3000");
		
		// Sign Up Button
		driver.findElement(By.xpath("//div[@class='Navbar']//nav//div[3]//ul//li[2]")).click();
		
		// First name
		driver.findElement(By.xpath("//div[@class='signup-form']//form//div[contains(@class, 'form-element')]//div[1]//div//input")).sendKeys("Brennan");
	
		// Last name
		driver.findElement(By.xpath("//div[@class='signup-form']//form//div[contains(@class, 'form-element')]//div[2]//div//input")).sendKeys("Leslie");

		// Age
		driver.findElement(By.xpath("//div[@class='signup-form']//form//div[contains(@class, 'form-element')]//div[3]//div//input")).sendKeys("24");
		
		// Email
		driver.findElement(By.xpath("//div[@class='signup-form']//form//div[contains(@class, 'form-element')]//div[4]//div//input")).sendKeys("tellNet@telnet.ca");
		
		// Password
		driver.findElement(By.xpath("//div[@class='signup-form']//form//div[contains(@class, 'form-element')]//div[5]//div//input")).sendKeys("123");
		
		// Address
		driver.findElement(By.xpath("//div[@class='signup-form']//form//div[contains(@class, 'form-element')]//div[6]//div//input")).sendKeys("3 Main Street Brampton Ontario");
		
		// Gender
		int randomNumber = (int)((int) 2 * Math.random() + 1);
		System.out.println(randomNumber);
		driver.findElement(By.xpath("//div[@class='signup-form']//form//div[contains(@class, 'form-element')]//div[7]//div[" + randomNumber + "]//input")).click();

		// Sign Up Button
		driver.findElement(By.xpath("//div[@class='signup-form']//form//div[contains(@class, 'form-element')]//div[8]//div//button")).click();

	}
}
