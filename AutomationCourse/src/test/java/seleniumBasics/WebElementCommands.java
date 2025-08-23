package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class WebElementCommands extends Base{
	
	public void verifyWebElement()
	{
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		WebElement messageBox= driver.findElement(By.id("single-input-field"));
		messageBox.sendKeys("Neethu");
		WebElement showbutton=driver.findElement(By.id("button-one"));
		showbutton.click();
		WebElement yourmessage= driver.findElement(By.id("message-one"));
		System.out.println(yourmessage.getText());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebElementCommands webelement= new WebElementCommands();
		webelement.initializeBrowser();
		webelement.verifyWebElement();
	}

}
