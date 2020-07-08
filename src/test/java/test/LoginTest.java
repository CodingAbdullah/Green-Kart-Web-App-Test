package test;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import green_kart_page.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginTest {
	private LoginPage loginPage;
	private WebDriver driver;
	
	@Before
	public void init() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "//Users//fresh//Desktop//chromedriver");
		driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.get("http://localhost:3000");
		driver.findElement(By.xpath("//div[@class='Navbar']//nav//div[3]//ul//li[1]")).click();
		
		loginPage = new LoginPage(driver);
	}
	
	@Given("Given User launches browser to the green kart url")
	public void launchLoginPage() {
		this.loginPage.setUserNameElement("hello world");
	}
	    
	@When("User clicks login button in the navbar, display login page")
	public void displayLoginPage() {
	 
	}
	 
	@And("User enters valid username")
	public void enterValidUsername() {
		
	}
	
	@And("User enters valid password")
	public void enterValidPassword() {
		
	}
	
	@And("User enters invalid username ")
	public void enterInvalidUsername() {
		
	}
	
	@And("User enters invalid password")
	public void enterInvalidPassword() {
		
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
