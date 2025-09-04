package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class HandlingJavascript extends Base {

	public void verifyJavascript()
	{
driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		
		WebElement showMessageButton=driver.findElement(By.xpath("//button[@id='button-one']"));
		
		JavascriptExecutor js = (JavascriptExecutor)driver;// casting
		js.executeScript("arguments[0].click();", showMessageButton);//for click
		js.executeScript("window.scrollBy(0,350)", "");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HandlingJavascript javascript=new HandlingJavascript();
		javascript.initializeBrowser();
		javascript.verifyJavascript();
	}

}
