package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Login  extends BaseClass{
	
	@Given("^the browser is launched and we navigate to the url$")
	public void the_browser_is_launched_and_we_navigate_to_the_url() throws Throwable {
	    driver=new FirefoxDriver();
	    driver.get("http://opensource.demo.orangehrmlive.com/");
	    
	}

	@When("^we enter the username and password$")
	public void we_enter_the_username_and_password() throws Throwable {
	    driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	    driver.findElement(By.id("txtPassword")).sendKeys("admin");
	}

	@When("^click on login button$")
	public void click_on_login_button() throws Throwable {
	    driver.findElement(By.id("btnLogin")).click();
	    Sleeper.sleepTightInSeconds(3);
	}

	@Then("^it should display welcome admin msg$")
	public void it_should_display_welcome_admin_msg() throws Throwable {
	    String expmsg="Welcome Admin";
	    String actmsg=driver.findElement(By.id("welcome")).getText();
	    Assert.assertEquals(actmsg, expmsg);
	}



}
