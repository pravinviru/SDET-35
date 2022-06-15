package com.crm.comcast.campaignTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.crm.comcast.pomrepositoryutility.LoginPage;
import com.crm.comcast.pomrepositoryutility.campaignInformationPage;
import com.crm.comcast.pomrepositoryutility.campaignPage;
import com.crm.comcast.pomrepositoryutility.creatingCampaignWithProductPage;
import com.crm.comcast.pomrepositoryutility.homePage;

import generic_utility.Baseclass;
import generic_utility.Excel_Utility;
import generic_utility.File_Utility;
import generic_utility.Java_Utility;
import generic_utility.Webdriver_Utility;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateCampaignWithProductTest extends Baseclass {

	@Test(groups="smokeTest")
	public void createcampaignwithproduct() throws Throwable
	{
		// Webdriver_Utility vebdriver = new Webdriver_Utility();
		// Excel_Utility exceldriver = new  Excel_Utility();
		// Java_Utility javadriver = new Java_Utility();
		// File_Utility filedriver = new  File_Utility();
         
		
		// home page 
		 	homePage hp = new homePage(driver);
		 // WebDriverWait wait = new WebDriverWait(driver,5);
		 // wait.until(ExpectedConditions.elementToBeClickable(hp.getMoretxt()));
		 	hp.more(driver);
		 	hp.campaign();
	         
	    // campaignpage
		 	campaignPage camp = new campaignPage(driver);
		 	camp.pressbutton();
		 
		 //	creatingcampaign
		 	creatingCampaignWithProductPage campaignname = new  creatingCampaignWithProductPage(driver);
	        Excel_Utility excel = new Excel_Utility();
	        String str = excel.getDataFromExcel("sheet1",1 , 0);
		 
	        campaignname.campaignName(str);
	         

       //driver.findElement(By.xpath("(//input[@title='Save [Alt+S]'])[1]")).click();
      // driver.findElement(By.xpath("(//img[@align='absmiddle'])[3]")).click();
	      creatingCampaignWithProductPage campaignwithproduct = new  creatingCampaignWithProductPage(driver);   
                campaignwithproduct.plusButton();
                
                
                
                     String title1 = driver.getTitle();
                     System.out.println(title1);
                 vebdriver.switchToWindow(driver, "Products&action");
                 String title = driver.getTitle();
                    System.out.println(title);
                 
                  
               String str1 = exceldriver.getDataFromExcel2("sheet1", 0, 1);
                     System.out.println(str1);
          // driver.findElement(By.xpath("//input[@id='search_txt' and @name='search_text']")).sendKeys(str);
           Thread.sleep(5000);
               campaignwithproduct.search(str1);
               
               Thread.sleep(2000);  
               // driver.findElement(By.xpath("//input[@name='search']")).click();
               campaignwithproduct.searchNow(); 
               
               Thread.sleep(4000);
                              String text = campaignwithproduct.getProducttxt();
                                 System.out.println(text);
                    // String text = idd.getText();
                
                     if(text.equals(str1))
                     {
                    	 System.out.println("it is product");
                     }
                     else {
                    	 System.out.println("it is not product");
                     }
                         
                     campaignwithproduct.clickproduct();                      
                          
                       
                     vebdriver.switchToWindow(driver, title1);
                             
                     vebdriver.waitforelementInDOM(driver);  
                             
                     // driver.findElement(By.xpath("(//input[@title='Save [Alt+S]'])[1]")).click();
                     campaignwithproduct.saveButton();
                   // String str1 = driver.findElement(By.xpath("//span[@class='dvHeaderText']")).getText();
                       
                    campaignInformationPage campaigninform = new campaignInformationPage(driver);
                     String str2 = campaigninform.campaignInformTxt();                       
                     
                     
                    vebdriver.waitforelementInDOM(driver);
                    if(str2.equals(str))
                    {
                    	System.out.println("it is compaign name");
                    }
                    
                    else {
                    	System.out.println("it is not correct");
                    }
                //    WebElement admin = driver.findElement(By.xpath("(//img[@border='0'])[3]"));
                       
               //       vebdriver.mouseOverOnElement(driver, admin);
           // driver.close();
                    
                  //  home.admin();
                  //  home.signout();
                   // driver.close();
	}

}
