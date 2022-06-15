package com.crm.comcast.pomrepositoryutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class creatingPurchaseOrderPage {
	
	 public creatingPurchaseOrderPage(WebDriver driver)
	    {
	    	PageFactory.initElements(driver, this);
	    }
	
	@FindBy(xpath="//input[@name='subject']")
	private WebElement subjecttxt;
	
    @FindBy(xpath="//textarea[@name='bill_street']")
    private WebElement billingaddresstxt;
    
     @FindBy(xpath="//textarea[@name='ship_street']")
     private WebElement shippingaddress;
     
     @FindBy(xpath="//input[@id='qty1']")
     private WebElement Qtytxt;
     
     @FindBy(xpath="//img[@language='javascript']")
     private WebElement vendorplusbtn;
     
     @FindBy(xpath="//img[@id='searchIcon1']")
     private WebElement itembtn;
     
     @FindBy(xpath="//input[@title='Save [Alt+S]']")
     private WebElement savebtn;
     
     @FindBy(xpath="//input[@id='search_txt']")
     private WebElement searchtxt;
     
     @FindBy(xpath="//input[@name='search']")
     private WebElement vendorsearchnowbtn;
     
     @FindBy(xpath="//a[@id='1']")
     private WebElement clickvendorname;
     
     @FindBy(xpath="//input[@id='search_txt']")
     private WebElement productsearchtxt;
     
     @FindBy(xpath="//input[@name='search']")
     private WebElement  productsearchnowbtn;
     
     @FindBy(xpath="//a[@id='popup_product_135']")
     private WebElement clickproductname;

	public WebElement getSubjecttxt() {
		return subjecttxt;
	}

	public WebElement getBillingaddresstxt() {
		return billingaddresstxt;
	}

	public WebElement getShippingaddress() {
		return shippingaddress;
	}

	public WebElement getQtytxt() {
		return Qtytxt;
	}

	public WebElement getVendorplusbtn() {
		return vendorplusbtn;
	}

	public WebElement getItembtn() {
		return itembtn;
	}

	public WebElement getSavebtn() {
		return savebtn;
	}

	public WebElement getSearchtxt() {
		return searchtxt;
	}

	public WebElement getVendorsearchnowbtn() {
		return vendorsearchnowbtn;
	}

	public WebElement getClickvendorname() {
		return clickvendorname;
	}

	

	public WebElement getProductsearchtxt() {
		return productsearchtxt;
	}

	public WebElement getProductsearchnowbtn() {
		return productsearchnowbtn;
	}

	public WebElement getClickproductname() {
		return clickproductname;
	}
     
     public void subjectvalue(String name)
     {
    	 subjecttxt.sendKeys(name);
     }
     
     public void billingtext(String name)
     {
    	 billingaddresstxt.sendKeys(name);
     }
     
     public void shippingtxt(String name)
     {
    	 shippingaddress.sendKeys(name);
     }
     
     public void Qty(String value)
     {
    	 Qtytxt.sendKeys(value);
     }
     
     public void productitembtn()
     {
    	 itembtn.click();
     }
     public void vendorplusbtn()
     {
    	 vendorplusbtn.click();
     }
      public void vendorsearchtext(String name) {
    	  searchtxt.sendKeys(name);
      }
      
      public void  vendorSearchNow()
      {
    	  vendorsearchnowbtn.click();
      }
     public void  vendorNameclick()
     {
    	 clickvendorname.click();
     }
     public void productsearchtxt(String name)
     {
    	 productsearchtxt.sendKeys(name);
     }
     
     public void  productSearchNow()
     {
    	 productsearchnowbtn.click();
     }
     public void productNameClick()
     {
    	 clickproductname.click();
     }
}
