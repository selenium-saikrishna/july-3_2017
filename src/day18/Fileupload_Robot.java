package day18;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class Fileupload_Robot {

	public static void main(String[] args) throws AWTException {
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://imgur.com");
		driver.findElement(By.className("upload-btn-text")).click();
		driver.findElement(By.className("browse-btn")).click();
		Sleeper.sleepTightInSeconds(5);
		Robot rb=new Robot();
		rb.keyPress(KeyEvent.VK_F);
		rb.keyRelease(KeyEvent.VK_F);
		rb.keyPress(KeyEvent.VK_L);
		rb.keyRelease(KeyEvent.VK_L);
		rb.keyPress(KeyEvent.VK_O);
		rb.keyRelease(KeyEvent.VK_O);
		rb.keyPress(KeyEvent.VK_W);
		rb.keyRelease(KeyEvent.VK_W);
		rb.keyPress(KeyEvent.VK_E);
		rb.keyRelease(KeyEvent.VK_E);
		rb.keyPress(KeyEvent.VK_R);
		rb.keyRelease(KeyEvent.VK_R);
		rb.keyPress(KeyEvent.VK_PERIOD);
		rb.keyRelease(KeyEvent.VK_PERIOD);
		rb.keyPress(KeyEvent.VK_J);
		rb.keyRelease(KeyEvent.VK_J);
		rb.keyPress(KeyEvent.VK_P);
		rb.keyRelease(KeyEvent.VK_P);
		rb.keyPress(KeyEvent.VK_E);
		rb.keyRelease(KeyEvent.VK_E);
		rb.keyPress(KeyEvent.VK_G);
		rb.keyRelease(KeyEvent.VK_G);
		Sleeper.sleepTightInSeconds(3);
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		

	}

}
