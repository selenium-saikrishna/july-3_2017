package day21;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SliderAutomation {
	public class DragAndDrop {
		
		FirefoxDriver driver;
		@BeforeTest
		public void setUp()
		{
			
			driver=new FirefoxDriver();
			driver.get("https://jqueryui.com/slider/#slider-vertical");
			
		}
		@Test
		public void slidertest()
		{
			Actions action=new Actions(driver);
			driver.switchTo().frame(0);
			WebElement slider=driver.findElement(By.xpath("//*[@id='slider-vertical']/span"));
			int x=slider.getLocation().x;
			int y=slider.getLocation().y;
			System.out.println(x);
			System.out.println(y);
			action.dragAndDropBy(slider, 40,y).build().perform();
		}
	}
}
