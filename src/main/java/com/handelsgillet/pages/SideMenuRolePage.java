package com.handelsgillet.pages;

import java.util.List;

import javax.management.relation.RoleStatus;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.handelsgillet.testBase.TestBase;

public class SideMenuRolePage  extends TestBase
{
	@FindBy(xpath="//input[@placeholder = 'Fliter By Name']")
	WebElement searchButton;
	
	@FindBy(xpath="//button[text()='Create Role']")
	WebElement createRoleButton;
	
	@FindBy(xpath="/html/body/app-root/app-dashboard/div/main/div/aside[2]/app-add-roles/div/div[2]/table/tbody")
	WebElement tableData;
	
	@FindBy(xpath="//button[contains(text(),'Cancel')]")
	WebElement roleCancel;
	
	@FindBy(xpath="//button[contains(text(),'Update')]")
	WebElement roleUpdate;

	@FindBy(xpath="//button[contains(text(),'Yes')]")
	WebElement deleteYesButton;
	
	@FindBy(xpath="//button[contains(text(),'No')]")
	WebElement deleteNoButton;
	
	@FindBy(xpath="//div[@class='dialog ng-tns-c3-8 ng-trigger ng-trigger-dialog ng-star-inserted']")
	WebElement popup;
	
	@FindBy(xpath="//input[@placeholder = 'Enter Role Name']")
	WebElement roleNameTextBox;
	
	@FindBy(xpath="//textarea[@placeholder = 'Description Goes Here...']")
	WebElement roleDescriptionTextBox;
	
	@FindBy(xpath="//button[text()='Cancel']")
	WebElement createRoleCancelButton;
	
	@FindBy(xpath="//button[text()='Create']")
	WebElement createRoleCreateButton;
	
	LoginPage loginPage;
	public SideMenuRolePage()
	{
		PageFactory.initElements(driver,this);
	}
	
	public void verifySearch() throws InterruptedException
	{
		searchButton.click();
		Thread.sleep(3000);
		searchButton.sendKeys("Admin");
		
	}
	
	public void ViewRolesTableData() 
	{
		 WebElement mytable = driver.findElement(By.xpath("/html/body/app-root/app-dashboard/div/main/div/aside[2]/app-add-roles/div/div[2]/table/tbody"));
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
	
	public void ViewRolesFormAndCancel() throws InterruptedException
	{
		List<WebElement> view = driver.findElements(By.xpath("//td[5]/button"));
		int view_count = view.size();
		System.out.println("view count is: "+view_count);
		for(int i=0;i<view_count;i++)
		{
			view.get(i).click();
			Thread.sleep(3000);
			System.out.println("Viewed the Roles applicant form");
			roleCancel.click();
			Thread.sleep(3000);
		}
		
	}
	
	public void ViewRolesFormAndUpdate() throws InterruptedException
	{
		List<WebElement> view = driver.findElements(By.xpath("//td[5]/button"));
		int view_count = view.size();
		System.out.println("view count is: "+view_count);
		for(int i=0;i<view_count;i++)
		{
			view.get(i).click();
			Thread.sleep(3000);
			System.out.println("Viewed the Roles applicant form");
			roleUpdate.click();
			Thread.sleep(3000);
		}
		
	}		

	public void deleteRoleNo() throws InterruptedException
	{
		List<WebElement> view = driver.findElements(By.xpath("//td[6]/button"));
		int view_count = view.size();
		System.out.println("view count is: "+view_count);
		for(int i=0;i<view_count;i++)
		{
			view.get(i).click();
			Thread.sleep(3000);
			System.out.println("Click on delete the Roles");
			Thread.sleep(3000);
			popup.click();
			Thread.sleep(3000);
			deleteNoButton.click();
			Thread.sleep(3000);
		}
		
	}	
	public void deleteRoleYes() throws InterruptedException
	{
		List<WebElement> view = driver.findElements(By.xpath("//td[6]/button"));
		int view_count = view.size();
		System.out.println("view count is: "+view_count);
		for(int i=0;i<view_count;i++)
		{
			view.get(i).click();
			Thread.sleep(3000);
			System.out.println("Click on delete the Roles");
			Thread.sleep(3000);
			popup.click();
			Thread.sleep(3000);
			deleteYesButton.click();
			Thread.sleep(3000);
		}
		
	}	
	
	public void createRoleCancel(String roletext, String desc) throws InterruptedException
	{
		createRoleButton.click();
		Thread.sleep(3000);
		roleNameTextBox.sendKeys(roletext);
		Thread.sleep(3000);
		roleDescriptionTextBox.sendKeys(desc);
		Thread.sleep(3000);
		createRoleCancelButton.click();
	}
	public void createRoleCreate(String roletext, String desc) throws InterruptedException
	{
		createRoleButton.click();
		Thread.sleep(3000);
		roleNameTextBox.sendKeys(roletext);
		Thread.sleep(3000);
		roleDescriptionTextBox.sendKeys(desc);
		Thread.sleep(3000);
		createRoleCreateButton.click();
	}
}
