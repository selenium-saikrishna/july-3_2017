package day10;

import org.openqa.selenium.phantomjs.PhantomJSDriver;

public class HeadlessTesting2 {

	public static void main(String[] args) {
		System.setProperty("phantomjs.binary.path","c:\\phantomjs.exe");
		PhantomJSDriver driver=new PhantomJSDriver();
		driver.get("http://google.com");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());

	}

}
