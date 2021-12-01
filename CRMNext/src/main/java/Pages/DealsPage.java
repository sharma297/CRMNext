package Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;

public class DealsPage extends TestBase {
	
	
	@FindBy(css =".ui.fitted.read-only.checkbox>label")
	WebElement dealcheckbox;
	
	@FindBy(xpath = "//*[contains(text(),'Pipeline')]")
	WebElement piplineButton;
	
	@FindBy(xpath = "//*[contains(text(),'Cancel')]")
	WebElement piplineCancel;
	
	@FindBy(xpath = "//*[@name='pipeline_name']")
	WebElement SavePipeline;
	
	@FindBy(xpath="(//*[contains(text(),'Create')])[2]")
	WebElement clickCreate;
	
	
	public DealsPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void clickCheckBox() {
		dealcheckbox.click();
		
	}
	
	public void dropinCreate() {
		List<WebElement> list =driver.findElements(By.cssSelector(".visible.menu.transition>div"));
		for(int i=1 ; i<=list.size();i++) {
			if(list.get(i).getText().contains("Amount")) {
				list.get(i).click();
				break;
				
			}
		}
		SavePipeline.sendKeys("Trial");
		clickCreate.click();
		
	}
	
	public void checkPipelineFunct() {
		
		piplineButton.click();
		
	}
	

}
