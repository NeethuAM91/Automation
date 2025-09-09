package testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import pages.LoginPage;
import seleniumBasics.DemoBase;

public class LoginTest extends DemoBase{
	@Test
 public void verifyUserLoginWithValidCredentials()
 {
	 //WebElement username=driver.findElement(By.id("user-name"));
	 //username.sendKeys("standard_user");
	 //WebElement password=driver.findElement(By.id("password"));
	 //password.sendKeys("secret_sauce");
	 //WebElement login=driver.findElement(By.id("login-button"));
	 //login.click();
		
		LoginPage login= new LoginPage(driver);
		login.enterUsernameonUsernameField();
		login.enterPasswordonPasswordField();
		login.clickOnLoginButton();
 
}
	@Test
	public void verifyUserLoginWithIvalidUsernameandValidPassword()
	 {
		 WebElement username=driver.findElement(By.id("user-name"));
		 username.sendKeys("standard");
		 WebElement password=driver.findElement(By.id("password"));
		 password.sendKeys("secret_sauce");
		 WebElement login=driver.findElement(By.id("login-button"));
		 login.click();
	 
	}
	@Test
	public void verifyUserLoginWithValidUsernameandInvalidPassword()
	 {
		 WebElement username=driver.findElement(By.id("user-name"));
		 username.sendKeys("standard_user");
		 WebElement password=driver.findElement(By.id("password"));
		 password.sendKeys("neethu");
		 WebElement login=driver.findElement(By.id("login-button"));
		 login.click();
	 
	}
	@Test
	public void verifyUserLoginWithInvalidCredentials()
	 {
		 WebElement username=driver.findElement(By.id("user-name"));
		 username.sendKeys("standard");
		 WebElement password=driver.findElement(By.id("password"));
		 password.sendKeys("neethu");
		 WebElement login=driver.findElement(By.id("login-button"));
		 login.click();
	 
	}
}
