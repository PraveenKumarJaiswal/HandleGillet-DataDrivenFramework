package com.handelsgillet.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.handelsgillet.testBase.TestBase;

public class SideMenuManageMemberPage extends TestBase
{
	@FindBy(xpath="//input[@placeholder = 'search']")
	WebElement searchTextBox;
	
	@FindBy(xpath="//Button[@class='btn btn-primary text-uppercase text-b-500 ng-star-inserted']")
	WebElement searchButton;
	
	@FindBy(xpath="//Button[contains(text(),'Advance Search')]")
	WebElement AdbanceSearchButton;
	
	@FindBy(xpath="//button[text()='Back']")
	WebElement backButton;
	
	@FindBy(xpath="//button[text()='Edit Member']")
	WebElement editMemberButton;
	
	@FindBy(xpath="//button[text()='Print']")
	WebElement printButton;
	
	@FindBy(xpath="//button[text()='Update Member']")
	WebElement updateMemberButton;
	
	@FindBy(xpath="//app-dialogue-popup[3]/div")
	WebElement deletePopup;
	
	@FindBy(xpath="//app-dialogue-popup/div/div")
	WebElement subscriptionPopup;
	
	@FindBy(xpath="//app-dialogue-popup[2]/div")
	WebElement memberDetailsPopup;
		
	@FindBy(xpath="//a[contains(text(),'Clubs')]")
	WebElement clubsTab;
	
	@FindBy(xpath="//a[contains(text(),'Groups')]")
	WebElement groupTab;
	
	@FindBy(xpath="//button[text()='Send Invoice']")
	WebElement sendInvoiceButton;
	
	@FindBy(xpath="//button[text()='Close']")
	WebElement closeButton;
	
	@FindBy(xpath="//button[contains(text(),'Yes')]")
	WebElement deleteYesButton;
	
	@FindBy(xpath="//button[contains(text(),'No')]")
	WebElement deleteNoButton;
	
	@FindBy(xpath="//input[@type='text']")
	WebElement textField;
	
	LoginPage loginPage;
	public SideMenuManageMemberPage()
	{
		PageFactory.initElements(driver,this);
	}
	
	public void ManageMemberSearch() throws InterruptedException
	{
		
		searchTextBox.sendKeys("Erik");
		Thread.sleep(3000);
		searchButton.click();
	}
	
	public void viewManageMemberTableData() 
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
	
	public void viewManageMemberAndBack() throws InterruptedException
	{
		List<WebElement> view = driver.findElements(By.xpath("//td[8]/button"));
		int view_count = view.size();
		System.out.println("view count is: "+view_count);
		for(int i=0;i<view_count;i++)
		{
			view.get(i).click();
			Thread.sleep(3000);
			System.out.println("Viewed the  applicant form");
			backButton.click();
			System.out.println("clicked on back button");
			Thread.sleep(3000);
			view = driver.findElements(By.xpath("//td[8]/button"));
		}
	}
	
	public void viewManageMemberAndEdit() throws InterruptedException
	{
		List<WebElement> view = driver.findElements(By.xpath("//td[8]/button"));
		int view_count = view.size();
		System.out.println("view count is: "+view_count);
		for(int i=0;i<view_count;i++)
		{
			view.get(i).click();
			Thread.sleep(3000);
			System.out.println("Viewed the  applicant form");
			editMemberButton.click();
			Thread.sleep(3000);
			updateMemberButton.click();
			System.out.println("clicked on print button");
			Thread.sleep(3000);
			view = driver.findElements(By.xpath("//td[8]/button"));
		}
	}
	
	public void viewManageMemberAndPrint() throws InterruptedException
	{
		List<WebElement> view = driver.findElements(By.xpath("//td[8]/button"));
		int view_count = view.size();
		System.out.println("view count is: "+view_count);
		for(int i=0;i<view_count;i++)
		{
			view.get(i).click();
			Thread.sleep(3000);
			System.out.println("Viewed the  applicant form");
			printButton.click();
			Thread.sleep(3000);
			System.out.println("clicked on print button");
		}
	}
	
	public void deleteManageMemberNo() throws InterruptedException
	{
		List<WebElement> view = driver.findElements(By.xpath("//button[@tooltip='Delete']"));
		int view_count = view.size();
		System.out.println("view count is: "+view_count);
		for(int i=0;i<view_count;i++)
		{
			view.get(i).click();
			Thread.sleep(3000);
			System.out.println("Click on delete the Roles");
			Thread.sleep(3000);
			deletePopup.click();
			Thread.sleep(3000);
			deletePopup.getText();
			Thread.sleep(3000);
			deleteNoButton.click();
		}
	}
	
	public void deleteManageMemberYes() throws InterruptedException
	{
		WebElement view = driver.findElement(By.xpath("//button[@tooltip='Delete']"));
		view.click();
		Thread.sleep(3000);
			deletePopup.click();
			Thread.sleep(3000);
			deletePopup.getText();
			Thread.sleep(3000);
			deleteYesButton.click();
			System.out.println("++++++++++++++++++++++++++++++++++++++");
			System.out.println("delete account");
			System.out.println("++++++++++++++++++++++++++++++++++++++");
			Thread.sleep(3000);
		
	}
	// This will delete all element
	public void deleteManageMemberAllYes() throws InterruptedException
	{
		List<WebElement> view = driver.findElements(By.xpath("//button[@tooltip='Delete']"));
		int view_count = view.size();
		System.out.println("view count is: "+view_count);
		for(int i=0;i<view_count;i++)
		{
			view.get(i).click();
			Thread.sleep(3000);
			System.out.println("Click on delete the Roles");
			Thread.sleep(3000);
			deletePopup.click();
			Thread.sleep(3000);
			deletePopup.getText();
			Thread.sleep(3000);
			deleteYesButton.click();
		}
	}
	
	public void subscriptionManageMemberClose() throws InterruptedException
	{
		List<WebElement> view = driver.findElements(By.xpath("//button[@tooltip='Subscription']"));
		int view_count = view.size();
		System.out.println("view count is: "+view_count);
		for(int i=0;i<view_count;i++)
		{
			view.get(i).click();
			Thread.sleep(3000);
			Thread.sleep(3000);
			subscriptionPopup.click();
			Thread.sleep(3000);
			subscriptionPopup.getText();
			Thread.sleep(3000);
			closeButton.click();
			Thread.sleep(3000);
		}
	}
	
	public void subscriptionManageMembersendInvoiceButton() throws InterruptedException
	{
		List<WebElement> view = driver.findElements(By.xpath("//button[@tooltip='Subscription']"));
		int view_count = view.size();
		System.out.println("view count is: "+view_count);
		for(int i=0;i<view_count;i++)
		{
			view.get(i).click();
			Thread.sleep(3000);
			subscriptionPopup.click();
			Thread.sleep(3000);
			subscriptionPopup.getText();
			Thread.sleep(3000);
			sendInvoiceButton.click();
			Thread.sleep(3000);
		}
	}
	
	public void detailsManageMemberClubClose() throws InterruptedException
	{
		List<WebElement> view = driver.findElements(By.xpath("//td[11]/button"));
		int view_count = view.size();
		System.out.println("view count is: "+view_count);
		for(int i=0;i<view_count;i++)
		{
			view.get(i).click();
			Thread.sleep(3000);
			textField.sendKeys("Hello");
			Thread.sleep(3000);
			Select dd = new Select(driver.findElement(By.xpath("//div[2]/select")));
			dd.selectByIndex(1);
			Thread.sleep(3000);
			closeButton.click();
		}
	}
	
	public void detailsManageMemberGroupsClose() throws InterruptedException
	{
		List<WebElement> view = driver.findElements(By.xpath("//td[11]/button"));
		int view_count = view.size();
		System.out.println("view count is: "+view_count);
		for(int i=0;i<view_count;i++)
		{
			view.get(i).click();
			Thread.sleep(3000);
			groupTab.click();
			Thread.sleep(3000);
			textField.sendKeys("Hello");
			Thread.sleep(3000);
			Select dd = new Select(driver.findElement(By.xpath("//div[2]/select")));
			dd.selectByIndex(3);
			Thread.sleep(3000);
			closeButton.click();
		}
	}
}
