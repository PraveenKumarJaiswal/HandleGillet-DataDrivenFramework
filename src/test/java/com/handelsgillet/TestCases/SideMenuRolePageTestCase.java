package com.handelsgillet.TestCases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.handelsgillet.pages.LoginPage;
import com.handelsgillet.pages.SideMenuAllTabs;
import com.handelsgillet.pages.SideMenuHomePage;
import com.handelsgillet.pages.SideMenuManageArticlePage;
import com.handelsgillet.pages.SideMenuNewApplicationsPage;
import com.handelsgillet.pages.SideMenuRolePage;
import com.handelsgillet.testBase.TestBase;

public class SideMenuRolePageTestCase extends TestBase
{
	SideMenuAllTabs sideMenuAllTabs;
	SideMenuHomePage sidemenuhomepage ;
	SideMenuRolePage sideMenuRolePage;
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
		sideMenuRolePage = new SideMenuRolePage();
		
	}

	@Test(priority = 1, enabled = true)
	public void verifyRoleSearch() throws Throwable
	{
		sideMenuAllTabs.clickOnSideRolesTab();
		Thread.sleep(3000);
		sideMenuRolePage = new SideMenuRolePage();
		sideMenuRolePage.verifySearch();
		Thread.sleep(3000);
		sideMenuRolePage.ViewRolesTableData();
		Thread.sleep(3000);
		
		driver.quit();			
	}
	
	@Test(priority = 2, enabled = true)
	public void verifyRoleViewAndCancel() throws Throwable
	{
		sideMenuAllTabs.clickOnSideRolesTab();
		Thread.sleep(3000);
		sideMenuRolePage = new SideMenuRolePage();
		sideMenuRolePage.ViewRolesTableData();
		Thread.sleep(3000);
		sideMenuRolePage.ViewRolesFormAndCancel();
		Thread.sleep(3000);
		
		driver.quit();			
	}
	@Test(priority = 3, enabled = true)
	public void verifyRoleDeleteNo() throws Throwable
	{
		sideMenuAllTabs.clickOnSideRolesTab();
		Thread.sleep(3000);
		sideMenuRolePage = new SideMenuRolePage();
		sideMenuRolePage.ViewRolesTableData();
		Thread.sleep(3000);
		sideMenuRolePage.deleteRoleNo();
		Thread.sleep(3000);
		
		driver.quit();			
	}
	@Test(priority = 4, enabled = true)
	public void verifyRoleDeleteYes() throws Throwable
	{
		sideMenuAllTabs.clickOnSideRolesTab();
		Thread.sleep(3000);
		sideMenuRolePage = new SideMenuRolePage();
		sideMenuRolePage.ViewRolesTableData();
		Thread.sleep(3000);
		sideMenuRolePage.deleteRoleYes();
		Thread.sleep(3000);
		
		driver.quit();			
	}
	@Test(priority = 5, enabled = true)
	public void verifyCreateRoleCancel() throws Throwable
	{
		sideMenuAllTabs.clickOnSideRolesTab();
		Thread.sleep(3000);
		sideMenuRolePage = new SideMenuRolePage();
		sideMenuRolePage.createRoleCancel("Admin", "Testing Admin");
		Thread.sleep(3000);
		System.out.println("Created and canceled Admin");
		driver.quit();			
	}
	
	@Test(priority = 6, enabled = true)
	public void verifyCreateRoleCreate() throws Throwable
	{
		sideMenuAllTabs.clickOnSideRolesTab();
		Thread.sleep(3000);
		sideMenuRolePage = new SideMenuRolePage();
		sideMenuRolePage.createRoleCancel("Admin", "Testing Admin");
		Thread.sleep(3000);
		System.out.println("Created and saved Admin");
		driver.quit();			
	}
	
	
}
