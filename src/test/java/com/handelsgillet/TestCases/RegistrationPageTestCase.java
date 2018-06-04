 package com.handelsgillet.TestCases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.handelsgillet.pages.SideMenuEventsPage;
import com.handelsgillet.pages.SideMenuGroupsPage;
import com.handelsgillet.pages.RegistrationPage;
import com.handelsgillet.testBase.TestBase;
import com.handelsgillet.util.TestUtil;

public class RegistrationPageTestCase extends TestBase
{
    //private static final String String = null;
    RegistrationPage registrationPage;
    //HomePage homePage;
    //SideMenuGroupsPage sideMenuGroupsPage;
    TestUtil testUtil;
    String sheetName="registrationData" ;
   
    public RegistrationPageTestCase()
    {
        super();
    }
   
    @BeforeMethod
    public void setUp()
    {
        initialization();
        //homePage=new HomePage();
        registrationPage=new RegistrationPage();
    }
   /*
    //Verify Title of the Register Page
        @Test(priority=1)
        public void registerPageTitleTest()
        {
            String title = registrationPage.validateRegistrationPageTitle();
           
            Assert.assertEquals("HANDELSGILLET",title);
           
        }
       */
        @DataProvider
        public Object[][] getHGAdminTestData()
        {
            Object data[][] = TestUtil.getTestData(sheetName);
            return data;
           
        }
        
        @Test(priority=2, dataProvider="getHGAdminTestData")
        public void registerTest(String ftName, String mdName, String lsName,String dob,String bPlace,String occ,String phomeTel,String pMob, String pEmail,String pAddress,
                String pZipCode, String pHomePlace,String wkEmpAt, String wkPos, String wkTitle, String wkTel,
                String wkMob,String wkAddress, String wkZipCode,String wkPlace,String motherTongue, String homeLang,String oCitizenship, String attendFirst, String attendSecond, String eNotes) throws InterruptedException
        
        {  
            registrationPage.newRegistration(ftName, mdName, lsName, dob,bPlace, occ, phomeTel, pMob, pEmail,pAddress,pZipCode,pHomePlace, wkEmpAt, wkPos, wkTitle, wkTel, wkMob,wkAddress,wkZipCode,wkPlace,motherTongue,homeLang,oCitizenship,attendFirst,attendSecond);
            //registrationPage.validateRegistrationPageTitle();
            }
       
       
         
        @AfterMethod
        public void tearDown()
        {
            driver.quit();
        }

}




















