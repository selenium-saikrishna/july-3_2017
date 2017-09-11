package day21;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DragAndDrop {
	
	ChromeDriver driver;
	@BeforeTest
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver","c://chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml5_draganddrop");
		
	}
	@Test
	public void dragAndDroptest()
	{
		Actions action=new Actions(driver);
		driver.switchTo().frame(1);
		Sleeper.sleepTightInSeconds(4);
		WebElement source=driver.findElement(By.id("drag1"));
		WebElement target=driver.findElement(By.id("div1"));
		action.dragAndDrop(source, target).build().perform();
		
	}

}
