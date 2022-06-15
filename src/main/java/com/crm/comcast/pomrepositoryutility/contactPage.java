package com.crm.comcast.pomrepositoryutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class contactPage {
	
	   public contactPage(WebDriver driver) {
		   
		   PageFactory.initElements(driver,this);
	   }

	   @FindBy(xpath="//img[@title='Create Contact...']")
	   private WebElement plusbuttontxt;

	public WebElement getPlusbutton() {
		return plusbuttontxt;
	}
	   
	   public void plusbutton()
	   {
		   plusbuttontxt.click();
		   
	   }
}
