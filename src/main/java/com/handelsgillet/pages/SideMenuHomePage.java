package com.handelsgillet.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.handelsgillet.pages.LoginPage;

import com.handelsgillet.testBase.TestBase;

public class SideMenuHomePage extends TestBase
{
	@FindBy(xpath="//a[@href='#/dashboard/manageapplications']//following::p[@class='text-center hg_dashboard_card_more_info hg_dashboard_card_newreg_bg_moreinfo']")
	WebElement moreInfoNewApplications;

	@FindBy(xpath="//a[@href='#/dashboard/manageapplications']//following::p[@class='text-center hg_dashboard_card_more_info hg_dashboard_card_events_bg_moreinfo']")
	WebElement moreInfoNewEvents;
	
	@FindBy(xpath="//a[@href='#/dashboard/managegroups']//following::p[@class='text-center hg_dashboard_card_more_info hg_dashboard_card_groups_bg_moreinfo']")
	WebElement moreInfoNewGroups;
	
	@FindBy(xpath="//p[@class='text-center hg_dashboard_card_more_info hg_dashboard_card_userunreg_bg_moreinfo']")
	WebElement moreInfoLeggedInMembers;
	
	

    LoginPage loginPage;
	public SideMenuHomePage()
	{
		PageFactory.initElements(driver,this);
		
	}
	
	public SideMenuNewApplicationsPage clickOnMoreInfoNewApplications()
	{
		moreInfoNewApplications.click();
		return new SideMenuNewApplicationsPage();
	}
	
	
	public SideMenuEventsPage clickOnMoreInfoNewEvents() throws Throwable
	{
		moreInfoNewEvents.click();
		return new SideMenuEventsPage();
	}
	
	public SideMenuGroupsPage clickOnMoreInfoNewGroups()
	{
		moreInfoNewGroups.click();
		return new SideMenuGroupsPage();
	}
	
	public SideMenuGroupsPage clickOnMoreInfoLoggedInMembers()
	{
		moreInfoLeggedInMembers.click();
		return new SideMenuGroupsPage();
	}	
}
