package day4;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LinksTesting1 {
	public static void main(String[] args) {
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://google.com");
		/*String exptitle="Gmail";
		driver.findElement(By.linkText("Gmail")).click();
		String actitle=driver.getTitle();
		if(exptitle.equals(actitle))
			System.out.println("Gmail link is working correctly");
		else
			System.out.println("gmail link is not working correctly");
		driver.close();*/

	}

}
