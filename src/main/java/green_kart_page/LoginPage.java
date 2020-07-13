package green_kart_page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	@FindBy(xpath="//div[@class='login-form']//h4")
	private WebElement loginLabel;
	
	@FindBy(xpath="//div[@class='login-form']//div//form//div[contains(@class, 'form-element')]//div[1]//div//input")
	private WebElement username;
	
	@FindBy(xpath="//div[@class='login-form']//div//form//div[contains(@class, 'form-element')]//div[2]//div//input")
	private WebElement password;
	
	@FindBy(xpath="//div[@class='login-form']//div//form//div[contains(@class, 'form-element')]//div[3]//div//button")
	private WebElement loginButton;
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void setUserNameElement(String username) {
		this.username.sendKeys(username);
	}
	
	public void setPasswordElement(String password) {
		this.password.sendKeys(password);
	}

	public void clickLoginButtonElement() {
		this.loginButton.click();
	}
	
	public WebElement getUserNameInputElement() {
		return this.username;
	}
	
	public WebElement getPasswordInputElement() {
		return this.password;
	}
	
	public WebElement getLoginButtonElement() {
		return this.loginButton;
	}
	
	public WebElement getLoginLabelElement() {
		return this.loginLabel;
	}
}
