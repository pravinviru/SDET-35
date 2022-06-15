package com.crm.comcast.pomrepositoryutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class creatingContactPage {
	  WebDriver driver;  
	
	 public creatingContactPage(WebDriver driver)
	   {
		   PageFactory.initElements(driver, this);
	   }
	
	   @FindBy(xpath="//input[@name='lastname']")
	   private WebElement lastnametxt;
	   
	   @FindBy(xpath="(//input[@title='Save [Alt+S]'])[1]")
	   private WebElement savebutton;
	  
	   
	   public WebDriver getDriver() {
		return driver;
	}

	public WebElement getSavebutton() {
		return savebutton;
	}

	public WebElement getLastnametxt() {
		return lastnametxt;
	}

	public void lastname( String lastname)
	   {
		lastnametxt.sendKeys(lastname);
	   }

	   public void save()
	   {
		   savebutton.click();
	   }
}
