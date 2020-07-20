package green_kart_page;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import green_kart_page.HomePage;
import io.cucumber.java.Before;

public class OrderTest {

	private HomePage homePage;
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
}
