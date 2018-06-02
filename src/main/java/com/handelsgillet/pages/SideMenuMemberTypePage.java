package com.handelsgillet.pages;

import java.util.List;

import org.apache.http.impl.client.EntityEnclosingRequestWrapper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.handelsgillet.testBase.TestBase;

public class SideMenuMemberTypePage extends TestBase
{
	@FindBy(xpath="//input[@placeholder = 'Fliter By Name']")
	WebElement searchButton;
	
	@FindBy(xpath="//button[text()='Add New Type']")
	WebElement addNewTypeButton;
	
	@FindBy(xpath="//table//tbody")
	WebElement tableData;
	
	@FindBy(xpath="//div[@class='dialog ng-tns-c3-9 ng-trigger ng-trigger-dialog ng-star-inserted']")
	WebElement popUpDelete;
	
	@FindBy(xpath="//button[text()='No']")
	WebElement memberTypeDeleteNoButton;
	
	@FindBy(xpath="//button[text()='Yes']")
	WebElement memberTypeDeleteYesButton;
	
	@FindBy(xpath="//*[@class='col-md-12 popup_title']")
	WebElement addNewTypePopUp;
	
	@FindBy(xpath="//input[@placeholder='Enter Member Type']")
	WebElement enterMemberType;
	
	@FindBy(xpath="//input[@placeholder='Enter Description']")
	WebElement enterDescritpion;
	
	@FindBy(xpath="//button[text()='Create']")
	WebElement addNewTypePopUpCreateButton;
	
	@FindBy(xpath="//button[text()='Cancel']")
	WebElement addNewTypePopUpCancelButton;
	
	
	
	LoginPage loginPage;
	public SideMenuMemberTypePage()
	{
		PageFactory.initElements(driver,this);
	}
	
	public void verifySearch() throws InterruptedException
	{
		searchButton.click();
		Thread.sleep(3000);
		searchButton.sendKeys("Admin");
		
	}
	
	public void ViewmemberTypeTableData() 
	{
		 WebElement mytable = driver.findElement(By.xpath("//table//tbody"));
		 List<WebElement> rows_table = mytable.findElements(By.tagName("tr"));
		 int rows_count = rows_table.size();
		 System.out.println("row count is :"+rows_count);
		 
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
	
	
	public void ViewMemberTypeDeleteAndCancel() throws InterruptedException
	{
		List<WebElement> view = driver.findElements(By.xpath("//table//tr//td[4]"));
		int view_count = view.size();
		System.out.println("view count is: "+view_count);
		for(int i=0;i<view_count;i++)
		{
			view.get(i).click();
			Thread.sleep(3000);
			System.out.println("Clicked on delete button");
			popUpDelete.click();
			Thread.sleep(3000);
			popUpDelete.getText();
			Thread.sleep(3000);
			memberTypeDeleteNoButton.click();
			Thread.sleep(3000);
			System.out.println("clicked on no button");
		}
		
	}
	public void ViewMemberTypeDeleteAndYes() throws InterruptedException
	{
		List<WebElement> view = driver.findElements(By.xpath("//table//tr//td[4]"));
		int view_count = view.size();
		System.out.println("view count is: "+view_count);
		for(int i=0;i<view_count;i++)
		{
			view.get(i).click();
			Thread.sleep(3000);
			System.out.println("Clicked on delete button");
			popUpDelete.click();
			Thread.sleep(3000);
			popUpDelete.getText();
			Thread.sleep(3000);
			memberTypeDeleteYesButton.click();
			Thread.sleep(3000);
			System.out.println("clicked on YES button");
		}
		
	}
	
	public void addNewTypeandCancel(String memType, String descTpe)throws InterruptedException
	{
		addNewTypeButton.click();
		Thread.sleep(3000);
		addNewTypePopUp.click();
		addNewTypePopUp.getText();
		Thread.sleep(3000);
		enterMemberType.sendKeys(memType);
		Thread.sleep(3000);
		enterDescritpion.sendKeys(descTpe);
		Thread.sleep(3000);
		addNewTypePopUpCancelButton.click();
		Thread.sleep(3000);
		System.out.println("Canceled the added new type");
		driver.quit();
	}
	public void addNewTypeandCreate(String memType, String descTpe)throws InterruptedException
	{
		addNewTypeButton.click();
		Thread.sleep(3000);
		addNewTypePopUp.click();
		addNewTypePopUp.getText();
		Thread.sleep(3000);
		enterMemberType.sendKeys(memType);
		Thread.sleep(3000);
		enterDescritpion.sendKeys(descTpe);
		Thread.sleep(3000);
		addNewTypePopUpCreateButton.click();
		Thread.sleep(3000);
		System.out.println("Created the new type");
		driver.quit();
	}
	
	
	
	
}
