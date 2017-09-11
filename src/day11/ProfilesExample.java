package day11;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class ProfilesExample {

	public static void main(String[] args) {
		ProfilesIni pr=new ProfilesIni();
		FirefoxProfile fp=pr.getProfile("SeleniumProfile");
		FirefoxDriver driver=new FirefoxDriver(fp);
		driver.get("http://msn.com");

			
	}

}
