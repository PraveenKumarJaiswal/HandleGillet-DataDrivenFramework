package com.handelsgillet.TestCases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.handelsgillet.pages.LoginPage;
import com.handelsgillet.pages.SideMenuAllTabs;
import com.handelsgillet.pages.SideMenuCreateSitePage;
import com.handelsgillet.pages.SideMenuEditStaticPage;
import com.handelsgillet.pages.SideMenuEventsPage;
import com.handelsgillet.pages.SideMenuFeeStructurePage;
import com.handelsgillet.pages.SideMenuGroupsPage;
import com.handelsgillet.pages.SideMenuHomePage;
import com.handelsgillet.pages.SideMenuManageArticlePage;
import com.handelsgillet.pages.SideMenuManageMemberPage;
import com.handelsgillet.pages.SideMenuManageRoomBookingPage;
import com.handelsgillet.pages.SideMenuManageTagsPage;
import com.handelsgillet.pages.SideMenuMemberTypePage;
import com.handelsgillet.pages.SideMenuRolePage;
import com.handelsgillet.pages.SideMenuNewApplicationsPage;
import com.handelsgillet.pages.SideMenuStatisticsPage;
import com.handelsgillet.pages.SideMenuSuppliersPage;
import com.handelsgillet.testBase.TestBase;
import com.handelsgillet.util.TestUtil;

public class SideMenuAllTabsTestCase extends TestBase  
{
	
	SideMenuAllTabs sideMenuAllTabs;
	LoginPage loginPage;
	SideMenuHomePage sideMenuHomePage;
	SideMenuNewApplicationsPage sideMenuNewApplicationsPage;
	SideMenuManageMemberPage sideMenuManageMemberPage;
	SideMenuGroupsPage sideMenuGroupsPage; 
	SideMenuEventsPage sideMenuEventsPage;
	SideMenuManageTagsPage sideMenuManageTagsPage;
	SideMenuCreateSitePage sideMenuCreateSitePage;
	SideMenuManageArticlePage sideMenuManageArticlePage;
	SideMenuSuppliersPage sideMenuSuppliersPage;
	SideMenuManageRoomBookingPage sideMenuManageRoomBookingPage; 
	SideMenuFeeStructurePage sideMenuFeeStructurePage;
	SideMenuRolePage sideMenuRolePage;
	SideMenuStatisticsPage sideMenuStatisticsPage;
	SideMenuEditStaticPage sideMenuEditStaticPage;
	SideMenuMemberTypePage sideMenuMemberTypePage;
	
	LoginPageTestCase loginPageTestCase;
	
	
	String sheetName="SuperAdminLogin";
	public SideMenuAllTabsTestCase()
	{
		super();	
	}
	
	@BeforeMethod
	public void setUp() throws Throwable
	{
		initialization();
	
		//this.loginPage = loginPage;
		//As now i have to use excel sheet using this bu tunable to get the login 
		//earlier i was using config.property file as i put my details as in below line,  
		//sideMenuEventsPage = loginPage.login(prop.getProperty("username"),prop.getProperty("password"));
		
		loginPage = new LoginPage();
		loginPage.login("kimm@gmail.com", "123456", "SuperAdminLogin");
		
		Thread.sleep(3000);
		
		
		sideMenuAllTabs= new SideMenuAllTabs();
		sideMenuHomePage = new SideMenuHomePage();
		sideMenuNewApplicationsPage = new SideMenuNewApplicationsPage();
		sideMenuManageMemberPage = new SideMenuManageMemberPage();
		sideMenuGroupsPage = new SideMenuGroupsPage();
		sideMenuEventsPage = new SideMenuEventsPage();
		sideMenuManageTagsPage = new SideMenuManageTagsPage();
		sideMenuCreateSitePage = new SideMenuCreateSitePage();
		sideMenuManageArticlePage = new SideMenuManageArticlePage();
		sideMenuSuppliersPage = new SideMenuSuppliersPage();
		sideMenuManageRoomBookingPage = new SideMenuManageRoomBookingPage();
		sideMenuFeeStructurePage = new SideMenuFeeStructurePage();
		sideMenuRolePage = new SideMenuRolePage();
		sideMenuStatisticsPage = new SideMenuStatisticsPage();
		sideMenuEditStaticPage = new SideMenuEditStaticPage();
		sideMenuMemberTypePage = new SideMenuMemberTypePage();
	}
	/*
	
	// ...........my piece of code.................
	 @DataProvider
     public Object[][] getHGSuperAdminLoginTestData()
     {
         Object data[][] = TestUtil.getTestData(sheetName);
         return data;
        
     }
	 @Test(priority=-1, dataProvider="getHGSuperAdminLoginTestData")
		public void loginTest(String un, String pwd) throws Throwable
		{   loginPage = new LoginPage();
			loginPage.login(un, pwd, sheetName);
			
			Thread.sleep(5000);
		}
	 //.............till here.........................
	 
	 */
	 
	@Test(priority=1)
	public void verifySideNewApplicationTab() throws Throwable
	{
		sideMenuNewApplicationsPage =  sideMenuAllTabs.clickOnSideNewApplicationTab();
		//Thread.sleep(3000);
	}
	
	@Test(priority=2)
	public void verifySideHomeTabTest() throws Throwable
	{
		System.out.println("Test case 1 starts");		
		sideMenuHomePage =  sideMenuAllTabs.clickOnSideHomeTab();
		Thread.sleep(3000);
		System.out.println("Test case 1 Ends");
	}
	
	@Test(priority=3)
	public void verifySideManageMemberTab() throws Throwable
	{
		System.out.println("Test case 3 starts");
		sideMenuManageMemberPage =  sideMenuAllTabs.clickOnSideManageMemberTab();
		Thread.sleep(3000);
		System.out.println("Test case 3 ends");
	}
	
	@Test(priority=4)
	public void verifySideGroupsTab() throws Throwable
	{
		System.out.println("Test case 4 starts");
		sideMenuGroupsPage =  sideMenuAllTabs.clickOnSideGroupsTab();
		Thread.sleep(3000);
		System.out.println("Test case 4 ends");
	}
	
	@Test(priority=5)
	public void verifySideEventsTab() throws Throwable
	{
		System.out.println("Test case 5 starts");
		sideMenuEventsPage =  sideMenuAllTabs.clickOnSideEventsTab();
		Thread.sleep(3000);
		System.out.println("Test case 5 ends");
	}
	
	@Test(priority=6)
	public void verifySideManageTagsTab() throws Throwable
	{
		sideMenuManageTagsPage = sideMenuAllTabs.clickOnSideManageTagsTab();
	}
	
	@Test(priority=7)
	public void verifySideCreateSiteTab() throws Throwable
	{
		sideMenuCreateSitePage = sideMenuAllTabs.clickOnSideCreateSiteTab();
	}
	
	@Test(priority=8)
	public void verifySideManageArticleTab() throws Throwable
	{
		System.out.println("This is 8 manage artical");
		sideMenuManageArticlePage =  sideMenuAllTabs.clickOnSideManageArticleTab();
		Thread.sleep(3000);
		System.out.println("This is 8 manage artical");
	}
	
	@Test(priority=9)
	public void verifySideSuppliersTab() throws Throwable
	{
		sideMenuSuppliersPage =  sideMenuAllTabs.clickOnSideSuppliersTab();
		Thread.sleep(3000);
	}
	
	@Test(priority=10)
	public void verifySideManageRoomBooking() throws Throwable
	{
		sideMenuManageRoomBookingPage =  sideMenuAllTabs.clickOnSideManageRoomBookingTab();
		Thread.sleep(3000);
	}
	
	@Test(priority=11)
	public void verifySideFeeStructureTab() throws Throwable
	{
		sideMenuFeeStructurePage =  sideMenuAllTabs.clickOnSideFeeStructureTab();
		Thread.sleep(3000);
	}
	
	@Test(priority=12)
	public void verifySideRoleTab() throws Throwable
	{
		sideMenuRolePage =  sideMenuAllTabs.clickOnSideRolesTab();
		Thread.sleep(3000);
	}
	
	@Test(priority=13)
	public void verifySideStatisticsTab() throws Throwable
	{
		sideMenuStatisticsPage =  sideMenuAllTabs.clickOnSideStatisticsTab();
		Thread.sleep(3000);
	}
	
	@Test(priority=14)
	public void verifySideEditStaticPagesTab() throws Throwable
	{
		sideMenuEditStaticPage =  sideMenuAllTabs.clickOnSideEditStatisticsTab();
		Thread.sleep(3000);
	}
	
	@Test(priority=15)
	public void verifySideMemberType() throws Throwable
	{
		sideMenuMemberTypePage=  sideMenuAllTabs.clickOnSideMemberTypesTab();
		Thread.sleep(3000);
	}
	
	
	
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}

}