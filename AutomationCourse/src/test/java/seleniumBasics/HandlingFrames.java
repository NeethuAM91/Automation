package seleniumBasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HandlingFrames extends Base{

	public void frames()
	{
		driver.navigate().to("https://demoqa.com/frames");
		List <WebElement> frame= driver.findElements(By.tagName("iframe"));
		System.out.println(frame.size());//to get the total count of frames
		WebElement frameone=driver.findElement(By.id("frame1"));
		driver.switchTo().frame(frameone);//driver control switches from page to frame 
		WebElement frametext=driver.findElement(By.id("sampleHeading"));
		System.out.println(frametext.getText());//get the text from the frame
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HandlingFrames frame=new HandlingFrames();
		frame.initializeBrowser();
		frame.frames();
	}

}
