package practices;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import generic_utility.Excel_Utility;
import generic_utility.File_Utility;
import generic_utility.Java_Utility;
import generic_utility.Webdriver_Utility;
import io.github.bonigarcia.wdm.WebDriverManager;

public class PurchaseOrderInformation {

	public static void main(String[] args) throws Throwable {
		 Webdriver_Utility vebdriver = new Webdriver_Utility();
         Excel_Utility exceldriver = new  Excel_Utility();
         Java_Utility javadriver = new Java_Utility();
         File_Utility filedriver = new  File_Utility();
         
     String browser = filedriver.getProperty("browser");
        String url = filedriver.getProperty("url");
        String username = filedriver.getProperty("username");
        String password = filedriver.getProperty("password");
        
        
        WebDriver driver;
         if(browser.equalsIgnoreCase("firefox"))
         {
       	  WebDriverManager.firefoxdriver().setup();
       	     driver=new FirefoxDriver();
         }
         else if(browser.equalsIgnoreCase("chromedriver")){
       	  
       	 WebDriverManager.chromiumdriver() .setup();
       	 driver = new ChromeDriver();
         }
         else {
       	  driver= new ChromeDriver();
       	  
         }
           
         driver.get(url);
         vebdriver.maximaize(driver);
         driver.findElement(By.xpath("//input[@type='text']")).sendKeys(username );
         driver.findElement(By.xpath("//input[@type='password']")).sendKeys(password);
         driver.findElement(By.xpath("//input[@type='submit']")).click();
  
         vebdriver.waitforelementInDOM(driver);
          
             WebElement more = driver.findElement(By.xpath("(//a[@href='javascript:;'])[1]"));
             
                 vebdriver.mouseOverOnElement(driver, more);
                 
                   driver.findElement(By.xpath("//a[@name='Purchase Order']")).click();
                   driver.findElement(By.xpath("//img[@title='Create Purchase Order...']")).click();
                   
                     String str = exceldriver.getDataFromExcel("sheet1", 2, 0);
                     System.out.println(str);
                   driver.findElement(By.xpath("//input[@name='subject']")).sendKeys(str);
                   vebdriver.waitforelementInDOM(driver);
                          driver.findElement(By.xpath("(//img[@title='Select'])[1]")).click();
                          
                            String parent = driver.getTitle();
                            vebdriver.waitforelementInDOM(driver);
                             vebdriver.switchToWindow(driver, "Vendors&action");
                             
                              String vendorname = exceldriver.getDataFromExcel("sheet1", 1, 3);
                             
                      driver.findElement(By.xpath("//input[@id='search_txt']")).sendKeys(vendorname);
                           
                      driver.findElement(By.xpath("//input[@name='search']")).click();
                      driver.findElement(By.xpath("//a[text()='pravin']")).click();
                      vebdriver.waitforelementInDOM(driver);
                          vebdriver.switchToWindow(driver, parent);
                      
                       String address = exceldriver.getDataFromExcel("sheet1", 3, 0);
                       
                       driver.findElement(By.xpath("//textarea[@name='bill_street']")).sendKeys(address);
                       
                       String address1 = exceldriver.getDataFromExcel("sheet1", 4, 0);
                       driver.findElement(By.xpath("//textarea[@name='ship_street']")).sendKeys(address1);
                       
                       driver.findElement(By.xpath("//img[@id='searchIcon1']")).click();
                       vebdriver.waitforelementInDOM(driver);
                       vebdriver.switchToWindow(driver, "Products&action");
                      String product = exceldriver.getDataFromExcel("sheet1", 1, 1);
                       driver.findElement(By.xpath("//input[@id='search_txt']")).sendKeys(product);
                       driver.findElement(By.xpath("//input[@type='button' and @name='search' and @class='crmbutton small create']")).click();
                       vebdriver.waitforelementInDOM(driver);
                       
                          WebElement click = driver.findElement(By.xpath("//input[@name='selected_id']"));
                       
                          vebdriver.mouseOverOnElement(driver, click);
                          vebdriver.waitforelementInDOM(driver);
                          driver.findElement(By.xpath("//a[@id='popup_product_135']")).click();
                          
                          vebdriver.switchToWindow(driver, parent);
                          vebdriver.waitforelementInDOM(driver);
                         String item = exceldriver.getDataFromExcel("sheet1", 4, 1);
                          driver.findElement(By.xpath("//textarea[@id='comment1']")).sendKeys(item);
                          
                                // exceldriver.writeintdataInExcel("sheet1", 3, 1, 500);
                           String qty = exceldriver.getDataFromExcel("sheet1", 3, 1);
                            driver.findElement(By.xpath("//input[@id='qty1']")).sendKeys(qty);
                            
                            driver.findElement(By.xpath("(//input[@accesskey='S'])[2]")).click();
                            
                           String verify = driver.findElement(By.xpath("//span[@class='lvtHeaderText']")).getText();
                            System.out.println(verify);
                            if(verify.contains(str))
                            {
                            	System.out.println("it is puchase order information page");
                            }
                            else {
                            	System.out.println("it is no purchased");
                            }
                            
                          WebElement moreinform = driver.findElement(By.xpath("(//a[text()='More Information'])[1]"));
                            
                          vebdriver.mouseOverOnElement(driver, moreinform);
                          driver.findElement(By.xpath("//a[text()='Documents' and @class='drop_down']")).click();
                          vebdriver.waitforelementInDOM(driver);
                          driver.findElement(By.xpath("//input[@name='button' and @type='submit']")).click();
                            
                            
                          WebElement ele = driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']"));
         		           
          		          vebdriver.mouseOverOnElement(driver, ele);
          		          driver.findElement(By.xpath("//a[text()='Sign Out']")).click();
          		        vebdriver.waitforelementInDOM(driver);
          		          
          		        driver.close();
                           
	}

}
