package day29.junit;

import org.junit.Test;
import org.openqa.selenium.By;


public class Logout  extends BaseClass{
@Test
public void logoutTest()
{
	driver.findElement(By.linkText("Welcome Admin")).click();
	driver.findElement(By.linkText("Logout")).click();
}
}
