package com.crm.comcast.organizationTest;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.crm.comcast.pomrepositoryutility.LoginPage;
import com.crm.comcast.pomrepositoryutility.creatingOrganizationPage;
import com.crm.comcast.pomrepositoryutility.homePage;
import com.crm.comcast.pomrepositoryutility.organisationPage;
import com.crm.comcast.pomrepositoryutility.organsiationInformPage;

import generic_utility.Baseclass;
import generic_utility.Excel_Utility;
import generic_utility.File_Utility;
import generic_utility.Java_Utility;
import generic_utility.Webdriver_Utility;
import io.github.bonigarcia.wdm.WebDriverManager;

public class createOrgTest extends Baseclass {

	
      @Test(groups="smokeTest")	
	public void createorganisation() throws Throwable {
		       
		      
		         
		         homePage home = new homePage(driver);
		         LoginPage log = new  LoginPage(driver);
		           organisationPage org = new organisationPage(driver);
		          creatingOrganizationPage createorg = new  creatingOrganizationPage(driver);
		             organsiationInformPage orginf = new organsiationInformPage(driver);
		          
		           
		         
		         
		         vebdriver.waitforelementInDOM(driver);
		          
		         home.organisation();
		         org.plusButton();
		         int ran = javadriver.getRanDomNum();
		         
		            exceldriver.writeDataInExcel("sheet1", 1, 0,"yantra");
		           String str = exceldriver.getDataFromExcel("sheet1", 1, 0)+ran;
		           
		             
		                 createorg.organisation(str); 
		                        
                         
		               vebdriver.waitforelementInDOM(driver);
		            
		              createorg.save();
		            vebdriver.waitforelementInDOM(driver);
		           String text =   orginf.organisationinform();
		            
		            if(text.contains(str))
		            {
		            	System.out.println("it is correct organisation");
		            }
		            else {
		            	System.out.println("it is not correct");
		            }
		          
	}

}
