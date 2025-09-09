package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExampleQuestions extends Base {
	
	//public WebDriver driver;
 /*public void practice()
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
	  
  }*/
  public void practiceQuestions()
  {
	  driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
	  WebElement browse=driver.findElement(By.xpath("a[@href='simple-form-demo.php']"));
	  browse.click();
	  //a[@href='simple-form-demo.php']
	  //a[@href='table-pagination.php' and text()='Table with Pagination']
	  ////a[text()='rediffGURUS']
  }
  
	public void sample()
	
	
	{
		driver= new ChromeDriver();
		driver.get("https://www.onlinesbi.sbi/");
		driver.manage().window().maximize();
	}
	
	public void navigate()
	{
		driver.navigate().to("https://chatgpt.com/");
		driver.navigate().forward();
		driver.navigate().refresh();
	}
		
	public void locators()
	{
		
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		WebElement input1=driver.findElement(By.xpath("//input[@id='value-a']"));
		input1.sendKeys("5");
		WebElement input2=driver.findElement(By.xpath("//input[@id='value-b']"));
		input2.sendKeys("6");
		WebElement total=driver.findElement(By.xpath("//button[@id='button-two']"));
		total.click();
		System.out.println(total.getText());
		
		
	}
	public static void main(String[] args) {
		
		ExampleQuestions example= new ExampleQuestions();
		example.initializeBrowser();
		example.locators();
		//example.practiceQuestions();
		//example.sample();
		//example.navigate();
		
		
	}
}
