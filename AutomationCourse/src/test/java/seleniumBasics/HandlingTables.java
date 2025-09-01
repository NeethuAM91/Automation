package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HandlingTables extends Base
		{
			public void handleTable()
			{
				driver.navigate().to("https://money.rediff.com/indices/nse");
				//WebElement table=driver.findElement(By.xpath("//table[@id='dataTable']"));
				//System.out.println(table.getText());
				WebElement row=driver.findElement(By.xpath("//table[@id='dataTable']/tbody/tr[2]"));
				System.out.println(row.getText());
				
			}
			

			public static void main(String[] args)
			{
				HandlingTables handletable=new HandlingTables();
				handletable.initializeBrowser();
				handletable.handleTable();

			}
		}


