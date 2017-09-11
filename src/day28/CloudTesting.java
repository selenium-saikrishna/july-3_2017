package day28;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CloudTesting {
	@Parameters("browser")
	@Test
	public void dropdownTest(String b) throws MalformedURLException
	{
		DesiredCapabilities caps=null;
		if(b.equals("chrome"))
		{
			caps = DesiredCapabilities.chrome();
			caps.setCapability("platform", "Windows 10");
			caps.setCapability("version", "60.0");
		}
		else if(b.equals("opera"))
		{
			caps = DesiredCapabilities.opera();
			caps.setCapability("platform", "Linux");
			caps.setCapability("version", "12.15");
		}
		else if(b.equals("safari"))
		{
			caps = DesiredCapabilities.safari();
			caps.setCapability("platform", "macOS 10.12");
			caps.setCapability("version", "10.0");
		}
		String USERNAME = "sanjeeva";
		String ACCESS_KEY = "28bb196c-2dbb-4048-a5e9-33ac19ae596d";
		String URL = "https://" + USERNAME + ":" + ACCESS_KEY + "@ondemand.saucelabs.com:443/wd/hub";
		
		
		
		RemoteWebDriver driver=new RemoteWebDriver(new URL(URL),caps);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("http://newtours.demoaut.com");
		driver.findElement(By.linkText("REGISTER")).click();
		WebElement drop=driver.findElement(By.name("country"));
		List<WebElement> dropdown=drop.findElements(By.tagName("option"));
		System.out.println(dropdown.size());
		for(int i=0;i<dropdown.size();i++)
		{
			dropdown.get(i).click();
			if(dropdown.get(i).isSelected())
				System.out.println(dropdown.get(i).getText()+" is active");
			else
				System.out.println(dropdown.get(i).getText()+" is inactive");
		}
	}

}
