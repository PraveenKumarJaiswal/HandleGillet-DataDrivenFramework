package com.handelsgillet.TestCases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.handelsgillet.pages.HGLandingMenuPage;
import com.handelsgillet.pages.MenuAktueltPage;
import com.handelsgillet.pages.MenuGilleMagazinePage;
import com.handelsgillet.pages.MenuKalenderPage;
import com.handelsgillet.pages.MenuKlubbarPage;
import com.handelsgillet.pages.MenuKontaktPage;
import com.handelsgillet.pages.MenuLokaliteterPage;
import com.handelsgillet.pages.MenuOmHandelsgilletPage;
import com.handelsgillet.testBase.TestBase;

public class HGLandingMenuPageTestCase extends TestBase
{
	HGLandingMenuPage hgLandingMenuPage;
	MenuOmHandelsgilletPage menuOmHandelsgilletPage;
	MenuAktueltPage menuAktueltPage;
	MenuLokaliteterPage menuLokaliteterPage;
	MenuKlubbarPage menuKlubbarPage;
	MenuKontaktPage menuKontaktPage;
	MenuKalenderPage menuKalenderPage;
	MenuGilleMagazinePage menuGilleMagazinePage;
	
	
	public HGLandingMenuPageTestCase()
	{
		super();
	}
	
	@BeforeMethod
	public void setUp() throws Throwable
	{
		initialization();
		hgLandingMenuPage = new HGLandingMenuPage();
		menuOmHandelsgilletPage = new MenuOmHandelsgilletPage();
		menuAktueltPage = new MenuAktueltPage();
		menuLokaliteterPage = new MenuLokaliteterPage();
		menuKlubbarPage = new MenuKlubbarPage();
		menuKontaktPage = new MenuKontaktPage();
		menuKalenderPage = new MenuKalenderPage();
		menuGilleMagazinePage = new MenuGilleMagazinePage();
	}
	
	@Test(priority=1, enabled=true)
	public void verifyMenuOmHandelsgilletTest() throws Throwable
	{
		
		menuOmHandelsgilletPage = hgLandingMenuPage.clickOnMenuOmHandelsgillet();
	}
	
	@Test(priority=2)
	public void verifyMenuAktuelTest() throws Throwable
	{
		menuAktueltPage = hgLandingMenuPage.clickonMenuAktuelt();
	}

	@Test(priority=3)
	public void verifyMenuLokaliteterTest() throws Throwable
	{
		menuLokaliteterPage = hgLandingMenuPage.clickonMenuLokaliteter();
	}
	
	@Test(priority=4)
	public void verifyMenuKlubbarTest() throws Throwable
	{
		menuKlubbarPage = hgLandingMenuPage.clickonMenuKlubbar();
	}
	
	@Test(priority=5)
	public void verifyMenuKontakTest() throws Throwable
	{
		menuKontaktPage = hgLandingMenuPage.clickonMenuKontakt();
	}
	
	/*
	@Test(priority=6)
	public  void verifyMenuKalenderTest() throws Throwable
	{
		menuKalenderPage = hgLandingMenuPage.clickonMenuKalender();
	}
	*/
	
	@Test(priority=6) 
	public void verifyMenuGilleMagazineTest() throws Throwable
	{
		menuGilleMagazinePage = hgLandingMenuPage.clickonMenuGilleMagazine();
	}

	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
	
}
