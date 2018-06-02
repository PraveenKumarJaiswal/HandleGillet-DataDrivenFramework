package com.handelsgillet.TestCases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.handelsgillet.pages.LoginPage;
import com.handelsgillet.pages.SideMenuAllTabs;
import com.handelsgillet.pages.SideMenuHomePage;
import com.handelsgillet.pages.SideMenuMemberTypePage;
import com.handelsgillet.pages.SideMenuRolePage;
import com.handelsgillet.testBase.TestBase;

public class SideMenuMemberTypeTestCase  extends TestBase
{
	SideMenuAllTabs sideMenuAllTabs;
	SideMenuMemberTypePage sideMenuMemberTypePage;
	LoginPage loginPage;
	

	public SideMenuMemberTypeTestCase()
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
		sideMenuMemberTypePage = new SideMenuMemberTypePage();
		
	}
	@Test(priority = 1, enabled = false)
	public void verifyMemberTypeSearch() throws Throwable
	{
		sideMenuAllTabs.clickOnSideMemberTypesTab();
		Thread.sleep(3000);
		//sideMenuMemberTypePage = new SideMenuRolePage();
		sideMenuMemberTypePage.verifySearch();
		Thread.sleep(3000);
		sideMenuMemberTypePage.ViewmemberTypeTableData();
		Thread.sleep(3000);
		
		driver.quit();			
	}
	
	@Test(priority = 2, enabled = false)
	public void verifyMemberTypeDeleteCancel() throws Throwable
	{
		sideMenuAllTabs.clickOnSideMemberTypesTab();
		Thread.sleep(3000);
		//sideMenuMemberTypePage = new SideMenuRolePage();
		sideMenuMemberTypePage.ViewMemberTypeDeleteAndCancel();
		Thread.sleep(3000);
		
		driver.quit();			
	}
	@Test(priority = 3, enabled = false)
	public void verifyMemberTypeDeleteYes() throws Throwable
	{
		sideMenuAllTabs.clickOnSideMemberTypesTab();
		Thread.sleep(3000);
		//sideMenuMemberTypePage = new SideMenuRolePage();
		sideMenuMemberTypePage.ViewMemberTypeDeleteAndYes();
		Thread.sleep(3000);
		
		driver.quit();			
	}
	@Test(priority = 4, enabled = true)
	public void verifyaddNewTypeandCancel() throws Throwable
	{
		sideMenuAllTabs.clickOnSideMemberTypesTab();
		Thread.sleep(3000);
		sideMenuMemberTypePage.addNewTypeandCancel("Hello", "Testing");
		Thread.sleep(3000);
		driver.quit();			
	}
	@Test(priority = 5, enabled = false)
	public void verifyaddNewTypeandCreate() throws Throwable
	{
		sideMenuAllTabs.clickOnSideMemberTypesTab();
		Thread.sleep(3000);
		sideMenuMemberTypePage.addNewTypeandCreate("Hello", "Testing");
		Thread.sleep(3000);
		driver.quit();			
	}
}
