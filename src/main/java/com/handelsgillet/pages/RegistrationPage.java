package com.handelsgillet.pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.handelsgillet.testBase.TestBase;

public class RegistrationPage extends TestBase
{

	/*
	*
	*=============================================================================================================
	+++++++++++++++++++++++++++++++++      HomePage link or button for Registration      +++++++++++++++++++++++++
	*=============================================================================================================
	*/

	@FindBy(xpath="//a[contains(text(),'Login')]")
	WebElement LoginIcon;

	@FindBy(xpath="/html/body/app-root/app-home/header/div/div/div[2]/a[1]")
	WebElement applyForMembershipLink;
	
	@FindBy(xpath="//a[contains(text(),'Rigister Now')]")
	WebElement registerNowButton;
	
	@FindBy(xpath="//a[contains(text(),'Register Now')]")
	WebElement registerNowLink;

	@FindBy(xpath="/html/body/app-root/app-apply-membership/div/section[1]/h2")
	WebElement headerRegistrationPage;

	/*
	*
	*=============================================================================================================
	+++++++++++++++++++++++++++++++++++      Basic Information Text Fields      ++++++++++++++++++++++++++++++++++
	*=============================================================================================================
	*/
	@FindBy(xpath="//input[@name='varFirstName']")
	WebElement firstName;

	@FindBy(xpath="//input[@name='varMiddleName']")
	WebElement middleName;

	@FindBy(xpath="//input[@name='varLastName']")
	WebElement lastName;

	@FindBy(xpath="//input[@name='varLastName']/following::input[1]")
	WebElement dobDropDown;
	
	@FindBy(xpath="//input[@name='varBirthPlace']")
	WebElement birthPlace;

	@FindBy(xpath="/html/body/app-root/app-apply-membership/div/section[2]/form/div/div[2]/div[2]/button")
	WebElement uploadPhotoButton;
	
	@FindBy(xpath="//input[@value='M']")
	WebElement maleGender;
	
	//@FindBy(xpath="//input[@class='ng-invalid ng-dirty ng-touched'][2]")
	@FindBy(xpath="//span[contains(text(),'Female')]")
	WebElement femaleGender;
	

	/*
	*
	*=============================================================================================================
	+++++++++++++++++++++++++++++++++++      Personal Information Text Fields      +++++++++++++++++++++++++++++++
	*=============================================================================================================
	*/
	
	@FindBy(xpath="//input[@name='varOccupation']")
	WebElement occupation;
	
	@FindBy(xpath="//input[@name='varHomeTelephone']")
	WebElement privateHomeTelephone;
	
	@FindBy(xpath="//input[@name='varPrivateMobile']")
	WebElement privateMobile;
	
	@FindBy(xpath="//input[@name='varPrivateEmail']")
	WebElement privateEmail;
	
	@FindBy(xpath="//input[@name='varPrivateEmail']/following::textarea[1]")
	WebElement privateAddress;
	
	@FindBy(xpath="//input[@name='varHomeZipCode']")
	WebElement personalHomeZipCode;
	
	@FindBy(xpath="//input[@name='varHomeCity']")
	WebElement personalHomeCity;
	

	/*
	*
	*=============================================================================================================
	+++++++++++++++++++++++++++++++++++      Work Information Text Fields      +++++++++++++++++++++++++++++++++++
	*=============================================================================================================
	*/
	
	
	@FindBy(xpath="//input[@name='varEmployeeAt']")
	WebElement workEmployeeAt;
	
	@FindBy(xpath="//input[@name='varPositon']")
	WebElement workPosition;
	
	@FindBy(xpath="//input[@name='varWorkTelephone']")
	WebElement workTelephone;
	
	@FindBy(xpath="//input[@name='varWorkMobile']")
	WebElement workMobile;
	
	@FindBy(xpath="//input[@name='varWorkMobile']/following::textarea[1]")
	WebElement workAddress;
	
	@FindBy(xpath="//input[@name='varWorkZipCode']")
	WebElement workZipCode;
	
	@FindBy(xpath="//input[@name='varWorkPlace']")
	WebElement workPlace;
	

	/*
	*
	*=============================================================================================================
	+++++++++++++++++++++++++++++++++++      Other Information Text Fields      ++++++++++++++++++++++++++++++++++
	*=============================================================================================================
	*/
	
	//Other Information
	@FindBy(xpath="//input[@placeholder='Enter Mother Tongue']")
	WebElement mTongue;
	
	@FindBy(xpath="//input[@placeholder='Enter Home Language']")
	WebElement homeLanguage;
	
	@FindBy(xpath="//input[@placeholder='Enter Citizenship']")
	WebElement otherCitizenship;
	
	@FindBy(xpath="//textarea[@placeholder='Enter event detail you attend before']")
	WebElement attendAnyEventBeforeFirst;
	
	@FindBy(xpath="//textarea[@placeholder='Enter Notes']")
	WebElement attendAnyEventBeforeSecond;
	
	
	@FindBy(xpath="//button[contains(text(),'Cancel')]")
	WebElement cancelButton;
	
	@FindBy(xpath="//button[contains(text(),'Apply')]")
	WebElement applyButton;
	
	@FindBy(xpath="//button[contains(text(),'Close')]")
	WebElement popUpCloseButton;
	
	@FindBy(xpath="//a[contains(text(),'Login Now')]")
	WebElement loginNowLink;
	
	@FindBy(xpath="/html/body/app-root/app-apply-membership/app-dialogue-popup/div[1]/h3")
	WebElement registrationSuccessfullyWindow;
	
	//Constructor of this class or Initializing the page object.
	public RegistrationPage()
	{
		PageFactory.initElements(driver, this);
		
	}
	
	//=============================================================================================================
	//+++++++++++++++++++++++++++++++++++      Validate Page Title      +++++++++++++++++++++++++++++++++++++++++++
	//=============================================================================================================
	
	public String validateRegistrationPageTitle()
	{
		return driver.getTitle();
	}

	//=============================================================================================================
    //+++++++++++++++++++++++++++++++++++      New Registration      ++++++++++++++++++++++++++++++++++++++++++++++
    //=============================================================================================================
   

   
	 public void newRegistration(String ftName, String mdName, String lsName,String dob,String bPlace,String occ,String phomeTel,String pMob, String pEmail,String pAddress,
	            String pZipCode, String pHomePlace,String wkEmpAt, String wkPos, String wkTel,
	            String wkMob,String wkAddress, String wkZipCode,String wkPlace,String motherTongue,String homeLang,String oCitizenship,String attendFirst, String attendSecond) throws InterruptedException
	    {
	        //Click on Apply for membership.
	        
	        //Basic information text fields
	        applyForMembershipLink.click();  
	        Thread.sleep(5000);
	        firstName.sendKeys(ftName);
	        System.out.println("first name is"+ftName);
	        
	        middleName.sendKeys(mdName);
	        System.out.println("middle name is"+mdName);
	        
	        lastName.sendKeys(lsName);
	        System.out.println("last name is"+lsName);
	        
	        Thread.sleep(1000);
	        
	        //Enter DOB
	        dobDropDown.sendKeys(dob);
	        System.out.println("bitrth date is"+dob);
	        Thread.sleep(1000);
	        
	        birthPlace.sendKeys(bPlace);
	        Thread.sleep(1000);
	        
	        maleGender.click();
	        Thread.sleep(1000);
	        
	        //Personal information text fields.
	        occupation.sendKeys(occ);
	        Thread.sleep(1000);
	        
	        System.out.println("occupation is"+occ);
	        privateHomeTelephone.sendKeys(phomeTel);
	        
	        System.out.println("home telephone is"+phomeTel);
	        Thread.sleep(1000);
	        
	        privateMobile.sendKeys(pMob);
	        System.out.println("mobile number is"+pMob);
	        Thread.sleep(1000);
	        
	        privateEmail.sendKeys(pEmail);
	        Thread.sleep(1000);
	        
	        privateAddress.sendKeys(pAddress);
	        Thread.sleep(1000);
	        
	        personalHomeZipCode.sendKeys(pZipCode);
	        Thread.sleep(1000);
	        
	        personalHomeCity.sendKeys(pHomePlace);
	        Thread.sleep(1000);
	        
	        //Work information text fields.
	        workEmployeeAt.sendKeys(wkEmpAt);
	        Thread.sleep(1000);
	        
	        workPosition.sendKeys(wkPos);
	        System.out.println("work position  is"+wkPos);
	        Thread.sleep(1000);
	        
	        workTelephone.sendKeys(wkTel);
	        System.out.println("work telephone is"+wkTel);
	        Thread.sleep(1000);
	        
	        workMobile.sendKeys(wkMob);
	        System.out.println("work Mobile number is"+wkMob);
	        Thread.sleep(1000);
	        
	        workAddress.sendKeys(wkAddress);
	        System.out.println("work address is"+wkAddress);
	        Thread.sleep(1000);
	        
	        mTongue.sendKeys(motherTongue);
	        
	        homeLanguage.sendKeys(homeLang);
       
       
	        
	        workZipCode.sendKeys(wkZipCode);
	        workPlace.sendKeys(wkPlace);
	        
	        
	        
	        otherCitizenship.sendKeys(oCitizenship);
	        System.out.println("citizenship value is"+oCitizenship);
	        Thread.sleep(1000);
	        
	        attendAnyEventBeforeFirst.sendKeys(attendFirst);
	        
	        attendAnyEventBeforeSecond.sendKeys(attendSecond);
	        
	        //enterNotes.sendKeys(eNotes);
	        Thread.sleep(2000);
	        
	        //Buttons
	        
	        applyButton.click();
	        
	        System.out.println("click on applybutton");
	        
	        Thread.sleep(10000);
	        
	        /*
	        Alert a = driver.switchTo().alert();
	        String alertText = a.getText();
			System.out.println("Alert text is " + alertText);
			a.accept();
	        */
	        String text = registrationSuccessfullyWindow.getText();
	        System.out.println(text);
	        
	        Thread.sleep(3000);
	        
	        popUpCloseButton.click();
	        
	        
	        //cancelButton.click();
	        
	        //return new HomePage();
	    }
	}

