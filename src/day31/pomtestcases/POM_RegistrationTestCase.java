package day31.pomtestcases;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import day31.pageclasses.LeftMenu;
import day31.pageclasses.RegisterMercuryTours;
import day31.pageclasses.WelcomeMercuryTours;

public class POM_RegistrationTestCase {
	@Test
	public void registration()
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://newtours.demoaut.com");
		WelcomeMercuryTours wmPage=PageFactory.initElements(driver, WelcomeMercuryTours.class);
		LeftMenu lmPage=PageFactory.initElements(driver,LeftMenu.class);
		RegisterMercuryTours rmPage=PageFactory.initElements(driver,RegisterMercuryTours.class);
		wmPage.register();
		rmPage.contactInformation();
		lmPage.home();
		wmPage.findAFlight("tutorial","tutorial");
		
		
		
		
		
		
		
		
	}

}
