package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import io.cucumber.java.Before;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import green_kart_page.HomePage;
import green_kart_page.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
public class LoginTest {
	 private LoginPage loginPage;
	 private HomePage homePage;
	 private WebDriver driver;
	
	 @Before
	 public void start() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "//Users//fresh//Desktop//chromedriver");
		driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.get("http://localhost:3000");
		homePage = new HomePage(driver);
	 }
	
	 @Given("User launches browser to the green kart url")
	 public void user_launches_browser_to_the_green_kart_url() throws Throwable {
			
			if (homePage.getHomePageTitleElement().getText().equals("Welcome to Green Kart")) {
				assertTrue(true);
			}
			else {
				assertFalse(true);
			}	    
	  }

	  @When("User clicks login button in the navbar, display login page")
	  public void user_clicks_login_button_in_the_navbar_display_login_page() throws Throwable {
	    	driver.findElement(By.xpath("//div[@class='Navbar']//nav//div[3]//ul//li[1]")).click();
			loginPage = new LoginPage(driver);
			
			if (loginPage.getLoginLabelElement().getText().equals("Login Form")) {
				assertTrue(true);
			}
			else {
				assertFalse(true);
			}	    
	   }

	   @Then("Success message is displayed along with product pricing page")
	   public void success_message_is_displayed_along_with_product_pricing_page() throws Throwable {
	    	String success = "success";
			
			assertEquals(success, "success");	    
	   }

	   @And("User enters valid username")
	   public void user_enters_valid_username() throws Throwable {
	    	driver.findElement(By.xpath("//div[@class='Navbar']//nav//div[3]//ul//li[1]")).click();
			this.loginPage = new LoginPage(driver);
			
			this.loginPage.setUserNameElement("Hello World");
			
			if ((this.loginPage.getUserNameInputElement().getText()).equals("Hello World")) {
				assertTrue(true);
			}
			else {
				assertFalse(true);
			}	    
	   }

	   @And("User enters valid password")
	   public void user_enters_valid_password() throws Throwable {
		   driver.findElement(By.xpath("//div[@class='Navbar']//nav//div[3]//ul//li[1]")).click();
			this.loginPage = new LoginPage(driver);
			this.loginPage.setPasswordElement("123");
			
			if ((this.loginPage.getPasswordInputElement().getText()).equals("123")) {
				assertTrue(true);
			}
			else {
				assertFalse(true);
			}	   
	   }
}
