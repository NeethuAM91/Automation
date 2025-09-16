package seleniumBasics;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebElementCommands extends Base{
	
	public void verifyWebElement()
	{
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		WebElement messageBox= driver.findElement(By.id("single-input-field"));
		messageBox.sendKeys("Neethu");
		WebElement showbutton=driver.findElement(By.id("button-one"));
		showbutton.click();
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(5));
		wait.until(ExpectedConditions.elementToBeClickable(showbutton));
		Wait<WebDriver> fluentwait= new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(5)).pollingEvery(Duration.ofSeconds(1)).ignoring(NoSuchElementException.class);
		fluentwait.until(ExpectedConditions.elementToBeClickable(showbutton));
		WebElement yourmessage= driver.findElement(By.id("message-one"));
		System.out.println(yourmessage.getText());
		messageBox.clear();
		System.out.println(showbutton.getTagName());
		System.out.println(messageBox.getCssValue("border-color"));
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebElementCommands webelement= new WebElementCommands();
		webelement.initializeBrowser();
		webelement.verifyWebElement();
	}

}
