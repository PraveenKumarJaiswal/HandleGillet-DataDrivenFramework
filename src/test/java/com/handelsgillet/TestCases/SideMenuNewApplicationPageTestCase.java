package com.handelsgillet.TestCases;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.handelsgillet.pages.LoginPage;
import com.handelsgillet.pages.SideMenuAllTabs;
import com.handelsgillet.pages.SideMenuEventsPage;
import com.handelsgillet.pages.SideMenuGroupsPage;
import com.handelsgillet.pages.SideMenuNewApplicationsPage;
import com.handelsgillet.testBase.TestBase;
import com.handelsgillet.pages.SideMenuHomePage;

public class SideMenuNewApplicationPageTestCase extends TestBase
{  
	SideMenuAllTabs sideMenuAllTabs;
	SideMenuHomePage sidemenuhomepage ;

	SideMenuNewApplicationsPage sideMenuNewApplicationsPage;
	LoginPage loginPage;
	

	public SideMenuNewApplicationPageTestCase()
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
	}

	//=============================================================================================================
	//+++++++++++++   View all table data and view New Applicant form and click on cancel button    +++++++++++++++
	//=============================================================================================================

	
	@Test(priority = 0, enabled = false)
	public void verifyNewApplicationViewAndCancelClick() throws Throwable
	{
		sidemenuhomepage = new SideMenuHomePage();
		sidemenuhomepage.clickOnMoreInfoNewApplications();
		Thread.sleep(3000);
		sideMenuNewApplicationsPage = new SideMenuNewApplicationsPage();
		sideMenuNewApplicationsPage.ViewNewApplicationTableData();
		Thread.sleep(3000);
		sideMenuNewApplicationsPage.ViewApplicationFormAndCancel();
		Thread.sleep(3000);
		driver.quit();			
	}
	

	//=============================================================================================================
	//++++++++++++++++++++++   View All New Application and accept them      +++++++++++++++++++++++++++++
	//=============================================================================================================

	@Test(priority = 1, enabled = false)
	public void verifyNewApplicationViewAndAcceptApplication() throws Throwable
	{
		sidemenuhomepage = new SideMenuHomePage();
		sidemenuhomepage.clickOnMoreInfoNewApplications();
		Thread.sleep(3000);
		sideMenuNewApplicationsPage = new SideMenuNewApplicationsPage();
		sideMenuNewApplicationsPage.ViewNewApplicationTableData();
		Thread.sleep(3000);
		sideMenuNewApplicationsPage.ViewApplicationFormAndAcceptApplication();
		Thread.sleep(3000);
		driver.quit();			
	}
	//=============================================================================================================
	//++++++++++++++++++++++   View All New Application and Delete them      +++++++++++++++++++++++++++++
	//=============================================================================================================

		@Test(priority = 2, enabled = false)
		public void verifyNewApplicationViewAndDeleteApplication() throws Throwable
		{
			sidemenuhomepage = new SideMenuHomePage();
			sidemenuhomepage.clickOnMoreInfoNewApplications();
			Thread.sleep(3000);
			sideMenuNewApplicationsPage = new SideMenuNewApplicationsPage();
			sideMenuNewApplicationsPage.ViewNewApplicationTableData();
			Thread.sleep(3000);
			sideMenuNewApplicationsPage.ViewApplicationFormAndDeleteApplication();
			Thread.sleep(3000);
			driver.quit();			
		}
		//=============================================================================================================
		//++++++++++++++++++++++   View All New Application and Edit & cancel them      +++++++++++++++++++++++++++++
		//=============================================================================================================

			@Test(priority = 3, enabled = true)
			public void verifyNewApplicationViewAndEditCancelApplication() throws Throwable
			{
				sidemenuhomepage = new SideMenuHomePage();
				sidemenuhomepage.clickOnMoreInfoNewApplications();
				Thread.sleep(3000);
				sideMenuNewApplicationsPage = new SideMenuNewApplicationsPage();
				sideMenuNewApplicationsPage.ViewNewApplicationTableData();
				Thread.sleep(5000);
				sideMenuNewApplicationsPage.ViewApplicationFormAndEdit_SaveApplication();
				Thread.sleep(3000);
				driver.quit();			
			}
}
