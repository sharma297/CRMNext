package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;

public class SignUpPage extends TestBase {
	
	
	
	@FindBy(xpath ="//*[@name = 'email']")
	WebElement signUpEmail;
	
	@FindBy(xpath ="//*[@name = 'phone']")
	WebElement signUpPhone;
	
	@FindBy(xpath ="//*[@type= 'checkbox']")
	WebElement signUpCheckbox;
	
	@FindBy(xpath ="//*[@class= 'recaptcha-checkbox-border']")
	WebElement signUpRobot;
	
	@FindBy(xpath ="//*[@type= 'submit']")
	WebElement signUpSubmit;
	
	public SignUpPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void entersignUpEmail() {
		signUpEmail.sendKeys("yashs0678@gmail.com");
	}
	
	public void entersignUpPhone() {
		signUpPhone.sendKeys("9717917974");
	}
	public void clicksignUpCheckbox() {
		signUpCheckbox.click();
	}
	public void clicksignUpRobot() {
		signUpRobot.click();
	}
	public void clicksignUpSubmit() {
		signUpSubmit.click();
	}
	
}
