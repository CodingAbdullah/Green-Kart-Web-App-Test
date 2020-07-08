package green_kart_page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

// Have to fix the gender button it is not working
public class SignUpPage {
	
	@FindBy(xpath="//div[@class='signup-form']//form//div[contains(@class, 'form-element')]//div[1]//div//input")
	private WebElement firstNameInputElement;
	
	@FindBy(xpath="//div[@class='signup-form']//form//div[contains(@class, 'form-element')]//div[2]//div//input")
	private WebElement lastNameInputElement;
	
	@FindBy(xpath="//div[@class='signup-form']//form//div[contains(@class, 'form-element')]//div[3]//div//input")
	private WebElement ageInputElement;
	
	@FindBy(xpath="//div[@class='signup-form']//form//div[contains(@class, 'form-element')]//div[4]//div//input")
	private WebElement emailInputElement;
	
	@FindBy(xpath="//div[@class='signup-form']//form//div[contains(@class, 'form-element')]//div[5]//div//input")
	private WebElement passwordInputElement;
	
	@FindBy(xpath="//div[@class='signup-form']//form//div[contains(@class, 'form-element')]//div[6]//div//input")
	private WebElement addressInputElement;
	
	@FindBy(id="male-button")
	private WebElement maleGenderButtonElement;
	
	@FindBy(id="female-button")
	private WebElement femaleGenderButtonElement;
	
	@FindBy(xpath="//div[@class='signup-form']//form//div[contains(@class, 'form-element')]//div[8]//div//button")
	private WebElement signUpButtonElement;
	
	public SignUpPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void setFirstNameInputElement(String firstName) {
		this.firstNameInputElement.sendKeys(firstName);
	}
	
	public void setLastNameInputElement(String lastName) {
		this.lastNameInputElement.sendKeys(lastName);
	}
	
	public void setAgeInputElement(String age) {
		this.ageInputElement.sendKeys(age);
	}
	
	public void setEmailInputElement(String email) {
		this.emailInputElement.sendKeys(email);
	}
	
	public void setPasswordInputElement(String password) {
		this.passwordInputElement.sendKeys(password);
	}
	
	public void setAddressInputElement(String address) {
		this.addressInputElement.sendKeys(address);
	}
	
	public void clickGenderButtonElement(int number) {
		System.out.println("The number is " + number);
		
		if (number == 1) {
			if (!this.maleGenderButtonElement.isSelected()) {
				this.maleGenderButtonElement.click();
				System.out.println(this.maleGenderButtonElement.getText() + " was selected");
			}
		}
		else {
			if (!this.femaleGenderButtonElement.isSelected()) {
				this.femaleGenderButtonElement.click();
				System.out.println(this.femaleGenderButtonElement.getText() + " was selected");
			}
		}
	}
	
	public void clickSignUpButtonElement() {
		this.signUpButtonElement.click();
	}
	
	public WebElement getFirstNameInputElement() {
		return this.firstNameInputElement;
	}
	
	public WebElement getLastNameElement() {
		return this.lastNameInputElement;
	}
	
	public WebElement getAgeInputElement() {
		return this.ageInputElement;
	}
	
	public WebElement getEmailInputElement() {
		return this.emailInputElement;
	}
	
	public WebElement getPasswordInputElement() {
		return this.passwordInputElement;
	}
	
	public WebElement getAddressInputElement() {
		return this.addressInputElement;
	}
	
	public WebElement getMaleGenderButtonElement() {
		return this.maleGenderButtonElement;
	}
	
	public WebElement getFemaleGenderButtonElement() {
		return this.femaleGenderButtonElement;
	}
	
	public WebElement getSignUpButtonElement() {
		return this.signUpButtonElement;
	}
}
