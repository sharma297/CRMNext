package TsetCases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.DealsPage;
import Pages.HomePage;
import Pages.LoginPage;

public class DealsPageTests extends TestBase{
	
	DealsPage dp;
	LoginPage lp;
	HomePage hp;
	
	public DealsPageTests() {
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		dp = new DealsPage();
		lp = new LoginPage();
		hp = new HomePage();
		
		lp.login(prop.getProperty("username"), prop.getProperty("password"));
		hp.leftHoverPanel();
		hp.clickOnDeals();
		
	}

	
	@Test
	public void validatePipelineF() {
		dp.checkPipelineFunct();
		dp.dropinCreate();
		
	}
	
	
	@AfterMethod
	public void tearDown() {
		//driver.quit();
	}
}
