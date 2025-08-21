package seleniumBasics;

public class NavigationCommand extends Base {
	
	public void verifyCommand()
	{
		driver.navigate().to("https://www.amazon.in/");//navigate to obsqura page to amazon
		driver.navigate().back();//navigate from amazon to obsqura
		driver.navigate().forward();//navigate to amazon page
		driver.navigate().refresh();//refresh the existing page
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NavigationCommand navigate=new NavigationCommand();
		navigate.initializeBrowser();
		navigate.verifyCommand();
		
	}

}
