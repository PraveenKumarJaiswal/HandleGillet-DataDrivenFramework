package com.handelsgillet.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.handelsgillet.testBase.TestBase;
import com.handelsgillet.util.TestUtil;

public class LoginPage extends TestBase
{
    TestUtil testutil;
    SideMenuAllTabs sideMenuAlltabs;
    
    //Page Factory - OR
        
    @FindBy(xpath="/html/body/app-root/app-dashboard/div/header/div/div[1]/div[2]")
    WebElement superAdminPageLabel;
    
    @FindBy(xpath="//a[contains(text(),'Login')]")
    WebElement LoginIcon;
    
    @FindBy(xpath="//input[@name='varName' and @placeholder='Enter Username / Email']")
    WebElement username;
    
    @FindBy(xpath="//input[@name='varPassword' and @placeholder='Enter Password']")
    WebElement password;
    
    @FindBy(xpath="//button[@type='submit']")
    WebElement loginBtn;
    
    @FindBy(xpath="xpath=(//button[@type='submit'])[2]")
    WebElement loginWithFacebookBtn;
    
    @FindBy(xpath="//a[contains(text(),'Forget Password?')]")
    WebElement forgetPasswordBtn;
    
    @FindBy(xpath="//img[@src='assets/images/gillet-logo.png']")
    WebElement logoHandleGillet;
    
    @FindBy(xpath="//button[contains(text(),'Go to Dashboard') and @class='btn btn-primary margin_left10px text_white ng-star-inserted']")
    WebElement goToDashboard1;
    
    @FindBy(xpath="//button[contains(text(),'Go To Dashboard') and @class='btn btn-primary text-uppercase text-b-500']")
    WebElement goToDashboard2;
    
    

    //=============================================================================================================
    //++++++++++++++++++++++++++++++++++      Initializing the Page object       ++++++++++++++++++++++++++++++++++
    //=============================================================================================================
    
    public LoginPage()
    {
        PageFactory.initElements(driver,this);
    }
    
    //Actions
    public String validateloginPageTitle()
    {
        return driver.getTitle();
    }
    
    public boolean validateImage()
    {
        return logoHandleGillet.isDisplayed();
        
    }
    

    //=============================================================================================================
    //+++++++++++++++++++++++++++++++++++++++++           LOGIN            ++++++++++++++++++++++++++++++++++++++++
    //=============================================================================================================
    public void login(String un,String pwd,String sheetName) throws Throwable
    {
        LoginIcon.click();
        
        TestUtil.highLighterMethod(driver, username);
        username.sendKeys(un);
        
        TestUtil.highLighterMethod(driver, password);
        password.sendKeys(pwd);
        
        TestUtil.highLighterMethod(driver, loginBtn);
        loginBtn.click();
        
        Thread.sleep(5000);
        
        String currentURL  = driver.getCurrentUrl();

        System.out.println("Current url is "+currentURL );

        sideMenuAlltabs = new SideMenuAllTabs();
      
        if(sheetName.contains("SuperAdminLogin") && currentURL.equals("http://185.6.181.138/dashboard/dashboardhome"))
        {
            
            //System.out.println("URL IS: "+driver.getCurrentUrl());
        	sideMenuAlltabs.clickOnSideHomeTab();
            Thread.sleep(3000);
            sideMenuAlltabs.clickOnSideGroupsTab();
            Thread.sleep(3000);
            sideMenuAlltabs.clickOnSideEventsTab();
            Thread.sleep(3000);
            sideMenuAlltabs.clickOnSideManageMemberTab();
            Thread.sleep(3000);
            sideMenuAlltabs.clickOnSideManageArticleTab();
            Thread.sleep(3000);
            sideMenuAlltabs.clickOnSideSuppliersTab();
            Thread.sleep(3000);
            sideMenuAlltabs.clickOnSideManageRoomBookingTab();
            Thread.sleep(3000);
            sideMenuAlltabs.clickOnSideNewApplicationTab();
            Thread.sleep(3000);
            sideMenuAlltabs.clickOnSideRolesTab();
            Thread.sleep(3000);
            sideMenuAlltabs.clickOnSideStatisticsTab();
            Thread.sleep(3000);
            
        }
        else if(sheetName.contains("ClubAdminLogin") && currentURL.equals("http://185.6.181.138/hg/home") )
        {
            System.out.println("current url of club is "+currentURL);
            System.out.println("hi i am inside else if of club admin");
            Thread.sleep(3000);
            goToDashboard1.click();
            
            System.out.println("gotodashboard1 first button clicked");
            
            goToDashboard2.click();
            System.out.println("hi dashboard 2 button clicked");
            Thread.sleep(3000);
            
            sideMenuAlltabs.clickOnSideEventsTab();
            Thread.sleep(3000);
            
            sideMenuAlltabs.clickOnSideSuppliersTab();
            Thread.sleep(3000);
         

        }
        else if(sheetName.contains("MemberLogin")&& currentURL.equals("http://185.6.181.138/hg/home"))
        {
            //currentURL.equals("http://185.6.181.138/hg/home")
            System.out.println("hi im inside member else of member page ");
                goToDashboard1.click();
                Thread.sleep(6000);
        
                sideMenuAlltabs.clickOnSideGroupsTab();
                Thread.sleep(3000);
                
                sideMenuAlltabs.clickOnSideEventsTab();
                Thread.sleep(3000);
                
               
                
        }      
    }
}


