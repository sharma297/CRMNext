package TsetCases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.HomePage;
import Pages.LoginPage;

public class LoginPageTests extends TestBase {
	LoginPage lp;
	HomePage hp;
	
	
	public LoginPageTests() {
		super(); // this is used to call the super class constructor
	}
	
	@BeforeTest
	public void setUp() {
		
		initialization();
		
		 lp = new LoginPage();
	}
	
	
	
	@Test
	public void loginPageTitleTest() {
		String title = lp.validateLoginPageTitle();
		Assert.assertEquals(title, "Cogmento CRM");
	}
	
	
	
	
	@Test
	public void loginTest() {
		hp =lp.login(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	@AfterTest
	public void tearDown() {
		driver.quit();
	}

}
