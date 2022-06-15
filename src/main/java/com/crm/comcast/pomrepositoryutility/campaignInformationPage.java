package com.crm.comcast.pomrepositoryutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class campaignInformationPage {
	
	 public  campaignInformationPage(WebDriver driver)
	    {
	    	PageFactory.initElements(driver, this);
	    }
	 
         @FindBy(xpath="//input[@title='Delete [Alt+D]']")
         private WebElement deletebtn;
         
         @FindBy(xpath="//a[text()='More Information']")
         private WebElement moreinformationtxt;
         
         @FindBy(xpath="//span[@class='dvHeaderText']")
         private WebElement campaigninformtxt;
         

		public WebElement getCampaigninformtxt() {
			return campaigninformtxt;
		}

		public WebElement getDeletebtn() {
			return deletebtn;
		}

		public WebElement getMoreinformationtxt() {
			return moreinformationtxt;
		}
         
         public void deletebutton()
         {
        	 deletebtn.click();
         }
         
         public void moreInformation()
         {
        	 moreinformationtxt.click();
         }
         
         public String campaignInformTxt()
         {
        	String txt = campaigninformtxt.getText();
        	 return txt;
         }
         
         
}
