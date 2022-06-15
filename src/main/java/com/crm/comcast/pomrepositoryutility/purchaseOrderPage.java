package com.crm.comcast.pomrepositoryutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class purchaseOrderPage {
	 public purchaseOrderPage(WebDriver driver)
	    {
	    	PageFactory.initElements(driver, this);
	    }
	 
	       @FindBy(xpath="//img[@title='Create Purchase Order...']")
	       private WebElement plusbtn;

		public WebElement getPlusbtn() {
			return plusbtn;
		}
	       
	       public void plusbutton()
	       {
	    	   plusbtn.click();
	       }
}
