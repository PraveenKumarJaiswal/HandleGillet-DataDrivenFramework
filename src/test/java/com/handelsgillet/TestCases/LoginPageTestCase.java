package com.handelsgillet.TestCases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.handelsgillet.pages.SideMenuEventsPage;
import com.handelsgillet.pages.SideMenuHomePage;
import com.handelsgillet.pages.LoginPage;
import com.handelsgillet.testBase.TestBase;
import com.handelsgillet.util.TestUtil;

public class LoginPageTestCase extends TestBase
{
	LoginPage loginPage;
	SideMenuHomePage homePage;
	
	TestUtil testUtil;
    String sheetName="SuperAdminLogin" ;
	
	public LoginPageTestCase() 
	{
		super();
	}
	
	@BeforeMethod
	public void setUp()
	{
		initialization();
		loginPage=new LoginPage();
	}
	
	//Verify Title of the Login Page
	@Test(priority=1)
	public void loginPageTitleTest()
	{
		String title = loginPage.validateloginPageTitle();
		Assert.assertEquals(title, "HANDELSGILLET");	
	}
	
	
	//=============================================================================================================
	//++++++++++++++++++++++++++++++++++++ Verify Logo on Login Page.      ++++++++++++++++++++++++++++++++++++++++
	//=============================================================================================================

	
	@Test(priority=2, enabled=false)
	public void hgLogoTest()
	{
		boolean flag = loginPage.validateImage();
		Assert.assertTrue(flag);
	}  
	

	//=============================================================================================================
	//+++ To fetch integer value from excel sheet use single quote (') before the integer value in xlsx       +++++
	//=============================================================================================================

	 @DataProvider
     public Object[][] getHGSuperAdminLoginTestData()
     {
         Object data[][] = TestUtil.getTestData(sheetName);
         return data;
        
     }
	
	@Test(priority=3, dataProvider="getHGSuperAdminLoginTestData")
	public void loginTest(String un, String pwd) throws Throwable
	{
		loginPage.login(un, pwd, sheetName);
	}
	
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
	
}
