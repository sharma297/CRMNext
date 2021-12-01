package TsetCases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.LoginPage;
import Pages.SignUpPage;

public class SignUpPageTests extends TestBase{
	
	LoginPage lp;
	SignUpPage sp ;
	
	public SignUpPageTests() {
		super();
	}
	
	
	@BeforeMethod
	public void setUp() {
		initialization();
		lp = new LoginPage();
		sp= new SignUpPage();
		
	}
	
	
	@Test
	public void Register() {
		
		lp.clickSignUp();
		
		sp.entersignUpEmail();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		sp.entersignUpPhone();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		sp.clicksignUpCheckbox();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
//		sp.clicksignUpRobot();
//		try {
//			Thread.sleep(3000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		sp.clicksignUpSubmit();
		
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
