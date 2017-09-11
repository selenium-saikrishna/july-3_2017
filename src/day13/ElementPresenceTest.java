package day13;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ElementPresenceTest {
	FirefoxDriver  driver;
	@BeforeTest
	public void setUp()
	{
		driver=new FirefoxDriver();
		driver.get("http://google.com");
	}
	@Test
	public void elementTest()
	{
		String str=driver.getPageSource();
		if(str.contains("Rajinikanth"))
			System.out.println("Element present");
		else
			System.out.println("Element not present");
	}
	@AfterTest
	public void tearDown()
	{
		driver.quit();
	}

}
