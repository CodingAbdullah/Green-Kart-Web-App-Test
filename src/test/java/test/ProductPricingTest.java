package test;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import green_kart_page.HomePage;
import green_kart_page.LoginPage;
import green_kart_page.ProductPage;
import io.cucumber.java.Before;

public class ProductPricingTest {

	private ProductPage productPage;
	private HomePage homePage;
	private LoginPage loginPage;
	private WebDriver driver;
	
	@Before
	public void init() {
		System.setProperty("webdriver.chrome.driver", "//Users//fresh//Desktop//chromedriver");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		driver.get("http://localhost:3000");
		homePage = new HomePage(driver);
	}
	
	
	@Test
	public void addRandomVegetablesWithRandomQuantity() {
		
	}
	
	@Test
	public void randomResetOfVegetableQuantity() {
		
	}
	
	@Test
	public void randomRemovalOfVegetable() {
		
	}
}
