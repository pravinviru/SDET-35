package com.crm.comcast.pomrepositoryutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class creatingCampaignWithProductPage {
	
	public creatingCampaignWithProductPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	     @FindBy(xpath="//input[@name='campaignname']")
	     private WebElement campaignnametxt;
	     
         @FindBy(xpath="//img[@title='Select']")
         private WebElement plusbt;
         
         @FindBy(xpath="//input[@title='Save [Alt+S]']")
         private WebElement savebt;
         
         @FindBy(xpath="//input[@id='search_txt']")
     	private WebElement searchbtn;
     	
     	  @FindBy(xpath="//input[@name='search']")
     	  private WebElement searchnowbt;


     	  @FindBy(xpath="//a[@id='1']")
     	  private WebElement clickproduct;
     	  
     	  
     	  
     	  
		public WebElement getClickproduct() {
			return clickproduct;
		}

		public WebElement getSearchbtn() {
			return searchbtn;
		}

		public WebElement getSearchnowbt() {
			return searchnowbt;
		}

		public WebElement getCampaignnametxt() {
			return campaignnametxt;
		}

		public WebElement getPlusbt() {
			return plusbt;
		}

		public WebElement getSavebt() {
			return savebt;
		}
         
		public void campaignName(String name)
		{
			campaignnametxt.sendKeys(name);
		}
		
		public void plusButton()
		{
			plusbt.click();
		}
		
		public void saveButton()
		{
			savebt.click();
		}
		
		  public void search(String name)
		  {
			  searchbtn.sendKeys(name);
		  }
		public void searchNow()
		{
			searchnowbt.click();
		}
		
		public String getProducttxt()
		{
			String txt = clickproduct.getText();
			return txt;
		}
		
		public void clickproduct()
		{
			clickproduct.click();
		}

         
}
