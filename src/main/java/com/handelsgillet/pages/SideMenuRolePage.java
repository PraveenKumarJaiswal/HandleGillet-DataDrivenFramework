package com.handelsgillet.pages;

import java.util.List;

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
	
	LoginPage loginPage;
	public SideMenuRolePage()
	{
		PageFactory.initElements(driver,this);
	}
	
	public void ViewNewApplicationTableData() 
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
	
			

}
