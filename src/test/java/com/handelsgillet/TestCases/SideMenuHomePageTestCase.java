package com.handelsgillet.TestCases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.handelsgillet.pages.LoginPage;
import com.handelsgillet.pages.SideMenuAllTabs;
import com.handelsgillet.pages.SideMenuEventsPage;
import com.handelsgillet.pages.SideMenuGroupsPage;
import com.handelsgillet.pages.SideMenuNewApplicationsPage;
import com.handelsgillet.testBase.TestBase;
import com.handelsgillet.pages.SideMenuHomePage;

public class SideMenuHomePageTestCase extends TestBase
{  
	SideMenuHomePage sidemenuhomepage ;
	SideMenuAllTabs sideMenuAllTabs;
	SideMenuNewApplicationsPage sideMenuNewApplicationsPage;
	SideMenuGroupsPage sideMenuGroupsPage; 
	SideMenuEventsPage sideMenuEventsPage;
	LoginPage loginPage;
	

	public SideMenuHomePageTestCase()
	{
		super();
	}
	
	@BeforeMethod
	public void setUp() throws Throwable
	{
		initialization();
		
		loginPage = new LoginPage();
		loginPage.login("krogius@winwap.com", "123456", "SuperAdminLogin");
		
		Thread.sleep(3000);
		sideMenuAllTabs= new SideMenuAllTabs();
		sideMenuGroupsPage = new SideMenuGroupsPage();
		sideMenuNewApplicationsPage = new SideMenuNewApplicationsPage();
		
	}

	
	@Test(priority = 0)
	public void homePageFeatures() throws Throwable
	{
		sidemenuhomepage = new SideMenuHomePage();
		sidemenuhomepage.clickOnMoreInfoNewApplications();
		Thread.sleep(3000);
		
		driver.navigate().back();
		
		sidemenuhomepage.clickOnMoreInfoNewEvents();
		Thread.sleep(3000);
		

		driver.navigate().back();
		
		sidemenuhomepage.clickOnMoreInfoNewGroups();
		Thread.sleep(3000);

		driver.navigate().back();
		
		sidemenuhomepage.clickOnMoreInfoLoggedInMembers();
		Thread.sleep(3000);
		
		driver.quit();
		// For Code push 
		
	}

}
