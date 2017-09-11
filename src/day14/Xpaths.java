package day14;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Xpaths {
	FirefoxDriver  driver;
	@BeforeTest
	public void setUp()
	{
		driver=new FirefoxDriver();
		driver.get("http://yahoo.com");
	}
	@Test
	public void xpathtest()
	{
		driver.findElement(By.id("uh-search-box")).sendKeys("selenium");
		driver.findElement(By.id("uh-search-button")).click();
		driver.findElement(By.xpath("//*[contains(@id,'0')]/div/div/div[1]/h3/a")).click();
	}

}
