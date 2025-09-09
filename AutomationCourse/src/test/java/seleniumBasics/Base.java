 package seleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Base {
	
	public WebDriver driver;
	
	public void initializeBrowser()
	{
		driver =new ChromeDriver();
		driver.get("https://selenium.qabible.in/");
		driver.manage().window().maximize();
	}
	
	public void browserClose()
	{
		//driver.close();
		//driver.quit();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Base base= new Base();
          base.initializeBrowser();
          base.browserClose();
          
	}

}
