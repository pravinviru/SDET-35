package com.crm.comcast.pomrepositoryutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class contactInformationpage {
	
	public contactInformationpage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
      @FindBy(xpath="//input[@name='Edit']")
      private WebElement editbutton;
      
      @FindBy(xpath="//input[@name='Delete']")
      private WebElement deletebutton;
      
      @FindBy(xpath="//span[@class='dvHeaderText']")
      private WebElement contactinformationtxt;

      
      
	public WebElement getContactinformationtxt() {
		return contactinformationtxt;
	}

	public WebElement getEditbutton() {
		return editbutton;
	}

	public WebElement getDeletebutton() {
		return deletebutton;
	}
      
   public void edit() {
	   editbutton.click();
   }
   
   public void delete()
   {
	   deletebutton.click();
   }
   
   public String contactInformationtxt()
   {
	       String txt = contactinformationtxt.getText();
	       return txt;
   }
}
