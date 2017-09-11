package day18;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class Fileupload_Autoit {

	
	public static void main(String[] args) throws IOException {
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://imgur.com");
		driver.findElement(By.className("upload-btn-text")).click();
		driver.findElement(By.className("browse-btn")).click();
		Sleeper.sleepTightInSeconds(3);
		java.lang.Runtime.getRuntime().exec("C:\\Users\\gandh\\Desktop\\upload.exe");

	}

}
