package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import green_kart_page.HomePage;
import green_kart_page.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginTest {
	private LoginPage loginPage;
	private HomePage homePage;
	private WebDriver driver;
	
	@Before
	public void init() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "//Users//fresh//Desktop//chromedriver");
		driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.get("http://localhost:3000");
		homePage = new HomePage(driver);
	}
	
	@Given("Given User launches browser to the green kart url")
	public void launchLoginPage() {
		if (driver.getCurrentUrl().contains("http://localhost:3000")) {
			if (homePage.getHomePageTitleElement().getText().equals("Welcome to Green Kart")) {
				assertTrue(true);
			}
			else {
				assertFalse(true);
			}
		}
		else {
			assertFalse(true);
		}
	}
	    
	@When("User clicks login button in the navbar, display login page")
	public void displayLoginPage() {
		driver.findElement(By.xpath("//div[@class='Navbar']//nav//div[3]//ul//li[1]")).click();
		loginPage = new LoginPage(driver);
		
		if (loginPage.getLoginLabelElement().getText().equals("Login Form")) {
			assertTrue(true);
		}
		else {
			assertFalse(true);
		}
	}
	 
	@And("User enters valid username")
	public void enterValidUsername() {
		this.loginPage.setUserNameElement("Hello World");
		assertEquals(this.loginPage.getUserNameInputElement().getText(), "Hello World");
	}
	
	@And("User enters valid password")
	public void enterValidPassword() {
		this.loginPage.setPasswordElement("123");
		assertEquals(this.loginPage.getPasswordInputElement().getText(), "123");
	}
	
	@And("User enters invalid username ")
	public void enterInvalidUsername() {
		this.loginPage.setUserNameElement("Invalid");
		assertEquals(this.loginPage.getUserNameInputElement().getText(), "Invalid");
	}
	
	@And("User enters invalid password")
	public void enterInvalidPassword() {
		assertEquals(this.loginPage.getPasswordInputElement().getText(), "123456");
	}
	
	@Then("Error message is displayed and redirected to login page")
	public void displayErrorMessageRedirect() {
		
	}
	
	@Then("Then User clicks submit and error message is displayed to enter creds and redirected to login page")
	public void displayErrorMessageBlankLogin() {
		
	}
	
	@Then("Success message is displayed along with the product pricing page")
	public void displayProductPricingPage() {
		
	}
}
