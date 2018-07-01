package com.handelsgillet.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.handelsgillet.testBase.TestBase;

public class HGLandingMenuPage extends TestBase
{
	//=============================================================================================================
	//+++++++++++++++++++++++++++++++++++++      Landing Page Menu      +++++++++++++++++++++++++++++++++++++++++++
	//=============================================================================================================
	
	
	@FindBy(xpath="//a[contains(text(),'Aktuelt')]/preceding::a[contains(text(),'Om Handelsgillet')]")
	WebElement LandingPageMenuOmHandelsgillet;

	@FindBy(xpath="//a[contains(text(),'Aktuelt')]")
	WebElement LandingPageMenuAktuelt;

	@FindBy(xpath="//a[contains(text(),'Lokaliteter')]")
	WebElement LandingPageMenuLokaliteter;

	@FindBy(xpath="//a[contains(text(),'Klubbar')]")
	WebElement LandingPageMenuKlubbar;

	@FindBy(xpath="//a[contains(text(),'Kontakt')]")
	WebElement LandingPageMenuKontakt;

	@FindBy(xpath="//a[contains(text(),'Kalender')]")
	WebElement LandingPageMenuKalender;
	
	@FindBy(xpath="//a[contains(text(),'Gille Magazine')]")
	WebElement LandingPageMenuGilleMagzine;
	
	public HGLandingMenuPage() throws Throwable
	{
		PageFactory.initElements(driver, this); 
		Thread.sleep(3000);
	}
	
	//=============================================================================================================
	//+++++++++++++++++++++++++++++++++      Landing Page Menu clicks      ++++++++++++++++++++++++++++++++++++++++
	//=============================================================================================================
	
	
	public MenuOmHandelsgilletPage clickOnMenuOmHandelsgillet() throws Throwable
	{
		System.out.println("Launching the HG  homepage");
		Thread.sleep(30000);
		LandingPageMenuOmHandelsgillet.click(); 
		Thread.sleep(3000);
		return new MenuOmHandelsgilletPage();
		
	}
	
	public MenuAktueltPage clickonMenuAktuelt()
	{
		LandingPageMenuAktuelt.click();
		return new MenuAktueltPage();
	}
	
	public MenuLokaliteterPage clickonMenuLokaliteter()
	{
		LandingPageMenuLokaliteter.click();
		return new MenuLokaliteterPage();
	}
	public MenuKlubbarPage clickonMenuKlubbar()
	{
		LandingPageMenuKlubbar.click();
		return new MenuKlubbarPage();
	}
	public MenuKontaktPage clickonMenuKontakt()
	{
		LandingPageMenuKontakt.click();
		return new MenuKontaktPage();
	}
	
	public MenuKalenderPage clickonMenuKalender()
	{
		LandingPageMenuKalender.click();
		return new MenuKalenderPage();
	}
	
	public MenuGilleMagazinePage clickonMenuGilleMagazine()
	{
		LandingPageMenuGilleMagzine.click();
		return new MenuGilleMagazinePage();
	}

	
}
