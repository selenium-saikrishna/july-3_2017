package day17;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TabAndPopupHandling {
	FirefoxDriver  driver;
	@BeforeTest
	public void setUp()
	{
		driver=new FirefoxDriver();
		driver.get("http://bing.com");
	}
	@Test
	public void multipleWindowTest()
	{
		driver.findElement(By.linkText("Outlook.com")).click();
		Set<String> windowsids=driver.getWindowHandles();
		Iterator<String> it=windowsids.iterator();
		while(it.hasNext())
		{
			driver.switchTo().window(it.next());
			try
			{
				driver.findElement(By.xpath("html/body/section/div/div[2]/div[2]/div/div")).click();
				break;
			}
			catch(Exception e)
			{
			
			}
		}
		
		
		
	}

}
