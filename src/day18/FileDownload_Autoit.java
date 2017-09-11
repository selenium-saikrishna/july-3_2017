package day18;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class FileDownload_Autoit {

	public static void main(String[] args) throws IOException {
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://seleniumhq.org");
		driver.findElement(By.linkText("Download")).click();
		Sleeper.sleepTightInSeconds(3);
		driver.findElement(By.linkText("3.4.0")).click();
		Sleeper.sleepTightInSeconds(3);
		java.lang.Runtime.getRuntime().exec("C:\\Users\\gandh\\Desktop\\download.exe");

	}

}
