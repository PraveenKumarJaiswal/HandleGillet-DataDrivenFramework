package com.handelsgillet.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.handelsgillet.testBase.TestBase;

public class SideMenuEventsPage extends TestBase
{
	@FindBy(xpath="//label[@class='hg-user']")
	WebElement usernameLabel;
	
	@FindBy(xpath="//a[contains(text(),'Create Event')]")
	WebElement createEventsMenu;
	
	@FindBy(xpath="//a[contains(text(),'Hg Events')]")
	WebElement hgEventsMenu;
	
	@FindBy(xpath="//a[contains(text(),'All Events')]")
	WebElement allEventsMenu;
	
	@FindBy(xpath="//a[contains(text(),'Event Type')]")
	WebElement eventsTypeMenu;
	
	
	public SideMenuEventsPage() throws Throwable
	{
		PageFactory.initElements(driver, this); 
		Thread.sleep(3000);
	}
	
	public boolean verifyUserName()
	{
		return usernameLabel.isDisplayed();
	}
	
	public String verifyHomePageTitle()
	{
		return driver.getTitle();
	}
	
	public CreateEventsPage clickOnCreateEventsMenu() throws Throwable
	{
		createEventsMenu.click(); 
		Thread.sleep(3000);
		return new CreateEventsPage();
		
	}
	
	public HGEventsPage clickOnHGEventsMenus() throws Throwable
	{
		hgEventsMenu.click();
		Thread.sleep(3000);
		return new HGEventsPage();
		}
	
	public AllEventsPage clickOnAllEventsMenu() throws Throwable
	{
		allEventsMenu.click(); 
		Thread.sleep(3000);
		return new AllEventsPage();
		
	}
	
	public EventsTypePage clickOnEventsTypeMenu() throws Throwable
	{
		eventsTypeMenu.click(); 
		Thread.sleep(3000);
		return new EventsTypePage();
	}
}
