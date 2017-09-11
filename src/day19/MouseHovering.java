package day19;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MouseHovering {
	ChromeDriver  driver;
	@BeforeTest
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver","c:\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://hdfcbank.com");
		Sleeper.sleepTightInSeconds(6);
	}
	@Test
	public void moseHoverTest()
	{
		Actions action=new Actions(driver);
		//driver.findElement(By.xpath("//*[@id='cee_closeBtn']/img")).click();
		Sleeper.sleepTightInSeconds(6);
		WebElement makingPayments=driver.findElement(By.xpath("html/body/div[1]/div[1]/div[2]/div[3]/ul/li[3]/div[1]"));
		action.moveToElement(makingPayments).build().perform();
		WebElement element2=driver.findElement(By.xpath("html/body/div[1]/div[1]/div[2]/div[3]/ul/li[3]/div[2]/div[2]/div[1]/ul/li[5]/a"));
		action.moveToElement(element2).build().perform();
	
	
	
	
	
	
	
	}

}
