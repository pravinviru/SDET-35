package practices;

import java.io.IOException;

import org.testng.annotations.Test;

import com.crm.comcast.pomrepositoryutility.LoginPage;
import com.crm.comcast.pomrepositoryutility.campaignInformationPage;
import com.crm.comcast.pomrepositoryutility.campaignPage;
import com.crm.comcast.pomrepositoryutility.contactInformationpage;
import com.crm.comcast.pomrepositoryutility.contactPage;
import com.crm.comcast.pomrepositoryutility.creatingCampaignWithProductPage;
import com.crm.comcast.pomrepositoryutility.creatingContactPage;
import com.crm.comcast.pomrepositoryutility.homePage;

import generic_utility.Baseclass;
import generic_utility.Excel_Utility;

public class RegionalRegressionTest extends Baseclass {
	
	
	@Test(groups="smokeTest")
	public void createcampaign() throws Throwable {
		
		// Webdriver_Utility vebdriver = new Webdriver_Utility();
		// Excel_Utility exceldriver = new  Excel_Utility();
		// Java_Utility javadriver = new Java_Utility();
		// File_Utility filedriver = new  File_Utility();
         
		
		// home page 
		 	homePage hp = new homePage(driver);
		 // WebDriverWait wait = new WebDriverWait(driver,5);
		 // wait.until(ExpectedConditions.elementToBeClickable(hp.getMoretxt()));
		 	hp.more(driver);
		 	hp.campaign();
	         
	    // campaignpage
		 	campaignPage camp = new campaignPage(driver);
		 	camp.pressbutton();
		 
		 //	creatingcampaign
		 	creatingCampaignWithProductPage campaignname = new  creatingCampaignWithProductPage(driver);
	        Excel_Utility excel = new Excel_Utility();
	        String str = excel.getDataFromExcel("sheet1",1 , 1);
		 
	        campaignname.campaignName(str);
	  
	        // vebdriver.waitforelementInDOM(driver);
	        // WebElement more = driver.findElement(By.xpath("(//a[@href='javascript:;'])"));
	        // vebdriver.mouseOverOnElement(driver, more);
	        // driver.findElement(By.xpath("//a[@name='Campaigns']")).click();
	        // hp.more();
	        // hp.campaign();
	             
	        // driver.findElement(By.xpath("//img[@title='Create Campaign...']")).click();
	        // camp.pressbutton();
	             
	             
	        // exceldriver.writeDataInExcel("sheet1", 1, 2, "apple");
	        // String apple = exceldriver.getDataFromExcel2("sheet1",1,2);
      
	        // driver.findElement(By.xpath("//input[@name='campaignname']")).sendKeys(apple);
              
            // driver.findElement(By.xpath("(//input[@title='Save [Alt+S]'])[1]")).click();
            
	        // campaignwithproduct.campaignName(apple);
            	campaignname.saveButton();
                 
                 
                 
            	vebdriver.waitforelementInDOM(driver);
             
            	campaignInformationPage campaigninform = new   campaignInformationPage(driver);
            	String text = campaigninform.campaignInformTxt();
            	System.out.println(text);
            	if(text.contains(str)){
            		System.out.println("it is correct");
                }
                 else {
                	 System.out.println("it is not correct");
                }
             // WebElement admin = driver.findElement(By.xpath("(//img[@border='0'])[3]"));
               
            // vebdriver.mouseOverOnElement(driver, admin);
                       
            // driver.findElement(By.xpath("(//a[@class='drop_down_usersettings'])[2]")).click();
                      
            // home.admin();
            // hp.signout();
            //driver.close();
	}

	@Test(groups="regressionTest")
	public void createcontactTest() throws Throwable, IOException
	{

	
		
	String str = exceldriver.getDataFromExcel("sheet1", 0, 1)+javadriver.getRanDomNum();
	

	Thread.sleep(3000);
	// driver.findElement(By.xpath("(//a[text()='Contacts'])[1]")).click();
	//  driver.findElement(By.xpath("//img[@title='Create Contact...']")).click();
	//  driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys(str);
	homePage home = new homePage(driver);
	LoginPage log = new  LoginPage(driver);
	contactPage cont = new  contactPage(driver);
	creatingContactPage createcont = new  creatingContactPage(driver);
	contactInformationpage contactinform = new  contactInformationpage(driver);

	
	
	
	
	home.contacts();
	cont.plusbutton();
	createcont.lastname(str);


	// driver.findElement(By.xpath("(//input[@title='Save [Alt+S]'])[1]")).click();
	// String lastname = driver.findElement(By.xpath("//span[@class='dvHeaderText']")).getText();

	createcont.save();

	String lastname = contactinform.contactInformationtxt();


	if(lastname.contains(str))
	{
		System.out.println("it is correct");
	}
	else {
		System.out.println("it is not correct");
	}
	// WebElement admin = driver.findElement(By.xpath("(//img[@border='0'])[3]"));
	//  vebdriver.mouseOverOnElement(driver, admin);
	//  driver.findElement(By.xpath("//a[text()='Sign Out']")).click();

	
}

}
