package com.handelsgillet.TestCases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.handelsgillet.pages.LoginPage;
import com.handelsgillet.pages.SideMenuAllTabs;
import com.handelsgillet.pages.SideMenuHomePage;
import com.handelsgillet.pages.SideMenuManageMemberPage;
import com.handelsgillet.pages.SideMenuRolePage;
import com.handelsgillet.testBase.TestBase;

public class SideMenuManageMemberPageTestCase  extends TestBase
{
	SideMenuAllTabs sideMenuAllTabs;
	SideMenuHomePage sidemenuhomepage ;
	SideMenuManageMemberPage sideMenuManageMemberPage;
	LoginPage loginPage;
	
	public SideMenuManageMemberPageTestCase()
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
		sideMenuManageMemberPage = new SideMenuManageMemberPage();
		
	}
	
	@Test(priority = 0, enabled = false)
	public void verifyManageMemberSearch() throws Throwable
	{
		sideMenuAllTabs.clickOnSideManageMemberTab();
		Thread.sleep(3000);
		sideMenuManageMemberPage.ManageMemberSearch();
		Thread.sleep(3000);
		sideMenuManageMemberPage.viewManageMemberTableData();
					
	}
	
	@Test(priority = 1, enabled = false)
	public void verifyManageMemberViewAndBack() throws Throwable
	{
		sideMenuAllTabs.clickOnSideManageMemberTab();
		Thread.sleep(3000);
		sideMenuManageMemberPage.viewManageMemberTableData();
		Thread.sleep(3000);
		sideMenuManageMemberPage.viewManageMemberAndBack();
		Thread.sleep(3000);
					
	}
	
	@Test(priority = 2, enabled = false)
	public void verifyManageMemberViewAndPrint() throws Throwable
	{
		sideMenuAllTabs.clickOnSideManageMemberTab();
		Thread.sleep(3000);
		sideMenuManageMemberPage.viewManageMemberTableData();
		Thread.sleep(3000);
		sideMenuManageMemberPage.viewManageMemberAndPrint();
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		System.out.println("Reached to form page");
					
	}
	
	@Test(priority = 3, enabled = false)
	public void verifyManageMemberViewAndEdit() throws Throwable
	{
		sideMenuAllTabs.clickOnSideManageMemberTab();
		Thread.sleep(3000);
		sideMenuManageMemberPage.viewManageMemberTableData();
		Thread.sleep(3000);
		sideMenuManageMemberPage.viewManageMemberAndEdit();
		Thread.sleep(3000);
		System.out.println("edited and updated");
					
	}
	
	@Test(priority = 4, enabled = false)
	public void verifyManageMemberDeleteNo() throws Throwable
	{
		sideMenuAllTabs.clickOnSideManageMemberTab();
		Thread.sleep(3000);
		sideMenuManageMemberPage.viewManageMemberTableData();
		Thread.sleep(3000);
		sideMenuManageMemberPage.deleteManageMemberNo();
		Thread.sleep(3000);
		
		driver.quit();			
	}
	
	@Test(priority = 5, enabled = false)
	public void verifyManageMemberDeleteYes() throws Throwable
	{
		sideMenuAllTabs.clickOnSideManageMemberTab();
		Thread.sleep(3000);
		sideMenuManageMemberPage.viewManageMemberTableData();
		Thread.sleep(3000);
		sideMenuManageMemberPage.deleteManageMemberYes();
					
	}
	
	@Test(priority = 6, enabled = false)
	public void verifysubscriptionManageMemberClose() throws Throwable
	{
		sideMenuAllTabs.clickOnSideManageMemberTab();
		Thread.sleep(3000);
		sideMenuManageMemberPage.viewManageMemberTableData();
		Thread.sleep(3000);
		sideMenuManageMemberPage.subscriptionManageMemberClose();
					
	}
	
	@Test(priority = 7, enabled = false)
	public void verifysubscriptionManageMembersendInvoiceButton() throws Throwable
	{
		sideMenuAllTabs.clickOnSideManageMemberTab();
		Thread.sleep(3000);
		sideMenuManageMemberPage.viewManageMemberTableData();
		Thread.sleep(3000);
		sideMenuManageMemberPage.subscriptionManageMembersendInvoiceButton();
					
	}
	
	@Test(priority = 8, enabled = false)
	public void verifyDetailsManageMemberClubClose() throws Throwable
	{
		sideMenuAllTabs.clickOnSideManageMemberTab();
		Thread.sleep(3000);
		sideMenuManageMemberPage.viewManageMemberTableData();
		Thread.sleep(3000);
		sideMenuManageMemberPage.detailsManageMemberClubClose();
					
	}
	@Test(priority = 8, enabled = true)
	public void verifyDetailsManageMemberGroupClose() throws Throwable
	{
		sideMenuAllTabs.clickOnSideManageMemberTab();
		Thread.sleep(3000);
		sideMenuManageMemberPage.viewManageMemberTableData();
		Thread.sleep(3000);
		sideMenuManageMemberPage.detailsManageMemberGroupsClose();
					
	}
	
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
}
