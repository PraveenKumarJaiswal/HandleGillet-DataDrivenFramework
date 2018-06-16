package com.handelsgillet.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.handelsgillet.testBase.TestBase;

public class SideMenuManageTagsPage extends TestBase
{
	@FindBy(xpath="//a[text()='Create Tag']")
	WebElement createTagTab;
	
	@FindBy(xpath="//a[text()='All Tags']")
	WebElement allTagsTab;
	
	@FindBy(xpath="//input[@placeholder='Enter Tag Name']")
	WebElement enterTagName;
	
	@FindBy(xpath="//textarea[@placeholder='Enter Tag Description']")
	WebElement enterTagDescription;
	
	@FindBy(xpath="//button[text()='Create']")
	WebElement createButton;
	
	LoginPage loginPage;
	
	public SideMenuManageTagsPage()
	{
		PageFactory.initElements(driver,this);
	}
	
	public void createTag(String tagName, String tagDesc) throws Throwable
	{
		createTagTab.click();
		Thread.sleep(3000);
		enterTagName.sendKeys(tagName);
		Thread.sleep(3000);
		enterTagDescription.sendKeys(tagDesc);
		Thread.sleep(3000);
		createButton.click();
	}
	

}
