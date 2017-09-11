package day14;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class XpathCreation1 {
	FirefoxDriver  driver;
	@BeforeTest
	public void setUp()
	{
		driver=new FirefoxDriver();
		driver.get("https://news.google.com/news/?ned=in&hl=en-IN");
	}
	@Test
	public void googleNewTest()
	{
		Sleeper.sleepTightInSeconds(7);
		List<WebElement> headlines=driver.findElements(By.xpath("//a[@class='nuEeue hzdq5d ME7ew' and @role='heading']"));
		for(int i=0;i<headlines.size();i++)
		{
			System.out.println(headlines.get(i).getText());
		}
	}
}
