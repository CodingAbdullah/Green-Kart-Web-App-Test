package green_kart_page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	@FindBy(xpath="//div[@class='homepage']//div[@class='jumbo']//h1")
	private WebElement homePageTitleElement;
	
	@FindBy(xpath="//nav//div[contains(@class, 'navbar-collapse')][1]//ul//li[1]")
	private WebElement productPricingNavbarLinkElement;
	
	@FindBy(xpath="//div[@class='Navbar']//nav//div[2]//a")
	private WebElement homePageNavbarLinkElement;
	
	@FindBy(xpath="//nav//div[contains(@class, 'navbar-collapse')][2]//ul//li[1]")
	private WebElement loginNavbarLinkElement;
	
	@FindBy(xpath="//nav//div[contains(@class, 'navbar-collapse')][2]//ul//li[2]")
	private WebElement signUpNavbarLinkElement;
	
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void clickProductPricingNavbarElement() {
		this.productPricingNavbarLinkElement.click();
	}
	
	public void clickLoginNavbarElement() {
		this.loginNavbarLinkElement.click();
	}
	
	public void clickSignUpNavbarElement() {
		this.signUpNavbarLinkElement.click();
	}
	
	public void clickHomePageNavbarElement() {
		this.homePageNavbarLinkElement.click();
	}
	
	public WebElement getProductPricingElement() {
		return this.productPricingNavbarLinkElement;
	}
	
	public WebElement getLoginNavbarElement() {
		return this.loginNavbarLinkElement;
	}
	
	public WebElement getSignUpNavbarElement() {
		return this.signUpNavbarLinkElement;
	}
	
	public WebElement getHomePageNavbarElement() {
		return this.homePageNavbarLinkElement;
	}
	
	public WebElement getHomePageTitleElement() {
		return this.homePageTitleElement;
	}
}
