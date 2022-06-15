package com.crm.comcast.pomrepositoryutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generic_utility.Webdriver_Utility;

public class homePage extends Webdriver_Utility {
	WebDriver driver;

	public homePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getOrganization() {
		return organization;
	}

	public WebElement getContacttxt() {
		return contacttxt;
	}

	public WebElement getProducttxt() {
		return producttxt;
	}

	public WebElement getMoretxt() {
		return moretxt;
	}

	public WebElement getCampaigntxt() {
		return campaigntxt;
	}

	public WebElement getPurchaseordertxt() {
		return purchaseordertxt;
	}

	public WebElement getVendorstxt() {
		return vendorstxt;
	}

	public WebElement getAdmintxt() {
		return admintxt;
	}

	public WebElement getSignout() {
		return signout;
	}

	@FindBy(xpath = "//a[text()='Organizations']")
	private WebElement organization;

	@FindBy(xpath = "(//a[text()='Contacts'])[1]")
	private WebElement contacttxt;

	@FindBy(xpath = "//a[text()='Products']")
	private WebElement producttxt;

	@FindBy(linkText = "More")
	private WebElement moretxt;

	@FindBy(xpath = "//a[@name='Campaigns']")
	private WebElement campaigntxt;

	@FindBy(xpath = "//a[@name='Purchase Order']")
	private WebElement purchaseordertxt;

	@FindBy(xpath = "//a[@name='Vendors']")
	private WebElement vendorstxt;

	@FindBy(xpath = "//img[@src='themes/softed/images/user.PNG']")
	private WebElement admintxt;

	@FindBy(xpath = "//a[text()='Sign Out']")
	private WebElement signout;

	public void campaign() {

		campaigntxt.click();
	}

	public void purchaseorder() {

		purchaseordertxt.click();
	}

	public void vendor() {

		vendorstxt.click();
	}

	public void signout() {

		signout.click();
	}

	public void organisation() {
		organization.click();
	}

	public void contacts() {
		contacttxt.click();
	}

	public void products() {
		producttxt.clear();
	}

	public void more(WebDriver driver)

	{

		mouseOverOnElement(driver, moretxt);

	}

	public void admin(WebDriver driver) {
		mouseOverOnElement(driver,admintxt);
		
	}
}
