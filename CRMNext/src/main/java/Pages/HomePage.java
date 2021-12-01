package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;

public class HomePage extends TestBase {
	
	@FindBy(css= ".ui.left.fixed.vertical.icon.menu.sidebar-dark.left-to-right")
	WebElement leftHover;
	
	@FindBy(xpath = "//*[contains(text(),'Hemant Sharma')]")
	WebElement usernameonHome;
	
	@FindBy(xpath = "//*[contains(text(),'Free account')]")
	WebElement freeacount;
	
	@FindBy(xpath ="//*[contains(text(),'Pay using a Debit or Credit Card')]")
	WebElement textVerifyofFreeAcount;
	
	@FindBy(xpath ="//*[contains(text(),'Deals')]")
	WebElement clickDeals;
	
	
 public HomePage() {
	 
	 PageFactory.initElements(driver, this);
 }
 
 public  void leftHoverPanel() {
	 
	 Actions ac = new Actions(driver);
	 ac.moveToElement(leftHover);
 }
 
 public boolean displayUsername() {
	 return usernameonHome.isDisplayed();
 }
 
 public boolean freeAccountFunct() {
	 freeacount.click();
	 return textVerifyofFreeAcount.isDisplayed();
	 
 }
 
 public DealsPage clickOnDeals() {
	 leftHoverPanel();
	 try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	 clickDeals.click();
	 return new DealsPage();
 }
}
