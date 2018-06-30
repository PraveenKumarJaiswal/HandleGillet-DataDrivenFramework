package com.handelsgillet.TestCases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.handelsgillet.pages.LoginPage;
import com.handelsgillet.pages.SideMenuAllTabs;
import com.handelsgillet.pages.SideMenuGroupsPage;
import com.handelsgillet.pages.SideMenuHomePage;
import com.handelsgillet.testBase.TestBase;

public class SideMenuGroupsPageTestCase  extends TestBase
{
	SideMenuAllTabs sideMenuAllTabs;
	SideMenuHomePage sidemenuhomepage ;
	SideMenuGroupsPage sideMenuGroupsPage;
	LoginPage loginPage;
	
	public SideMenuGroupsPageTestCase()
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
		sideMenuGroupsPage = new SideMenuGroupsPage();
		
	}
	

	//=============================================================================================================
	//++++++++++++++++++++++++++++++++++++ Verify Groups Tab.      ++++++++++++++++++++++++++++++++++++++++
	//=============================================================================================================

	@Test(priority = 0, enabled = true)
	public void verifygroupSearch() throws Throwable
	{
		sideMenuAllTabs.clickOnSideGroupsTab();
		Thread.sleep(3000);
		sideMenuGroupsPage.groupsSearch();
		Thread.sleep(3000);
		sideMenuGroupsPage.viewTableData();		
	}
	
	@Test(priority = 1, enabled = true)
	public void verifyViewGroupAndBack() throws Throwable
	{
		sideMenuAllTabs.clickOnSideGroupsTab();
		Thread.sleep(3000);
		sideMenuGroupsPage.viewGuoupAndBack();			
	}
	
	@Test(priority = 2, enabled = true)
	public void verifyViewGuoupEditCancel() throws Throwable
	{
		sideMenuAllTabs.clickOnSideGroupsTab();
		Thread.sleep(3000);
		sideMenuGroupsPage.viewGuoupAndEditCancel();			
	}
	
	@Test(priority = 3, enabled = true)
	public void verifyViewGuoupAndEditUpdate() throws Throwable
	{
		sideMenuAllTabs.clickOnSideGroupsTab();
		Thread.sleep(3000);
		sideMenuGroupsPage.viewGuoupAndEditUpdate();
	}
	
	@Test(priority = 4, enabled = true)
	public void verifyGroupDeleteNo() throws Throwable
	{
		sideMenuAllTabs.clickOnSideGroupsTab();
		Thread.sleep(3000);
		sideMenuGroupsPage.viewTableData();
		Thread.sleep(3000);
		sideMenuGroupsPage.deleteGroupsNo();
		Thread.sleep(3000);	
	}
	
	@Test(priority = 5, enabled = false)
	public void verifyGroupsDeleteYes() throws Throwable
	{
		sideMenuAllTabs.clickOnSideGroupsTab();
		Thread.sleep(3000);
		sideMenuGroupsPage.viewTableData();
		Thread.sleep(3000);
		sideMenuGroupsPage.deleteGroupsYes();
					
	}
	
	//deleting all rows run below test case carefully
	//DANGER
	@Test(priority = 6, enabled = false)
	public void verifyGroupsDeleteAllYes() throws Throwable
	{
		sideMenuAllTabs.clickOnSideGroupsTab();
		Thread.sleep(3000);
		sideMenuGroupsPage.viewTableData();
		Thread.sleep(3000);
		sideMenuGroupsPage.deleteGroupsYes();
					
	}
	
	@Test(priority = 6, enabled = true)
	public void verifygoToSiteGroups() throws Throwable
	{
		sideMenuAllTabs.clickOnSideGroupsTab();
		Thread.sleep(3000);
		sideMenuGroupsPage.viewTableData();
		Thread.sleep(3000);
		sideMenuGroupsPage.goToSiteGroups();
					
	}

	//=============================================================================================================
	//++++++++++++++++++++++++++++++++++++ Verify Clubs Tab.      ++++++++++++++++++++++++++++++++++++++++
	//=============================================================================================================
	
	
	@Test(priority = 7, enabled = true)
	public void verifyClubSearch() throws Throwable
	{
		sideMenuAllTabs.clickOnSideGroupsTab();
		Thread.sleep(3000);
		
		sideMenuGroupsPage.groupsSearch();
		Thread.sleep(3000);
		sideMenuGroupsPage.viewTableData();
					
	}
	
	@Test(priority = 8, enabled = true)
	public void verifyViewClubAndBack() throws Throwable
	{
		sideMenuAllTabs.clickOnSideGroupsTab();
		Thread.sleep(3000);
		sideMenuGroupsPage.viewClubsAndBack();		
	}
	
	@Test(priority = 9, enabled = true)
	public void verifyViewClubEditCancel() throws Throwable
	{
		sideMenuAllTabs.clickOnSideGroupsTab();
		Thread.sleep(3000);
		sideMenuGroupsPage.viewClubsAndEditCancel();
					
	}
	
	@Test(priority = 10, enabled = true)
	public void verifyViewClubAndEditUpdate() throws Throwable
	{
		sideMenuAllTabs.clickOnSideGroupsTab();
		Thread.sleep(3000);
		sideMenuGroupsPage.viewClubsAndEditUpdate();
	}
	
	@Test(priority = 11, enabled = true)
	public void verifyClubDeleteNo() throws Throwable
	{
		sideMenuAllTabs.clickOnSideGroupsTab();
		Thread.sleep(3000);
		sideMenuGroupsPage.viewTableData();
		Thread.sleep(3000);
		sideMenuGroupsPage.deleteClubsNo();
		Thread.sleep(3000);
	}
	
	@Test(priority = 12, enabled = true)
	public void verifyClubDeleteYes() throws Throwable
	{
		sideMenuAllTabs.clickOnSideGroupsTab();
		Thread.sleep(3000);
		sideMenuGroupsPage.viewTableData();
		Thread.sleep(3000);
		sideMenuGroupsPage.deleteClubsYes();			
	}
	
	//deleting all rows run below test case carefully
	//DANGER
	@Test(priority = 13, enabled = false)
	public void verifyClubDeleteAllYes() throws Throwable
	{
		sideMenuAllTabs.clickOnSideGroupsTab();
		Thread.sleep(3000);
		sideMenuGroupsPage.viewTableData();
		Thread.sleep(3000);
		sideMenuGroupsPage.deleteALLClubsYes();
					
	}
	
	@Test(priority = 14, enabled = true)
	public void verifygoToSiteClubs() throws Throwable
	{
		sideMenuAllTabs.clickOnSideGroupsTab();
		Thread.sleep(3000);
		sideMenuGroupsPage.viewTableData();
		Thread.sleep(3000);
		sideMenuGroupsPage.goToSiteClub();
					
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}

}
