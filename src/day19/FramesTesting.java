package day19;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FramesTesting {
	FirefoxDriver  driver;
	@BeforeTest
	public void setUp()
	{
		driver=new FirefoxDriver();
		driver.get("http://www.angelfire.com/super/badwebs/");
	}
	@Test
	public void framestest()
	{
		List<WebElement> myframes=driver.findElements(By.tagName("frame"));
		System.out.println(myframes.size());
		driver.switchTo().frame(1);
		driver.findElement(By.xpath("html/body/p[5]/b/a/font")).click();
		
		
		
		
		
		
	}
}
