package com.crm.comcast.cotacttest;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.crm.comcast.pomrepositoryutility.LoginPage;
import com.crm.comcast.pomrepositoryutility.contactInformationpage;
import com.crm.comcast.pomrepositoryutility.contactPage;
import com.crm.comcast.pomrepositoryutility.creatingContactPage;
import com.crm.comcast.pomrepositoryutility.homePage;

import generic_utility.Baseclass;
import generic_utility.Excel_Utility;
import generic_utility.File_Utility;
import generic_utility.Java_Utility;
import generic_utility.Webdriver_Utility;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContactTest extends Baseclass {
  
	
		@Test(groups="regressionTest")
		public void createcontactTest() throws Throwable, IOException
		{

		
			
		String str = exceldriver.getDataFromExcel("sheet1", 0, 1)+javadriver.getRanDomNum();
		

		Thread.sleep(3000);
		// driver.findElement(By.xpath("(//a[text()='Contacts'])[1]")).click();
		//  driver.findElement(By.xpath("//img[@title='Create Contact...']")).click();
		//  driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys(str);
		homePage home = new homePage(driver);
		LoginPage log = new  LoginPage(driver);
		contactPage cont = new  contactPage(driver);
		creatingContactPage createcont = new  creatingContactPage(driver);
		contactInformationpage contactinform = new  contactInformationpage(driver);

		
		
		
		
		home.contacts();
		cont.plusbutton();
		createcont.lastname(str);


		// driver.findElement(By.xpath("(//input[@title='Save [Alt+S]'])[1]")).click();
		// String lastname = driver.findElement(By.xpath("//span[@class='dvHeaderText']")).getText();

		createcont.save();

		String lastname = contactinform.contactInformationtxt();


		if(lastname.contains(str))
		{
			System.out.println("it is correct");
		}
		else {
			System.out.println("it is not correct");
		}
		// WebElement admin = driver.findElement(By.xpath("(//img[@border='0'])[3]"));
		//  vebdriver.mouseOverOnElement(driver, admin);
		//  driver.findElement(By.xpath("//a[text()='Sign Out']")).click();

		
	}}
