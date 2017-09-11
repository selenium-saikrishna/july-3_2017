package stepDefinition;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class DatadrivenTestinginCucumber_using_DataTable  extends BaseClass{
	@Given("^we have logged into orangehrm application$")
	public void we_have_logged_into_orangehrm_application() throws Throwable {
	    driver=new FirefoxDriver();
	    driver.get("http://opensource.demo.orangehrmlive.com/");
	    driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	    driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	    driver.findElement(By.id("txtPassword")).sendKeys("admin");
	    driver.findElement(By.id("btnLogin")).click();
	    Sleeper.sleepTightInSeconds(3);
	}

	@When("^we click on pim and add emp and enter empinfo$")
	public void we_click_on_pim_and_add_emp_and_enter_empinfo(DataTable arg1) throws Throwable {
	    List<List<String>> data=arg1.raw();
	    for(int i=1;i<data.size();i++)
	    {
	    	driver.findElement(By.xpath("//*[@id='menu_pim_viewPimModule']/b")).click();
	    	driver.findElement(By.linkText("Add Employee")).click();
	    	driver.findElement(By.id("firstName")).sendKeys(data.get(i).get(0));
	    	driver.findElement(By.id("middleName")).sendKeys(data.get(i).get(1));
	    	driver.findElement(By.id("lastName")).sendKeys(data.get(i).get(2));
	    	driver.findElement(By.id("employeeId")).clear();
	    	driver.findElement(By.id("employeeId")).sendKeys(data.get(i).get(3));
	    	driver.findElement(By.id("btnSave")).click();
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    }
	}


}
