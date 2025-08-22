package seleniumBasics;

import org.openqa.selenium.By;

public class Locator extends Base {

	public void verifyLocators()
	{
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");//navigate to input form
		driver.findElement(By.id("single-input-field"));
		driver.findElement(By.className("form-control"));
		driver.findElement(By.tagName("input"));
		driver.findElement(By.name("description"));
		driver.findElement(By.linkText("Radio Buttons Demo"));
		driver.findElement(By.partialLinkText("Radio"));
		driver.findElement(By.cssSelector("input[id='value-a']"));
		driver.findElement(By.xpath("//input[@id='single-input-field']"));
		driver.findElement(By.xpath("//button[text()='Show Message']"));
		driver.findElement(By.xpath("//button[starts-with(text(),'show')]"));
		driver.findElement(By.xpath("//button[@id='button-one' and @type='button']"));
		driver.findElement(By.xpath("//button[@id='button-one' or @id='button-one-electronics']"));//or operator in xpath));
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		Locator loc=new Locator();
		loc.initializeBrowser();
		loc.verifyLocators();
	}


}