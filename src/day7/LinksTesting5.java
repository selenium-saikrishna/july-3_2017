package day7;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LinksTesting5 {


	public static void main(String[] args) {

		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://google.com");
		driver.manage().window().maximize();
		List<WebElement> links=driver.findElements(By.tagName("a"));
		for(int i=0;i<links.size();i++)
		{
			if(links.get(i).isDisplayed())
			{
				System.out.println(links.get(i).getText());
				links.get(i).click();
				System.out.println(driver.getCurrentUrl());
				driver.navigate().back();
				links=driver.findElements(By.tagName("a"));
			}
		}
		driver.close();


	}
	
	
	
	
	

}
