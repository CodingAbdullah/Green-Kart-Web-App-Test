package green_kart_page;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestingPage {

	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "//Users//fresh//Desktop//chromedriver");
		WebDriver driver = new ChromeDriver();
		LoginPage loginPage;
		SignUpPage signUpPage;
		
		
		// login page
		driver.get("http://localhost:3000/");
	/*	driver.findElement(By.xpath("//div[@class='Navbar']//nav//div[3]//ul//li[1]")).click();
		loginPage = new LoginPage(driver); 
	
		loginPage.setUserNameElement("Hello World");
		loginPage.setPasswordElement("123");
		loginPage.clickLoginButtonElement(); */
		
		
		// sign up page
	/*	driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//div[@class='Navbar']//nav//div[3]//ul//li[2]")).click();
		
		signUpPage = new SignUpPage(driver);
		
		signUpPage.setFirstNameInputElement("Abdul");
		signUpPage.setLastNameInputElement("Muhammad");
		signUpPage.setAgeInputElement("24");
		signUpPage.setEmailInputElement("tellNet@tellnet.ca");
		signUpPage.setAddressInputElement("3 Main Street West");
		signUpPage.setPasswordInputElement("123456");
		int randomNumber = (int)((int)2 * Math.random() + 1);
		System.out.println(randomNumber);
		signUpPage.clickGenderButtonElement(randomNumber);
		signUpPage.clickSignUpButtonElement();
		 */
	
	}
}
