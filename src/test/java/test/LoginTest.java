package test;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import green_kart_page.LoginPage;
import io.cucumber.java.en.Given;

public class LoginTest {
	private LoginPage loginPage;
	private WebDriver driver;
	
	@Before
	public void init() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "//Users//fresh//Desktop//chromedriver");
		driver = new ChromeDriver();
		
		driver.get("http://localhost:3000");
		Thread.sleep(2000L);
		
		driver.findElement(By.xpath("//div[@class='Navbar']//nav//div[3]//ul//li[1]")).click();
		
		loginPage = new LoginPage(driver);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5L, TimeUnit.SECONDS);
	}
	
	@Given("Given User launches browser to the green kart url")
	public void launchLoginPage() {
		this.loginPage.getLoginButtonElement().sendKeys("Hello World");
		this.loginPage.getPasswordElement().sendKeys("123");
		this.loginPage.getPasswordElement().click();
	}

}
