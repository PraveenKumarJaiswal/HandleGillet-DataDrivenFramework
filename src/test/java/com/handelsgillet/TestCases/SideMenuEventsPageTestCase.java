package com.handelsgillet.TestCases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.handelsgillet.pages.LoginPage;
import com.handelsgillet.pages.SideMenuAllTabs;
import com.handelsgillet.pages.SideMenuEventsPage;
import com.handelsgillet.pages.SideMenuHomePage;
import com.handelsgillet.testBase.TestBase;
import com.handelsgillet.util.TestUtil;

public class SideMenuEventsPageTestCase  extends TestBase
{
	
	 	SideMenuAllTabs sideMenuAllTabs;
	 	SideMenuHomePage sidemenuhomepage ;
	 	SideMenuEventsPage sideMenuEventsPage;
	 	LoginPage loginPage;
	 	
	 	TestUtil testUtil;
	    String sheetName="CreateEvent" ;
	 	
	 	public SideMenuEventsPageTestCase()
	 	{
	 		super();
	 	}
	 	
	 	@BeforeMethod
	 	public void setUp() throws Throwable
	 	{
	 		initialization();
	 		
	 		loginPage = new LoginPage();
	 		loginPage.login("krogius@winwap.com", "123456", "SuperAdminLogin");
	 		sideMenuAllTabs= new SideMenuAllTabs();
	 		Thread.sleep(3000);
	 		sideMenuEventsPage = new SideMenuEventsPage();
	 	}
	 	
	 	@Test(priority = 0, enabled = false)
		public void verifyEventAllTabNavigation() throws Throwable
		{
			sideMenuAllTabs.clickOnSideEventsTab();
			Thread.sleep(3000);
			sideMenuEventsPage.clickOnAllEventsMenu();
			Thread.sleep(3000);
			sideMenuEventsPage.clickOnHGEventsMenus();
			Thread.sleep(3000);
			sideMenuEventsPage.clickOnAllEventsMenu();
			Thread.sleep(3000);
			sideMenuEventsPage.clickOnEventsTypeMenu();		
		}
	 	
		//=============================================================================================================
		//+++ To fetch integer value from excel sheet use single quote (') before the integer value in xlsx       +++++
		//=============================================================================================================

		 @DataProvider
	     public Object[][] getCreateEventTestData()
	     {
	         Object data[][] = TestUtil.getTestData(sheetName);
	         return data;
	     }
		 
		 @Test(priority=1, dataProvider="getCreateEventTestData")
			public void verifyCreateTags(String eName,String eSubject, String ePlace, String sDate, String eDate, 
					String sTime, String eTime, String seat, String spGuest, String fPerPerson, String fDesc,
					String desc, String msg) throws Throwable
			{
			 	sideMenuAllTabs.clickOnSideEventsTab();
			 	Thread.sleep(5000);
			 	sideMenuEventsPage.clickOnCreateEventsMenu();
			 	Thread.sleep(5000);
			 	sideMenuEventsPage.createEvents(eName, eSubject, ePlace, sDate, eDate, sTime, eTime, seat, spGuest, fPerPerson, fDesc, desc, msg);			 	
			
			 	sideMenuEventsPage.askQuestion();
			 
		 }

}
