package com.handelsgillet.TestCases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.handelsgillet.pages.LoginPage;
import com.handelsgillet.pages.SideMenuAllTabs;
import com.handelsgillet.pages.SideMenuHomePage;
import com.handelsgillet.pages.SideMenuManageTagsPage;
import com.handelsgillet.testBase.TestBase;
import com.handelsgillet.util.TestUtil;

public class SideMenuManageTagsTestCase extends TestBase
{
	LoginPage loginPage;
	SideMenuAllTabs sideMenuAllTabs;
	SideMenuManageTagsPage sideMenuManageTagsPage;
	
	TestUtil testUtil;
    String sheetName="CreateTag" ;
	
    public SideMenuManageTagsTestCase() 
	{
		super();
	}
    
    @BeforeMethod
	public void setUp() throws Throwable
	{
		initialization();
		loginPage=new LoginPage();
		loginPage.login("krogius@winwap.com", "123456", "SuperAdminLogin");
		sideMenuAllTabs = new SideMenuAllTabs();
		sideMenuManageTagsPage = new SideMenuManageTagsPage();
	}
    

	//=============================================================================================================
	//+++ To fetch integer value from excel sheet use single quote (') before the integer value in xlsx       +++++
	//=============================================================================================================

	 @DataProvider
     public Object[][] getCreateTagTestData()
     {
         Object data[][] = TestUtil.getTestData(sheetName);
         return data;
        
     }
	 
	 @Test(priority=0, dataProvider="getCreateTagTestData")
		public void verifyCreateTags(String tagName, String tagDesc) throws Throwable
		{
		 	sideMenuAllTabs.clickOnSideManageTagsTab();
		 	Thread.sleep(5000);
		 	sideMenuManageTagsPage.createTag(tagName, tagDesc);
		}
		
		
		@AfterMethod
		public void tearDown()
		{
			driver.quit();
		}
	

}
