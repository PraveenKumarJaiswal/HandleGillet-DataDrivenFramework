package com.handelsgillet.pages;

import java.awt.Dimension;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.handelsgillet.testBase.TestBase;

public class SideMenuNewApplicationsPage extends TestBase
{
	@FindBy(xpath="//input[@placeholder='Fliter By Name']")
	WebElement searchField;
	
	@FindBy(xpath="/html/body/app-root/app-dashboard/div/main/div/aside[2]/app-manage-applications/div/div[2]/table/tbody")
	WebElement tableData;
	//  //*[contains(text(),'Previous')]
	
	@FindBy(xpath="//*[contains(text(),'Previous')]")
	WebElement previousButton;
	
	@FindBy(xpath="//*[contains(text(),'Next')]")
	WebElement nextButton;
	
	@FindBy(xpath=" //table[@class='table table-striped']//td[@class='div_content_center']")
	WebElement viewButtom;
	
	@FindBy(xpath="//textarea[@placeholder='Enter Notes']//following::button[1]")
	WebElement cancelButton;
	
	@FindBy(xpath="//textarea[@placeholder='Enter Notes']//following::button[2]")
	WebElement acceptApplicationButton;
	
	@FindBy(xpath="//textarea[@placeholder='Enter Notes']//following::button[3]")
	WebElement deleteApplicatinButton;
	
	@FindBy(xpath="//textarea[@placeholder='Enter Notes']//following::button[4]")
	WebElement editApplicationButton;
	
	@FindBy(xpath="//textarea[@placeholder='Enter Notes']//following::button[5]")
	WebElement printApplicationButton;
	
	@FindBy(xpath="//textarea[@placeholder='Enter Notes']//following::button[6]")
	WebElement editCancelApplicationButton;
	
	@FindBy(xpath="//textarea[@placeholder='Enter Notes']//following::button[7]")
	WebElement editSaveApplicationButton;
	
	
	
	  LoginPage loginPage;
		public SideMenuNewApplicationsPage()
		{
			PageFactory.initElements(driver,this);
			
		}
		
		public void ViewNewApplicationTableData() 
		{
			 WebElement mytable = driver.findElement(By.xpath("//table[@class='table table-striped']"));
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
		
		public void ViewApplicationFormAndCancel() throws InterruptedException
		{
			List<WebElement> view = driver.findElements(By.xpath("//table[@class='table table-striped']//td[@class='div_content_center']"));
			int view_count = view.size();
			System.out.println("view count is: "+view_count);
			for(int i=0;i<view_count;i++)
			{
				view.get(i).click();
				Thread.sleep(3000);
				System.out.println("Viewed the New applicant form");
				cancelButton.click();
				Thread.sleep(3000);
			}
			
		}
		
		public void ViewApplicationFormAndAcceptApplication() throws InterruptedException
		{
			List<WebElement> view = driver.findElements(By.xpath("//table[@class='table table-striped']//td[@class='div_content_center']"));
			int view_count = view.size();
			System.out.println("view count is: "+view_count);
			for(int i=0;i<view_count;i++)
			{
				view.get(i).click();
				Thread.sleep(3000);
				System.out.println("Viewed the New applicant form");
				acceptApplicationButton.click();
				Thread.sleep(3000);
				
				//As nothing is happening when accepting application so after clicking on accepting application clicking on cancel button.
				cancelButton.click();
			}
		}
		
		public void ViewApplicationFormAndDeleteApplication() throws InterruptedException
		{
			List<WebElement> view = driver.findElements(By.xpath("//table[@class='table table-striped']//td[@class='div_content_center']"));
			int view_count = view.size();
			System.out.println("view count is: "+view_count);
			for(int i=0;i<view_count;i++)
			{
				//WebDriverWait wait = new WebDriverWait(driver, 10);
				//WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(" //table[@class='table table-striped']//td[@class='div_content_center']")));
				
				view.get(i).click();
				Thread.sleep(3000);
				System.out.println("Viewed the New applicant form");
				deleteApplicatinButton.click();
				Thread.sleep(3000);
			}
		}
		
		public void ViewApplicationFormAndEdit_CancelApplication() throws InterruptedException
		{
			List<WebElement> view = driver.findElements(By.xpath("//table[@class='table table-striped']//td[@class='div_content_center']"));
			int view_count = view.size();
			System.out.println("view count is: "+view_count);
			for(int i=0;i<view_count;i++)
			{
				//WebDriverWait wait = new WebDriverWait(driver, 10);
				//WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(" //table[@class='table table-striped']//td[@class='div_content_center']")));
				
				view.get(i).click();
				Thread.sleep(3000);
				System.out.println("Viewed the New applicant form");
				editApplicationButton.click();
				System.out.println("+++++++++++++++++++++++++++++++++++++++++++++");
				System.out.println("clicked on edit button");
				System.out.println("+++++++++++++++++++++++++++++++++++++++++++++");
				
				Thread.sleep(3000);
				editCancelApplicationButton.click();
				System.out.println("+++++++++++++++++++++++++++++++++++++++++++++");
				System.out.println("clicked on edit cancel button");
				System.out.println("+++++++++++++++++++++++++++++++++++++++++++++");
				
				
				Thread.sleep(3000);
			}
		}
		
		public void ViewApplicationFormAndEdit_SaveApplication() throws InterruptedException
		{
			List<WebElement> view = driver.findElements(By.xpath("//table[@class='table table-striped']//td[@class='div_content_center']"));
			int view_count = view.size();
			System.out.println("view count is: "+view_count);
			for(int i=0;i<view_count;i++)
			{
				//WebDriverWait wait = new WebDriverWait(driver, 10);
				//WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(" //table[@class='table table-striped']//td[@class='div_content_center']")));
				
				view.get(i).click();
				Thread.sleep(3000);
				System.out.println("Viewed the New applicant form");
				
				editApplicationButton.click();
				System.out.println("+++++++++++++++++++++++++++++++++++++++++++++");
				System.out.println("clicked on edit button");
				System.out.println("+++++++++++++++++++++++++++++++++++++++++++++");
				Thread.sleep(3000);
				
				editSaveApplicationButton.click();
				Thread.sleep(3000);

				System.out.println("+++++++++++++++++++++++++++++++++++++++++++++");
				System.out.println("clicked on edit save button");
				System.out.println("+++++++++++++++++++++++++++++++++++++++++++++");
			}
		}
		
}
		
	
	
	
	
	
	
	
	
