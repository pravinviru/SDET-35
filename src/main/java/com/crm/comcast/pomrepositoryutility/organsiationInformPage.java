package com.crm.comcast.pomrepositoryutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class organsiationInformPage {
	
	 public organsiationInformPage(WebDriver driver)
	    {
	    	PageFactory.initElements(driver, this);
	    }
	 
	    @FindBy(xpath="//span[@class='dvHeaderText']")
	    private WebElement  organisationinform;
	    
	    @FindBy(xpath="//input[@class='crmbutton small delete']")
	    private WebElement deletebtn;

		public WebElement getOrganisationinform() {
			return organisationinform;
		}

		public WebElement getDeletebtn() {
			return deletebtn;
		}
	    
	    public String organisationinform()
	    {
	    	String txt = organisationinform.getText();
	    	return txt;
	    }
	    
	    public void delete()
	    {
	    	deletebtn.click();
	    }

}
