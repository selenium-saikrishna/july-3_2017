package day24;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Keywords {
	FirefoxDriver driver=null;
	public void launchBrowser()
	{
		driver=new FirefoxDriver();
	}
	public void navigate()
	{
		driver.get("http://opensource.demo.orangehrmlive.com/");
	}
	public void enterUsername()
	{
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	}
	public void enterPassword()
	{
		driver.findElement(By.id("txtPassword")).sendKeys("admin");
	}
	public void clickLogin()
	{
		driver.findElement(By.id("btnLogin")).click();
	}
	
	
	

}
