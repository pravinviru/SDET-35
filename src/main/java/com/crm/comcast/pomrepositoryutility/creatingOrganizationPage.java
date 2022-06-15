package com.crm.comcast.pomrepositoryutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class creatingOrganizationPage {
	
	 public creatingOrganizationPage(WebDriver driver)
	    {
	    	PageFactory.initElements(driver, this);
	    }
	 
	 @FindBy(xpath="//input[@name='accountname']")
	 private WebElement organisationname;
	 
	 @FindBy(xpath="//input[@title='Save [Alt+S]']")
	 private WebElement savebt;

	public WebElement getOrganisationname() {
		return organisationname;
	}

	public WebElement getSavebt() {
		return savebt;
	}
		  
	   public void organisation(String name)
	   {
		   organisationname.sendKeys(name);
	   }
	   public void save()
	   {
		   savebt.click(); 
	   }
   
}
