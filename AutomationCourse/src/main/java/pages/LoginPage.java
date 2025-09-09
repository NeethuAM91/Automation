package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	public WebDriver driver;
	
	//constructor creation is mandatory
	public LoginPage(WebDriver driver)
	{
    this.driver=driver;
    PageFactory.initElements(driver, this);//for initializing the driver
    }
	//@FindBy(id="user-name")private WebElement username;
	//@FindBy(id="password")private WebElement password;
	//@FindBy(id="login-button")private WebElement login;
	
	
	
	@FindBy(id="user-name")private WebElement username;
	
	public void enterUsernameonUsernameField()
	{
		username.sendKeys("standard_user");
	}
	
	@FindBy(id="password")private WebElement password;
	
	public void enterPasswordonPasswordField()
	{
		password.sendKeys("secret_sauce");
	}
	
	@FindBy(id="login-button")private WebElement login;
	
	public void clickOnLoginButton()
	{
		login.click();
	}
}
