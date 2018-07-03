package com.handelsgillet.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.apache.commons.io.FileUtils;



import com.handelsgillet.testBase.TestBase;

public class TestUtil extends TestBase
{
	public static long PAGE_LOAD_TIMEOUT=20;
	public static long IMPLICIT_WAIT=20;
	
	//public static String TESTDATA_SHEET_PATH = "D:\\Demo-master\\src\\main\\java\\com\\handelsgillet\\testdata\\HGAdminData.xlsx";
	//String xmlFile  = System.getProperty("user.dir")+"/src/main/resources/HGTestSuite.xml";
	
	public static String TESTDATA_SHEET_PATH = System.getProperty("user.dir")+"/src/main/java/com/handelsgillet/testdata/HGAdminData.xlsx";
	
	static Workbook book;
	static Sheet sheet;
	    
    public static Object[][] getTestData(String sheetName)
    {
        FileInputStream file = null;
        try
        {
            file = new FileInputStream(TESTDATA_SHEET_PATH);
            //System.out.println("file name"+file);
        }
        catch(FileNotFoundException e)
        {
            e.printStackTrace();
        }
        try
        {
            book=WorkbookFactory.create(file);
        }
        catch(InvalidFormatException e)
        {
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
        sheet = book.getSheet(sheetName);
        Object[][] data = new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
        for(int i = 0; i< sheet.getLastRowNum(); i++)
        {
            for(int k=0; k<sheet.getRow(0).getLastCellNum(); k++)
            {
            try {    
            	if(sheet.getRow(i+1).getCell(k)!= null){
                data[i][k] = sheet.getRow(i+1).getCell(k).toString();
                System.out.println("data is"+data[i][k]);
            }
            }
            catch(Exception e) {}
            }
        }
    
    return data;
    }
    
    
    //=============================================================================================================
  	//++++++++++++++++++++++++++++++++++      Screenshot program       ++++++++++++++++++++++++++++++++++
  	//=============================================================================================================
  	 
    
    public static void takeScreenshotAtEndOfTest() throws IOException {
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		String currentDir = System.getProperty("user.dir");
		
		FileUtils.copyFile(scrFile, new File(currentDir + "/screenshots/" + System.currentTimeMillis() + ".png"));
		
		}

    //=============================================================================================================
  	//++++++++++++++++++++++++++++++     Method to highlight text while entering.    ++++++++++++++++++++++++++++++
  	//=============================================================================================================
  	 
    
    //Creating a custom function
    
    public static void highLighterMethod(WebDriver driver, WebElement element)
    {
    		JavascriptExecutor js = (JavascriptExecutor) driver;
    		js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", element);
    }
	

	
}











