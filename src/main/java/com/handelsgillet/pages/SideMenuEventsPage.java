package com.handelsgillet.pages;

import java.awt.Checkbox;
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
	
	@FindBy(xpath="//span[@class='checkmark']")
	WebElement feeCheckBox;
	
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
		
		seats.sendKeys(seat);
		
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
	

	//=============================================================================================================
	//++++++++++++++++++++++++++++++++++++ Verify HGEventsTab.      ++++++++++++++++++++++++++++++++++++++++
	//=============================================================================================================

	public HGEventsPage clickOnHGEventsMenus() throws Throwable
	{
		hgEventsMenu.click();
		Thread.sleep(3000);
		return new HGEventsPage();
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
}
