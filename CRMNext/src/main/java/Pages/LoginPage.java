package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;

public class LoginPage extends TestBase{
	
	//pagefactory
	
	@FindBy(name ="email")
	WebElement username;
	
	@FindBy(name = "password")
	WebElement password;
	
	@FindBy(xpath = "(//*[contains(text(),'Login')])[1]")
	WebElement loginbutton;
	 
	@FindBy( xpath = "//*[contains(text(),'Sign Up')]")
    WebElement signup;
	
	@FindBy( xpath = "//*[contains(text(),'Cogmento CRM')]")
	WebElement titlepage;
	
	@FindBy(xpath = "//*[contains(text(),'Sign Up')]")
	WebElement signUpButton;
	
	@FindBy(how = How.CSS, using = ".onesignal-bell-launcher-button>svg>circle+path")
	public WebElement bellIcon;
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	public String validateLoginPageTitle() {
		return driver.getTitle();
	}
	
	public boolean validateTitleName() {
		return titlepage.isDisplayed();
	}
	
	public boolean validateBellIcon() {
		return bellIcon.isDisplayed();
	}
	
	public SignUpPage clickSignUp() {
		signUpButton.click();
		return new SignUpPage();
	}
	
	public HomePage login(String un, String pwd)  {
		username.sendKeys(un);
		
		try {
			Thread.sleep(6000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		password.sendKeys(pwd);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		loginbutton.click();
		
		return new HomePage();
		
	}
}
