package com.handelsgillet.pages;

import java.awt.Checkbox;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.handelsgillet.testBase.TestBase;

public class SideMenuEventsPage extends TestBase
{
	
	@FindBy(xpath="//a[contains(text(),'Create Event')]")
	WebElement createEventsMenu;
	
	@FindBy(xpath="//a[contains(text(),'Hg Events')]")
	WebElement hgEventsMenu;
	
	@FindBy(xpath="//a[contains(text(),'All Events')]")
	WebElement allEventsMenu;
	
	@FindBy(xpath="//a[contains(text(),'Event Type')]")
	WebElement eventsTypeMenu;
	
					/*##################################################
									Create Events WebElements
					##################################################*/
	
	@FindBy(xpath="//select[@name='intFkEventTypes']")
	WebElement eventTypeDD;
	
	@FindBy(xpath="//select[@name='intFkEventAccessTypes']")
	WebElement eventAccessTypeDD;
	
	@FindBy(xpath="//select[@name='eventCreationFor']")
	WebElement eventByDD;
	
	@FindBy(xpath="//input[@name='varShortName']")
	WebElement eventName;
	
	@FindBy(xpath="//input[@name='varShortDesc']")
	WebElement eventSubject;
	
	@FindBy(xpath="//input[@name='varLocation']")
	WebElement place;
	
	@FindBy(xpath="//input[@name='dtStartDate']")
	WebElement selectStartDate;
	
	@FindBy(xpath="//input[@name='dtEndDate']")
	WebElement selectendDate;
	
	@FindBy(xpath="//input[@name='varFromTime']")
	WebElement selectStartTime;
	
	@FindBy(xpath="//input[@name='varToTime']")
	WebElement selectEndTime;
	
	@FindBy(xpath="//input[@name='intNoOfSeats']")
	WebElement seats;
	
	@FindBy(xpath="//input[@name='varSpecialGuest']")
	WebElement specialGuest;
	
	@FindBy(xpath="/html/body/app-root/app-dashboard/div/main/div/aside[2]/app-manage-events/div/div/app-event-creation-form/div/form/div/div/div[1]/div[1]/div[6]/div[1]/label[2]/span")
	WebElement seatCheckBox;
	
	@FindBy(xpath="/html/body/app-root/app-dashboard/div/main/div/aside[2]/app-manage-events/div/div/app-event-creation-form/div/form/div/div/div[1]/div[1]/div[7]/div/label[2]/span")
	WebElement feeCheckBox;
	
	@FindBy(xpath="//*[@class='checkmark']")
	WebElement selectMemberCheckBox;
	
	@FindBy(xpath="//input[@name='intFeeUnit']")
	WebElement feePerPerson;
	
	@FindBy(xpath="//input[@name='varFeeDesc']")
	WebElement feeDescription;
	
	@FindBy(xpath="//textarea[@name='txtDescription']")
	WebElement description;
	
	@FindBy(xpath="//textarea[@name='varMessage']")
	WebElement message;
	
	@FindBy(xpath="//button[contains(text(),'ADD')]")
	WebElement addButton;
	
	@FindBy (xpath="//select[@name='intFkEventTypes']")
	WebElement eventType;
	
	@FindBy (xpath="//select[@name='intFkEventAccessTypes']")
	WebElement eventAccessType;
	
	@FindBy (xpath="//select[@name='eventCreationFor']")
	WebElement eventBy;
	
	@FindBy (xpath="//select[@name='intFkMemberClubs']")
	WebElement eventClub;
	
	@FindBy (xpath="//select[@name='intFkMemberClubs']")
	WebElement clubAdmin;
	
	@FindBy (xpath="//select")
	WebElement setQuestionType;
	
	@FindBy (xpath="//textarea[@placeholder='Type Your Question']")
	WebElement typeYourQuestion;
	
	@FindBy (xpath="//button[contains(text(),'Next Step')]")
	WebElement nextStepButton;
	
	@FindBy (xpath="//button[contains(text(),'Save')]")
	WebElement SaveButton;
	
	@FindBy(xpath="//textarea[@placeholder='Write Message Here ..']")
	WebElement inviteMessageTextBox;
	
	@FindBy(xpath="//button[text()='Invite']")
	WebElement inviteButton;
	
	@FindBy(xpath="//button[text()='Close']")
	WebElement closeButton;
	
	@FindBy(xpath="//input[@placeholder = 'Fliter By Event Name']")
	WebElement searchButton;
	
	@FindBy(xpath="//input[@placeholder = 'Fliter By Date']")
	WebElement searchByDate;
	
	@FindBy(xpath="/html/body/app-root/app-dashboard/div/main/div/aside[2]/app-manage-events/div/div/app-created-events/div/section/div/div/div[2]/div/div/button[1]")
	WebElement cancelFormButton;
	
	@FindBy(xpath="//button[text()='Edit']")
	WebElement editFormButton;
	
	@FindBy(xpath="//button[text()='Questionnaire']")
	WebElement questionnaireFormButton;
	
	@FindBy(xpath="//button[text()='Invite Members']")
	WebElement inviteMembersFormButton;
	
	@FindBy(xpath="//button[text()='Cancel Editing']")
	WebElement CancelEditingFormButton;
	
	@FindBy(xpath="//button[text()='Update']")
	WebElement updateFormButton;
	
	@FindBy(xpath="//button[text()='Close']")
	WebElement questionareCloseButton;
	
	@FindBy(xpath="//button[text()='Back']")
	WebElement backButtonMemberPage;
	
	@FindBy(xpath="//button[text()='No']")
	WebElement noButtonPopUp;
	
	@FindBy(xpath="//button[text()='Yes']")
	WebElement yesButtonPopUp;
	
	@FindBy(xpath="//textarea[@placeholder='Description Goes Here...']")
	WebElement cancelEventTextAreaPopUp;
			
	@FindBy(xpath="//input[@placeholder='Fliter By Event Type']")
	WebElement searchlEventTypeTextbox;
		
	@FindBy(xpath="//button[text()='Create New Event Type']")
	WebElement createNewEventTypeButton;
	
	@FindBy(xpath="//input[@placeholder='Enter Event Type']")
	WebElement enterEventTypeTextBox;
			
	@FindBy(xpath="//input[@placeholder='Enter Info']")
	WebElement enterEventInfoTextBox;
	
	@FindBy(xpath="//button[text()='Cancel']")
	WebElement cancelEventTypeButton;
	
	@FindBy(xpath="//button[text()='Create']")
	WebElement createEventTypeButton;
	
	public SideMenuEventsPage() throws Throwable
	{
		PageFactory.initElements(driver, this); 
		Thread.sleep(3000);
	}
	

	public String verifyHomePageTitle()
	{
		return driver.getTitle();
	}
	
	//=============================================================================================================
	//++++++++++++++++++++++++++++++++++++ Verify CreateEventsTab.      ++++++++++++++++++++++++++++++++++++++++
	//=============================================================================================================

	
	public CreateEventsPage clickOnCreateEventsMenu() throws Throwable
	{
		createEventsMenu.click(); 
		Thread.sleep(3000);
		return new CreateEventsPage();	
	}

	public void createEvents(String eName,String eSubject, String ePlace, String sDate, String eDate, 
			String sTime, String eTime, String seat, String spGuest, String fPerPerson, String fDesc,
			String desc, String msg) throws Throwable
	{
		Select eventTypedd = new Select(eventType);
		eventTypedd.selectByVisibleText("monthly events");
		Thread.sleep(3000);
		
		Select eventAccessTypedd = new Select(eventAccessType);
		eventAccessTypedd.selectByVisibleText("Public");
		Thread.sleep(3000);
		
		Select eventBydd = new Select(eventBy);
		eventBydd.selectByVisibleText("SuperAdmin");
		Thread.sleep(3000);
		
		/*
		Select eventClubdd = new Select(eventClub);
		eventClubdd.selectByVisibleText("abc");
		Thread.sleep(3000);
		
		Select clubAdmindd = new Select(clubAdmin);
		clubAdmindd.selectByVisibleText("kimm");
		Thread.sleep(3000);
		*/
		
		eventName.sendKeys(eName);
		
		eventSubject.sendKeys(eSubject);
		place.sendKeys(ePlace);
		
		selectStartDate.sendKeys(sDate);
		
		selectendDate.sendKeys(eDate);
		
		selectStartTime.sendKeys(sTime);
		
		selectEndTime.sendKeys(eTime);
		
		seatCheckBox.click();
		Thread.sleep(3000);
		seats.sendKeys("5");
		
		
		
		specialGuest.sendKeys(spGuest);
		
		
		feeCheckBox.click();
		
		feePerPerson.sendKeys(fPerPerson);
		
		feeDescription.sendKeys(fDesc);
		
		description.sendKeys(desc);
		
		message.sendKeys(msg);
		
		addButton.click();
		
	}
	public void askQuestion() throws Throwable
	{
		
		System.out.println("This is ask questions");
		Thread.sleep(60000);
		System.out.println("This is ask questions");
		
		Select setQuestionTypedd = new Select(setQuestionType);
		Thread.sleep(3000);
		setQuestionTypedd.selectByVisibleText("Text Type");
		
		Thread.sleep(3000);
		
		typeYourQuestion.sendKeys("This is test question");
		Thread.sleep(3000);
		
		SaveButton.click();
		Thread.sleep(3000);
		nextStepButton.click();
	}
	public void selectMemberForEvent() throws InterruptedException
	{
		List<WebElement> memberCheckBox = driver.findElements(By.xpath("//*[@class='checkmark']"));
		int memberCheckBox_count = memberCheckBox.size();
		System.out.println("view count is: "+memberCheckBox_count);
		for(int i=0;i<memberCheckBox_count;i++)
		{
			
			memberCheckBox.get(i).click();
			Thread.sleep(3000);
			inviteMessageTextBox.sendKeys("This is testing message. Please ignore it. Thanks ");
			Thread.sleep(3000);
			inviteButton.click();
			Thread.sleep(3000);
			closeButton.click();
			System.out.println("Navigate to create event Page");
			break;
		}
	}
		

	

	//=============================================================================================================
	//++++++++++++++++++++++++++++++++++++ Verify HGEventsTab.      ++++++++++++++++++++++++++++++++++++++++
	//=============================================================================================================

	public HGEventsPage clickOnHGEventsMenus() throws Throwable
	{
		hgEventsMenu.click();
		Thread.sleep(3000);
		return new HGEventsPage();
	}
	
	public void verifySearch() throws InterruptedException
	{
		searchButton.click();
		Thread.sleep(3000);
		searchButton.sendKeys("a");
		
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
	
	public void verifySearchByDate() throws InterruptedException
	{
		searchByDate.click();
		Thread.sleep(3000);
		searchByDate.sendKeys("20-12-2018");
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
			Thread.sleep(5000);
			cancelFormButton.click();
			Thread.sleep(3000);
			break;
			//view = driver.findElements(By.xpath("//table[@class='table table-striped']//td[@class='div_content_center']"));
		}
	}
	
	public void ViewHGFormAndEdit_CancelApplication() throws InterruptedException
	{
		List<WebElement> view = driver.findElements(By.xpath("//button[@tooltip='View']"));
		int view_count = view.size();
		System.out.println("view count is: "+view_count);
		for(int i=0;i<view_count;i++)
		{
			
			view.get(i).click();
			Thread.sleep(3000);
			System.out.println("Viewed the New applicant form");
			editFormButton.click();
			System.out.println("+++++++++++++++++++++++++++++++++++++++++++++");
			System.out.println("clicked on edit button");
			System.out.println("+++++++++++++++++++++++++++++++++++++++++++++");
			
			Thread.sleep(3000);
			CancelEditingFormButton.click();
			System.out.println("+++++++++++++++++++++++++++++++++++++++++++++");
			System.out.println("clicked on edit cancel button");
			System.out.println("+++++++++++++++++++++++++++++++++++++++++++++");
			Thread.sleep(3000);
			cancelFormButton.click();
			Thread.sleep(3000);
			view = driver.findElements(By.xpath("//button[@tooltip='View']"));
			Thread.sleep(3000);
			//break;
		}
	}
	
	public void ViewHGEventFormAndEdit_UpdateApplication() throws InterruptedException
	{
		List<WebElement> view = driver.findElements(By.xpath("//button[@tooltip='View']"));
		int view_count = view.size();
		System.out.println("view count is: "+view_count);
		for(int i=0;i<view_count;i++)
		{
			
			view.get(i).click();
			Thread.sleep(3000);
			System.out.println("Viewed the New applicant form");
			
			editFormButton.click();
			System.out.println("+++++++++++++++++++++++++++++++++++++++++++++");
			System.out.println("clicked on edit button");
			System.out.println("+++++++++++++++++++++++++++++++++++++++++++++");
			Thread.sleep(3000);
			
			updateFormButton.click();
			Thread.sleep(6000);
			System.out.println("+++++++++++++++++++++++++++++++++++++++++++++");
			System.out.println("clicked on edit save button");
			System.out.println("+++++++++++++++++++++++++++++++++++++++++++++");
			view = driver.findElements(By.xpath("//button[@tooltip='View']"));
		}
	}
	
	public void ViewHGEventFormQuestionare() throws InterruptedException
	{
		List<WebElement> view = driver.findElements(By.xpath("//button[@tooltip='View']"));
		int view_count = view.size();
		System.out.println("view count is: "+view_count);
		for(int i=0;i<view_count;i++)
		{
			
			view.get(i).click();
			Thread.sleep(3000);
			System.out.println("Viewed the New applicant form");
			questionnaireFormButton.click();
			System.out.println("Clicked on questionare button");
			questionareCloseButton.click();
			System.out.println("Clicked on questionare close button");
			cancelFormButton.click();
			System.out.println("Clicked on form back button");
			Thread.sleep(3000);
			view = driver.findElements(By.xpath("//button[@tooltip='View']"));
		}
	}
	
	public void ViewHGEventFormInviteMember() throws InterruptedException
	{
		List<WebElement> view = driver.findElements(By.xpath("//button[@tooltip='checkmark']"));
		int view_count = view.size();
		System.out.println("view count is: "+view_count);
		for(int i=0;i<view_count;i++)
		{
			
			view.get(i).click();
			Thread.sleep(3000);
			System.out.println("Viewed the New applicant form");
			inviteMembersFormButton.click();
			Thread.sleep(5000);
			inviteMessageTextBox.sendKeys("This is testing message. Please ignore it. Thanks ");
			Thread.sleep(3000);
			inviteButton.click();
			Thread.sleep(3000);
			closeButton.click();
			System.out.println("Navigate to create event Page");
			break;
			
			
			}
	}
		
		public void clickonMembersAndBackButton() throws InterruptedException
		{
			List<WebElement> view = driver.findElements(By.xpath("//button[@tooltip='Members']"));
			int view_count = view.size();
			System.out.println("view count is: "+view_count);
			for(int i=0;i<view_count;i++)
			{
				
				view.get(i).click();
				Thread.sleep(3000);
				System.out.println("clicked on members button");
				Thread.sleep(3000);
				backButtonMemberPage.click();
				break;
			}
		}
		//
		
		public void cancelEventAndNoButton() throws InterruptedException
		{
			List<WebElement> view = driver.findElements(By.xpath("//button[@tooltip='Cancel Event']"));
			int view_count = view.size();
			System.out.println("view count is: "+view_count);
			for(int i=0;i<view_count;i++)
			{
				
				view.get(i).click();
				Thread.sleep(3000);
				System.out.println("clicked on cancel events button");
				Thread.sleep(3000);
				//backButtonMemberPage.click();
				driver.findElement(By.xpath("/html/body/app-root/app-dashboard/div/main/div/aside[2]/app-manage-events/div/div/app-created-events/app-dialogue-popup/div[1]")).click();
				Thread.sleep(3000);
				noButtonPopUp.click();
				break;
			}
		}
		
		public void cancelEventAndYesButton() throws InterruptedException
		{
			List<WebElement> view = driver.findElements(By.xpath("//button[@tooltip='Cancel Event']"));
			int view_count = view.size();
			System.out.println("view count is: "+view_count);
			for(int i=0;i<view_count;i++)
			{
				
				view.get(i).click();
				Thread.sleep(3000);
				System.out.println("clicked on cancel events button");
				Thread.sleep(3000);
				//backButtonMemberPage.click();
				driver.findElement(By.xpath("/html/body/app-root/app-dashboard/div/main/div/aside[2]/app-manage-events/div/div/app-created-events/app-dialogue-popup/div[1]")).click();
				Thread.sleep(3000);
				cancelEventTextAreaPopUp.sendKeys("This is for testing ");
				Thread.sleep(3000);
				noButtonPopUp.click();
				break;
			}
		}

	//=============================================================================================================
	//++++++++++++++++++++++++++++++++++++ Verify AllEventsTab.      ++++++++++++++++++++++++++++++++++++++++
	//=============================================================================================================

	public AllEventsPage clickOnAllEventsMenu() throws Throwable
	{
		allEventsMenu.click(); 
		Thread.sleep(3000);
		return new AllEventsPage();
		
	}

	//=============================================================================================================
	//++++++++++++++++++++++++++++++++++++ Verify EventsTypeTab.      ++++++++++++++++++++++++++++++++++++++++
	//=============================================================================================================

	public EventsTypePage clickOnEventsTypeMenu() throws Throwable
	{
		eventsTypeMenu.click(); 
		Thread.sleep(3000);
		return new EventsTypePage();
	}
	
	public void groupsSearch() throws InterruptedException
	{
		searchlEventTypeTextbox.sendKeys("E");
		Thread.sleep(3000);
	}
	
	public void clickOnEventsTypeMenuCreateEventAndCancel() throws Throwable
	{
		createNewEventTypeButton.click();
		Thread.sleep(3000);
		enterEventTypeTextBox.sendKeys("Test Event");
		Thread.sleep(3000);
		enterEventInfoTextBox.sendKeys("This info is for testing");
		Thread.sleep(3000);
		cancelEventTypeButton.click();
	}
	
	public void clickOnEventsTypeMenuCreateEventAndCreate() throws Throwable
	{
		createNewEventTypeButton.click();
		Thread.sleep(3000);
		enterEventTypeTextBox.sendKeys("Test Event");
		Thread.sleep(3000);
		enterEventInfoTextBox.sendKeys("This info is for testing");
		Thread.sleep(3000);
		createEventTypeButton.click();
	}
}
