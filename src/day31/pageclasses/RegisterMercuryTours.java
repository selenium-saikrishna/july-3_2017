package day31.pageclasses;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterMercuryTours {
	
	@FindBy(name="firstName")
	WebElement firstName;
	@FindBy(name="lastName")
	WebElement lastName;
	@FindBy(name="phone")
	WebElement phone;
	@FindBy(name="userName")
	WebElement email;
	@FindBy(name="address1")
	WebElement address;
	@FindBy(name="city")
	WebElement city;
	@FindBy(name="state")
	WebElement state;
	@FindBy(name="postalCode")
	WebElement postalCode;
	@FindBy(name="country")
	WebElement country;
	@FindBy(name="email")
	WebElement userName;
	@FindBy(name="password")
	WebElement password;
	@FindBy(name="confirmPassword")
	WebElement confirmPassword;
	@FindBy(name="register")
	WebElement submit;
	public void contactInformation()
	{
		firstName.sendKeys("Sai");
		lastName.sendKeys("Krishna");
		phone.sendKeys("222-333");
		email.sendKeys("Sai@gmail.com");
		address.sendKeys("12/3/3");
		city.sendKeys("HYD");
		state.sendKeys("TS");
		postalCode.sendKeys("000999888");
		userName.sendKeys("tutorial");
		password.sendKeys("tutorial");
		confirmPassword.sendKeys("tutorial");
		submit.click();
	}
	
	
	

}
