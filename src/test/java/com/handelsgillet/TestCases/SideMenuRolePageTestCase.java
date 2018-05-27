package com.handelsgillet.TestCases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.handelsgillet.pages.LoginPage;
import com.handelsgillet.pages.SideMenuAllTabs;
import com.handelsgillet.pages.SideMenuHomePage;
import com.handelsgillet.pages.SideMenuNewApplicationsPage;
import com.handelsgillet.testBase.TestBase;

public class SideMenuRolePageTestCase extends TestBase
{
	SideMenuAllTabs sideMenuAllTabs;
	SideMenuHomePage sidemenuhomepage ;
	SideMenuRolePageTestCase sideMenuRolePageTestCase;
	SideMenuNewApplicationsPage sideMenuNewApplicationsPage;
	LoginPage loginPage;
	

	public SideMenuRolePageTestCase()
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
	
	@Test(priority = 0, enabled = true)
	public void verifyRolesView() throws Throwable
	{
		sidemenuhomepage = new SideMenuHomePage();
		sideMenuRolePageTestCase = new SideMenuRolePageTestCase();
		Thread.sleep(3000);
		sideMenuRolePageTestCase.verifyRolesView();
	}



}
