package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.testng.Assert;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Logout  extends BaseClass{
	@When("^we click on welcome admin$")
	public void we_click_on_welcome_admin() throws Throwable {
	    driver.findElement(By.id("welcome")).click();
	    Sleeper.sleepTightInSeconds(2);
	}

	@When("^also click on logout$")
	public void also_click_on_logout() throws Throwable {
	    driver.findElement(By.linkText("Logout")).click();
	}

	@Then("^it should navigate to login page$")
	public void it_should_navigate_to_login_page() throws Throwable {
	    String expurl="http://opensource.demo.orangehrmlive.com/index.php/auth/login";
	    String acturl=driver.getCurrentUrl();
	    Assert.assertEquals(acturl, expurl);
	    }


}
