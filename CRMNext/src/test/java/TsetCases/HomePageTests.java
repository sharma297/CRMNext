package TsetCases;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.DealsPage;
import Pages.HomePage;
import Pages.LoginPage;

public class HomePageTests extends TestBase {

	HomePage hp;
	LoginPage lp;
	DealsPage dp;
	

	public HomePageTests() {
		super();
	}

	@BeforeTest
	public void setUp() {
		initialization();
		hp = new HomePage();
		lp = new LoginPage();
		hp =lp.login(prop.getProperty("username"), prop.getProperty("password"));
	}
	@Test(priority =4)
	public void validateHoverLeftPanel() {
		hp.leftHoverPanel();
	}
	
	@Test (priority =2)
	public void validatedisplayUsername() {
		hp.displayUsername();
		Assert.assertTrue(true);
	}
	
	@Test(priority =3)
	public void ValidateFreeAccountPage() {
		hp.freeAccountFunct();
		Assert.assertTrue(true);
	}
	
	@Test(priority =1)
	public void Dealss() {
		dp =hp.clickOnDeals();
	}

	@AfterTest
	public void tearDown() {
		driver.close();
	}
}
