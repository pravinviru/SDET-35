package com.crm.comcast.pomrepositoryutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class organisationPage {
	
	 public organisationPage(WebDriver driver)
	    {
	    	PageFactory.initElements(driver, this);
	    }
	 
	   @FindBy(xpath="//img[@title='Create Organization...']")
	   private WebElement plusbutton;

 
	   public WebElement getPlusbutton() {
		return plusbutton;
	}


	public void plusButton()
	   {
		   plusbutton.click();
	   }
	   
		  

}
