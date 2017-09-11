package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DatadrivenOnCucumber extends BaseClass{
	
	@Given("^the browser is launched and we open the the url$")
	public void the_browser_is_launched_and_we_open_the_the_url() throws Throwable {
	    driver=new FirefoxDriver();
	    driver.get("http://opensource.demo.orangehrmlive.com/");
	    
	}

	@When("^we enter the \"([^\"]*)\" and \"([^\"]*)\"$")
	public void we_enter_the_and(String arg1, String arg2) throws Throwable {
	    driver.findElement(By.id("txtUsername")).sendKeys(arg1);
	    driver.findElement(By.id("txtPassword")).sendKeys(arg2);
	}

	@When("^click on signin button$")
	public void click_on_signin_button() throws Throwable {
	    driver.findElement(By.id("btnLogin")).click();
	}

	@Then("^it should display \"([^\"]*)\"$")
	public void it_should_display(String expmsg) throws Throwable {
	    String actmsg=null; 
		if(expmsg.equals("Invalid credentials"))
			actmsg=driver.findElement(By.id("spanMessage")).getText();
		else if(expmsg.equals("Welcome Admin"))
			actmsg=driver.findElement(By.id("welcome")).getText();
		Assert.assertEquals(actmsg, expmsg);
	}



}
