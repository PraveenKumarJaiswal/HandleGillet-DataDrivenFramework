package com.handelsgillet.TestCases;

import org.testng.annotations.AfterMethod;
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
	 		loginPage.login("kimm@gmail.com", "123456", "SuperAdminLogin");
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
		 
		 @Test(priority=1, enabled = false, dataProvider="getCreateEventTestData")
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
			 	sideMenuEventsPage.selectMemberForEvent();
			 
		 }
		 
		 @Test(priority =2, enabled = false)
			public void verifyHGEventSearch() throws Throwable
			{
				sideMenuAllTabs.clickOnSideEventsTab();
				Thread.sleep(3000);
				sideMenuEventsPage.clickOnHGEventsMenus();
				Thread.sleep(3000);
				sideMenuEventsPage.verifySearch();
			}
		 @Test(priority =3, enabled = false)
			public void verifyHGEventSearchByDate() throws Throwable
			{
				sideMenuAllTabs.clickOnSideEventsTab();
				Thread.sleep(3000);
				sideMenuEventsPage.clickOnHGEventsMenus();
				Thread.sleep(3000);
				sideMenuEventsPage.verifySearchByDate();
			}
		 
		 @Test(priority =4, enabled = false)
			public void VerifyApplicationFormAndCancel() throws Throwable
			{
				sideMenuAllTabs.clickOnSideEventsTab();
				Thread.sleep(3000);
				sideMenuEventsPage.clickOnHGEventsMenus();
				Thread.sleep(3000);
				sideMenuEventsPage.ViewApplicationFormAndCancel();
			}
		 
		 @Test(priority =5, enabled = false)
			public void VerifyHGFormAndEdit_CancelApplication() throws Throwable
			{
				sideMenuAllTabs.clickOnSideEventsTab();
				Thread.sleep(3000);
				sideMenuEventsPage.clickOnHGEventsMenus();
				Thread.sleep(3000);
				sideMenuEventsPage.ViewHGFormAndEdit_CancelApplication();
			}
		 
		 @Test(priority =6, enabled = false)
			public void VerifyHGEventFormAndEdit_UpdateApplication() throws Throwable
			{
				sideMenuAllTabs.clickOnSideEventsTab();
				Thread.sleep(3000);
				sideMenuEventsPage.clickOnHGEventsMenus();
				Thread.sleep(3000);
				sideMenuEventsPage.ViewHGEventFormAndEdit_UpdateApplication();
			}
		 
		 @Test(priority =7, enabled = false)
			public void VerifyHGEventFormQuestionare() throws Throwable
			{
				sideMenuAllTabs.clickOnSideEventsTab();
				Thread.sleep(3000);
				sideMenuEventsPage.clickOnCreateEventsMenu();
				Thread.sleep(3000);
				sideMenuEventsPage.clickOnHGEventsMenus();
				Thread.sleep(3000);
				sideMenuEventsPage.ViewHGEventFormQuestionare();
			}
		 
		 
		 @Test(priority =8, enabled = true)
			public void VerifyHGEventFormInviteMember() throws Throwable
			{
				sideMenuAllTabs.clickOnSideEventsTab();
				Thread.sleep(3000);
				sideMenuEventsPage.clickOnCreateEventsMenu();
				Thread.sleep(3000);
				sideMenuEventsPage.clickOnHGEventsMenus();
				Thread.sleep(3000);
				sideMenuEventsPage.ViewHGEventFormInviteMember();
			}
		 //
		 @Test(priority = 9, enabled = false)
			public void verifyClickonMembersAndBackButton() throws Throwable
			{
				sideMenuAllTabs.clickOnSideEventsTab();
				Thread.sleep(3000);
				sideMenuEventsPage.clickOnCreateEventsMenu();
				Thread.sleep(3000);
				sideMenuEventsPage.clickOnHGEventsMenus();
				Thread.sleep(3000);
				sideMenuEventsPage.clickonMembersAndBackButton();
			}
		 
		 //
		 @Test(priority = 10, enabled = false)
			public void verifyCancelEventAndNoButton() throws Throwable
			{
				sideMenuAllTabs.clickOnSideEventsTab();
				Thread.sleep(3000);
				sideMenuEventsPage.clickOnCreateEventsMenu();
				Thread.sleep(3000);
				sideMenuEventsPage.clickOnHGEventsMenus();
				Thread.sleep(3000);
				sideMenuEventsPage.cancelEventAndNoButton();
			}
		 
		 @Test(priority = 11, enabled = false)
			public void verifyCancelEventAndYesButton() throws Throwable
			{
				sideMenuAllTabs.clickOnSideEventsTab();
				Thread.sleep(3000);
				sideMenuEventsPage.clickOnCreateEventsMenu();
				Thread.sleep(3000);
				sideMenuEventsPage.clickOnHGEventsMenus();
				Thread.sleep(3000);
				sideMenuEventsPage.cancelEventAndYesButton();
			}
		 
		//=============================================================================================================
		//++++++++++++++++++++++++++++++++++++ Verify EventsTypeTab Test cases.      ++++++++++++++++++++++++++++++++++++++++
		//=============================================================================================================
		 @Test(priority = 12, enabled = true)
			public void verifygroupsSearchEventsType() throws Throwable
			{
				sideMenuAllTabs.clickOnSideEventsTab();
				Thread.sleep(3000);
				sideMenuEventsPage.clickOnEventsTypeMenu();
				Thread.sleep(3000);
				sideMenuEventsPage.groupsSearch();
			}
		 
		 @Test(priority = 13, enabled = true)
			public void verifyClickOnEventsTypeMenuCreateEventAndCancel() throws Throwable
			{
				sideMenuAllTabs.clickOnSideEventsTab();
				Thread.sleep(3000);
				sideMenuEventsPage.clickOnEventsTypeMenu();
				Thread.sleep(3000);
				sideMenuEventsPage.clickOnEventsTypeMenuCreateEventAndCancel();
			}
		 
		 @Test(priority = 13, enabled = true)
			public void verifyClickOnEventsTypeMenuCreateEventAndCreate() throws Throwable
			{
				sideMenuAllTabs.clickOnSideEventsTab();
				Thread.sleep(3000);
				sideMenuEventsPage.clickOnEventsTypeMenu();
				Thread.sleep(3000);
				sideMenuEventsPage.clickOnEventsTypeMenuCreateEventAndCreate();
			}
		 
		
		 @AfterMethod
			public void tearDown()
			{
				driver.quit();
			}
}
