package com.handelsgillet.TestCases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.handelsgillet.pages.AllEventsPage;
import com.handelsgillet.pages.CreateEventsPage;
import com.handelsgillet.pages.EventAccessTypePage;
import com.handelsgillet.pages.EventsTypePage;
import com.handelsgillet.pages.HGEventsPage;
import com.handelsgillet.pages.SideMenuEventsPage;
import com.handelsgillet.pages.LoginPage;
import com.handelsgillet.testBase.TestBase;

public class EventsSideMenuPageTestCase extends TestBase
{
	LoginPage loginPage;
	SideMenuEventsPage sideMenuEventsPage;
	CreateEventsPage createEventsPage;
	HGEventsPage hgEventsPage;
	AllEventsPage allEventsPage;
	EventsTypePage eventsTypePage;
	EventAccessTypePage eventsAccessTypePage;
	
	public EventsSideMenuPageTestCase()
	{
		super();
	}
	
	@BeforeMethod
	public void setUp() throws Throwable
	{
		initialization();
		
		LoginPage loginPage= new LoginPage();
		//sideMenuEventsPage = loginPage.login(prop.getProperty("username"),prop.getProperty("password"));
		createEventsPage = new CreateEventsPage();
		hgEventsPage = new HGEventsPage();
		allEventsPage = new AllEventsPage();
		eventsTypePage = new EventsTypePage();
		eventsAccessTypePage = new EventAccessTypePage();
	}
	
	@Test(priority=1)
	public void verifyHomePageTitleTest()
	{
		String homePageTitle= sideMenuEventsPage.verifyHomePageTitle();
		Assert.assertEquals(homePageTitle, "HANDELSGILLET","HomePage title not matched.");	
	}
	
	@Test(priority=2)
	public void verifyUserNameTest()
	{
		boolean un=sideMenuEventsPage.verifyUserName();
		Assert.assertTrue(un);
	}
	
	@Test(priority=3)
	public void verifyCreateEventMenuTest() throws Throwable
	{
		createEventsPage = sideMenuEventsPage.clickOnCreateEventsMenu(); 
		//Thread.sleep(3000);
	}
	
	@Test(priority=4)
	public void verifyHGEventsMenuTest() throws Throwable 
	{
		hgEventsPage = sideMenuEventsPage.clickOnHGEventsMenus();
		
	}
	
	@Test(priority=5)
	public void verifyAllEventsMenuTest() throws Throwable 
	{
		allEventsPage = sideMenuEventsPage.clickOnAllEventsMenu();
		
	}
	
	@Test(priority=6)
	public void verifyEventsTypeMenuTest() throws Throwable
	{
		eventsTypePage = sideMenuEventsPage.clickOnEventsTypeMenu();
		
	}
	
	@Test(priority=7)
	public void verifyEventsAccessTypeMenuTest() throws Throwable 
	{
		//eventsAccessTypePage = sideMenuEventsPage.clickOnEventAccessTypeMenu();
		
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}

}
