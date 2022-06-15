package com.crm.comcast.pomrepositoryutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class campaignPage {
	     
	public campaignPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	    @FindBy(xpath="//img[@title='Create Campaign...']")
	    private WebElement plusbuttonpress;

		public WebElement getPlusbuttonpress() {
			return plusbuttonpress;
		}
	    
	    public void pressbutton()
	    {
	    	plusbuttonpress.click();
	    }
	

}
