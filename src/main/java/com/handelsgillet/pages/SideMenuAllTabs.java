package com.handelsgillet.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.handelsgillet.testBase.TestBase;

public class SideMenuAllTabs extends TestBase
{
	@FindBy(xpath="//a[@class='active']")
	WebElement sideHomeTab;
	
	@FindBy(xpath="//a[@class='active']//following::li[1]")
	WebElement sideNewApplicationTab;
	
	@FindBy(xpath="//a[@class='active']//following::li[2]")
	WebElement sideManageMemberTab;
	
	@FindBy(xpath="//a[@class='active']//following::li[3]")
	WebElement sideGroupsTab;
	
	@FindBy(xpath="//a[@class='active']//following::li[4]")
	WebElement sideEventsTab;
	
	@FindBy(xpath="//a[@class='active']//following::li[5]")
	WebElement sideManageTagsTab;
	
	@FindBy(xpath="//a[@class='active']//following::li[6]")
	WebElement sideCreateSiteTab;
	
	@FindBy(xpath="//a[@class='active']//following::li[7]")
	WebElement sideManageArticleTab;
	
	@FindBy(xpath="//a[@class='active']//following::li[8]")
	WebElement sideSuppliersTab;
	
	@FindBy(xpath="//a[@class='active']//following::li[9]")
	WebElement sideManageRoomBookingTab;
	
	@FindBy(xpath="//a[@class='active']//following::li[10]")
	WebElement sideFeeStructureTab;
	
	@FindBy(xpath="//a[@class='active']//following::li[11]")
	WebElement sideRole;
	
	@FindBy(xpath="//a[@class='active']//following::li[12]")
	WebElement sideStatisticsTab;
	
	@FindBy(xpath="//a[@class='active']//following::li[13]")
	WebElement sideEditStaticPageTab;
	
	@FindBy(xpath="//a[@class='active']//following::li[14]")
	WebElement sideMemberTypesTab;
	
	
	public SideMenuAllTabs() throws Throwable
	{
		PageFactory.initElements(driver, this); 
		Thread.sleep(3000);
		 
	}
	// this line is added newly .........................................
	/*public void loginCall(String un,String pwd,String sheetName) throws Throwable
	{
		LoginPage logincall = new LoginPage();
		logincall.login(un, pwd, sheetName);
		
	}
	
	public void loginDataFromTest(String un,String pwd) throws Throwable
	{
		LoginPageTestCase page = new LoginPageTestCase();
		page.loginTest(un, pwd);
	}*/
	// -----------------------------------------------------------
	public SideMenuHomePage clickOnSideHomeTab() throws Throwable
	{
		sideHomeTab.click();
		return new SideMenuHomePage();	
	}
	
	public SideMenuNewApplicationsPage clickOnSideNewApplicationTab() throws Throwable
	{
		sideNewApplicationTab.click();
		return new SideMenuNewApplicationsPage();
	}
	
	public SideMenuManageMemberPage clickOnSideManageMemberTab() throws Throwable
	{
		sideManageMemberTab.click();
		return new SideMenuManageMemberPage();
	}
	
	public SideMenuGroupsPage clickOnSideGroupsTab() throws Throwable
	{
		sideGroupsTab.click();
		return new SideMenuGroupsPage();
	}
	
	public SideMenuEventsPage clickOnSideEventsTab() throws Throwable
	{
		sideEventsTab.click();
		return new SideMenuEventsPage();
	}
	
	public SideMenuManageTagsPage clickOnSideManageTagsTab() throws Throwable
	{
		sideManageTagsTab.click();
		return new SideMenuManageTagsPage();
	}
	public SideMenuCreateSitePage clickOnSideCreateSiteTab() throws Throwable
	{
		sideCreateSiteTab.click();
		return new SideMenuCreateSitePage();
	}
	
	
	
	public SideMenuManageArticlePage clickOnSideManageArticleTab() throws Throwable
	{
		sideManageArticleTab.click();
		return new SideMenuManageArticlePage();
	}
	
	public SideMenuSuppliersPage clickOnSideSuppliersTab() throws Throwable
	{
		sideSuppliersTab.click();
		return new SideMenuSuppliersPage();
		
	}
	
	public SideMenuManageRoomBookingPage clickOnSideManageRoomBookingTab() throws Throwable
	{
		sideManageRoomBookingTab.click();
		return new SideMenuManageRoomBookingPage();
		
	}
	
	public SideMenuFeeStructurePage clickOnSideFeeStructureTab() throws Throwable
	{
		sideFeeStructureTab.click();
		return new SideMenuFeeStructurePage();
	}
	
	public SideMenuRolePage clickOnSideRolesTab() throws Throwable
	{
		sideRole.click();
		return new SideMenuRolePage();
	}
	
	public SideMenuStatisticsPage clickOnSideStatisticsTab() throws Throwable
	{
		sideStatisticsTab.click();
		return new SideMenuStatisticsPage();
	}
	
	public SideMenuEditStaticPage clickOnSideEditStatisticsTab() throws Throwable
	{
		sideEditStaticPageTab.click();
		return new SideMenuEditStaticPage();
	}
	public SideMenuMemberTypePage clickOnSideMemberTypesTab() throws Throwable
	{
		sideMemberTypesTab.click();
		return new SideMenuMemberTypePage();
	}
	
	
	

	
	
	
	
	
	
}
