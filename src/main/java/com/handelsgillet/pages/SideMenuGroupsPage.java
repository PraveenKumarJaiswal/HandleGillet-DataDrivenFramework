package com.handelsgillet.pages;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.handelsgillet.TestCases.SideMenuGroupsPageTestCase;
import com.handelsgillet.testBase.TestBase;

public class SideMenuGroupsPage extends TestBase
{
	@FindBy(xpath="//input[@placeholder = 'Fliter By Name']")
	WebElement searchTextBox;
	
	@FindBy(xpath="//button[text()='Create Group']")
	WebElement createGroupButton;
	
	@FindBy(xpath="//button[text()='Create Club']")
	WebElement createClubButton;
	
	@FindBy(xpath="//a[contains(text(),'Groups')]")
	WebElement groupsTab;
	
	@FindBy(xpath="//a[contains(text(),'Clubs')]")
	WebElement clubsTab;
	
	@FindBy(xpath="//button[contains(text(),'Back')]")
	WebElement backButton;
	
	@FindBy(xpath="//button[contains(text(),'Update')]")
	WebElement updateButton;
	
	@FindBy(xpath="//button[contains(text(),'Cancel')]")
	WebElement cancelButton;
	
	@FindBy(xpath="//button[contains(text(),'Cancel')]//following::Button")
	WebElement editButton;
	
	@FindBy(xpath="//input[@placeholder='Enter Club Name']")
	WebElement clubNameTextBox;
	
	@FindBy(xpath="//app-dialogue-popup[3]/div")
	WebElement deletePopup;
	
	@FindBy(xpath="//button[contains(text(),'Yes')]")
	WebElement deleteYesButton;
	
	@FindBy(xpath="//button[contains(text(),'No')]")
	WebElement deleteNoButton;
	
	LoginPage loginPage;
	public SideMenuGroupsPage()
	{
		PageFactory.initElements(driver,this);
	}
	
	public void groupsSearch() throws InterruptedException
	{
		searchTextBox.sendKeys("Er");
		Thread.sleep(3000);
	}
	
	public void viewTableData() 
	{
		 WebElement mytable = driver.findElement(By.xpath("//table//tbody"));
		 List<WebElement> rows_table = mytable.findElements(By.tagName("tr"));
		 int rows_count = rows_table.size();
		 
		//Loop will execute till the last row of table.
		  for (int row=0; row<rows_count; row++){
			  List<WebElement> Columns_row = rows_table.get(row).findElements(By.tagName("td"));
			  int columns_count = Columns_row.size();
			  System.out.println("Number of cells In Row "+row+" are "+columns_count);
		   
			  //Loop will execute till the last cell of that specific row.
			  for (int column=0; column<columns_count; column++){
				  //To retrieve text from that specific cell.
				  String celtext = Columns_row.get(column).getText();
				  System.out.println("Cell Value Of row number "+row+" and column number "+column+" Is "+celtext);
			  }
			  System.out.println("--------------------------------------------------");
			  
		  }  
	}
	
	public void viewGuoupAndBack() throws InterruptedException
	{
		List<WebElement> view = driver.findElements(By.xpath("//button[@tooltip='View']"));
		int view_count = view.size();
		System.out.println("view count is: "+view_count);
		for(int i=0;i<view_count;i++)
		{
			view.get(i).click();
			Thread.sleep(3000);
			cancelButton.click();
			Thread.sleep(3000);
			view = driver.findElements(By.xpath("//button[@tooltip='View']"));
		}
	}
	
	public void viewGuoupAndEditCancel() throws InterruptedException
	{
		List<WebElement> view = driver.findElements(By.xpath("//i[@class='fa fa-eye']"));
		int view_count = view.size();
		System.out.println("view count is: "+view_count);
		for(int i=0;i<view_count;i++)
		{
			view.get(i).click();
			Thread.sleep(3000);
			editButton.click();
			Thread.sleep(3000);
			clubNameTextBox.sendKeys("New Club");
			Thread.sleep(3000);
			cancelButton.click();
			Thread.sleep(9000);
			view = driver.findElements(By.xpath("//i[@class='fa fa-eye']"));
		}
	}
	
	
	public void viewGuoupAndEditUpdate() throws InterruptedException
	{
		List<WebElement> view = driver.findElements(By.xpath("//button[@tooltip='View']"));
		int view_count = view.size();
		System.out.println("view count is: "+view_count);
		for(int i=0;i<view_count;i++)
		{
			view.get(i).click();
			Thread.sleep(3000);
			editButton.click();
			Thread.sleep(3000);
			clubNameTextBox.sendKeys("New Club");
			Thread.sleep(3000);
			updateButton.click();
			Thread.sleep(9000);
			view = driver.findElements(By.xpath("//i[@class='fa fa-eye']"));
		}
	}
	
	public void deleteGroupsNo() throws InterruptedException
	{
		List<WebElement> view = driver.findElements(By.xpath("//button[@tooltip='Delete']"));
		int view_count = view.size();
		System.out.println("view count is: "+view_count);
		for(int i=0;i<view_count;i++)
		{
			view.get(i).click();
			Thread.sleep(3000);
			deletePopup.click();
			Thread.sleep(3000);
			deletePopup.getText();
			Thread.sleep(3000);
			deleteNoButton.click();
		}
	}
	// We are only deleting one row 
	public void deleteGroupsYes() throws InterruptedException
	{
		WebElement view = driver.findElement(By.xpath("//button[@tooltip='Delete']"));
		view.click();
		Thread.sleep(3000);
			deletePopup.click();
			Thread.sleep(3000);
			deletePopup.getText();
			Thread.sleep(3000);
			deleteYesButton.click();
	}
	
	//deleting all rows
	public void deleteALLGroupsYes() throws InterruptedException
	{
		List<WebElement> view = driver.findElements(By.xpath("//button[@tooltip='Delete']"));
		int view_count = view.size();
		System.out.println("view count is: "+view_count);
		for(int i=0;i<view_count;i++)
		{
			view.get(i).click();
			Thread.sleep(3000);
			deletePopup.click();
			Thread.sleep(3000);
			deletePopup.getText();
			Thread.sleep(3000);
			deleteYesButton.click();
		}
	}
	
	public void goToSiteGroups() throws InterruptedException
	{
		List<WebElement> view = driver.findElements(By.xpath("//a[@class='btn btn-primary']"));
		int view_count = view.size();
		System.out.println("view count is: "+view_count);
		for(int i=0;i<view_count;i++)
		{
			view.get(i).click();
			Thread.sleep(3000);
			//driver.switchTo().defaultContent();
		}
	}

	//i[@class='fa fa-users']  --- for Subscription
	
	//=============================================================================================================
	//++++++++++++++++++++++++++++++++++++ Verify Clubs Tab.      ++++++++++++++++++++++++++++++++++++++++
	//=============================================================================================================
	
	public void viewClubsAndBack() throws InterruptedException
	{
		clubsTab.click();
		Thread.sleep(3000);
		List<WebElement> view = driver.findElements(By.xpath("//button[@tooltip='View']"));
		int view_count = view.size();
		System.out.println("view count is: "+view_count);
		for(int i=0;i<view_count;i++)
		{
			view.get(i).click();
			Thread.sleep(3000);
			cancelButton.click();
			Thread.sleep(3000);
			view = driver.findElements(By.xpath("//button[@tooltip='View']"));
		}
	}
	
	public void viewClubsAndEditCancel() throws InterruptedException
	{
		clubsTab.click();
		Thread.sleep(3000);
		List<WebElement> view = driver.findElements(By.xpath("//i[@class='fa fa-eye']"));
		int view_count = view.size();
		System.out.println("view count is: "+view_count);
		for(int i=0;i<view_count;i++)
		{
			view.get(i).click();
			Thread.sleep(3000);
			editButton.click();
			Thread.sleep(3000);
			clubNameTextBox.sendKeys("New Club");
			Thread.sleep(3000);
			cancelButton.click();
			Thread.sleep(9000);
			view = driver.findElements(By.xpath("//i[@class='fa fa-eye']"));
		}
	}
	
	
	public void viewClubsAndEditUpdate() throws InterruptedException
	{
		clubsTab.click();
		Thread.sleep(3000);
		List<WebElement> view = driver.findElements(By.xpath("//button[@tooltip='View']"));
		int view_count = view.size();
		System.out.println("view count is: "+view_count);
		for(int i=0;i<view_count;i++)
		{
			view.get(i).click();
			Thread.sleep(3000);
			editButton.click();
			Thread.sleep(3000);
			clubNameTextBox.sendKeys("New Club");
			Thread.sleep(3000);
			updateButton.click();
			Thread.sleep(9000);
			view = driver.findElements(By.xpath("//i[@class='fa fa-eye']"));
		}
	}
	
	public void deleteClubsNo() throws InterruptedException
	{
		clubsTab.click();
		Thread.sleep(3000);
		List<WebElement> view = driver.findElements(By.xpath("//button[@tooltip='Delete']"));
		int view_count = view.size();
		System.out.println("view count is: "+view_count);
		for(int i=0;i<view_count;i++)
		{
			view.get(i).click();
			Thread.sleep(3000);
			deletePopup.click();
			Thread.sleep(3000);
			deletePopup.getText();
			Thread.sleep(3000);
			deleteNoButton.click();
		}
	}
	// We are only deleting one row 
	public void deleteClubsYes() throws InterruptedException
	{
		clubsTab.click();
		Thread.sleep(3000);
		WebElement view = driver.findElement(By.xpath("//button[@tooltip='Delete']"));
		view.click();
		Thread.sleep(3000);
			deletePopup.click();
			Thread.sleep(3000);
			deletePopup.getText();
			Thread.sleep(3000);
			deleteYesButton.click();
	}
	
	//deleting all rows
	public void deleteALLClubsYes() throws InterruptedException
	{
		clubsTab.click();
		Thread.sleep(3000);
		List<WebElement> view = driver.findElements(By.xpath("//button[@tooltip='Delete']"));
		int view_count = view.size();
		System.out.println("view count is: "+view_count);
		for(int i=0;i<view_count;i++)
		{
			view.get(i).click();
			Thread.sleep(3000);
			deletePopup.click();
			Thread.sleep(3000);
			deletePopup.getText();
			Thread.sleep(3000);
			deleteYesButton.click();
		}
	}
	
	public void goToSiteClub() throws InterruptedException
	{
		clubsTab.click();
		Thread.sleep(3000);
		List<WebElement> view = driver.findElements(By.xpath("//a[@class='btn btn-primary']"));
		int view_count = view.size();
		System.out.println("view count is: "+view_count);
		for(int i=0;i<view_count;i++)
		{
			view.get(i).click();
			Thread.sleep(3000);
			//driver.switchTo().defaultContent();
		}
	}

	
}
