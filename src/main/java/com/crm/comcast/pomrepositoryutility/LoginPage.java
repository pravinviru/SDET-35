package com.crm.comcast.pomrepositoryutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	

    public LoginPage(WebDriver driver)
    {
    	PageFactory.initElements(driver, this);
    }
	       @FindBy(name="user_name")
	       private WebElement useranmetxt;
	       
	       @FindBy(xpath="//input[@type='password']")
	       private WebElement passwordtxt;
	       
	       @FindBy(xpath="//input[@type='submit']")
	       private WebElement submitbutton;

		public WebElement getUseranmetxt() {
			return useranmetxt;
		}

		public WebElement getPasswordtxt() {
			return passwordtxt;
		}

		public WebElement getSubmitbutton() {
			return submitbutton;
		}
		public void loginToApp(String username, String password)
		{
			useranmetxt.sendKeys(username);
			passwordtxt.sendKeys(password);
			submitbutton.click();
       
}
}
	        
		
