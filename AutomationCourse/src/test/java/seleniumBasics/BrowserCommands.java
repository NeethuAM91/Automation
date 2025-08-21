package seleniumBasics;

public class BrowserCommands extends Base {
	
	public void verifyCommands()
	{
		String title=driver.getTitle();// to get the title of the web page
		System.out.println(title);
		
		String url=driver.getCurrentUrl(); // to get the url of the web page 
		  
	 	 System.out.println(url);
	  
	 	  
	  
	 	 String handleID= driver.getWindowHandle(); // to get the ID 
	  
	 	 System.out.println(handleID);
	  
	 	  
	  
	 	 String source=driver.getPageSource(); // to get the source code
	  
	 	 System.out.println(source); 
	  
	 	} 
	  
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BrowserCommands command= new BrowserCommands();
		command.initializeBrowser();
		command.verifyCommands();
		
	}

}
