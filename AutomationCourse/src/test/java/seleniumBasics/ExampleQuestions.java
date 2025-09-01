package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ExampleQuestions extends Base {
	
  public void practice()
  {
	  driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
	  WebElement input1=driver.findElement(By.xpath("//input[@id='value-a']"));
	  input1.sendKeys("6");
	  WebElement input2=driver.findElement(By.xpath("//input[@id='value-b']"));
	  input2.sendKeys("5");
	  WebElement gettotal=driver.findElement(By.xpath("//button[text()='Get Total']")); 
	  gettotal.click();
	  WebElement total=driver.findElement(By.xpath("//div[@id='message-two']"));
	  
	  System.out.println(total.getText());
	  
  }
	
	public static void main(String[] args) {
		
		ExampleQuestions example= new ExampleQuestions();
		example.initializeBrowser();
		example.practice();
		
		
	}
}
