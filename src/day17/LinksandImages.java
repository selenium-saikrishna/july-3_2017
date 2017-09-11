package day17;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LinksandImages {

	public static void main(String[] args) {
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://yahoo.com");
		List<WebElement> elements=driver.findElements(By.tagName("a"));
		System.out.println("total links count is "+elements.size());
		elements.addAll(driver.findElements(By.tagName("img")));
		System.out.println("Images and links count is" +elements.size());
	}

}
