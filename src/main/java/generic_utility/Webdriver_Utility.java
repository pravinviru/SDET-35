 package generic_utility;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.collections4.bag.SynchronizedSortedBag;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
	 * contains all reusable of Webdriver
	 * @author pravin
	 */

public class Webdriver_Utility {
	

	/**
	 *  used to Switch to Any Window based on Window Title
	 * @param driver
	 * @param partialWindowTitle
	 */
	public void switchToWindow(WebDriver driver , String partialWindowTitle) {
	       Set<String> set = driver.getWindowHandles();
	         Iterator<String> it = set.iterator();

	          while (it.hasNext()) {
			          String wID = it.next();
			          driver.switchTo().window(wID);
			          String currentWindowTitle = driver.getTitle();
			          if(currentWindowTitle.contains(partialWindowTitle)) {
			        	  
			        	  break;
			        	  
			          }

	          }
}               
	             /**
	         	 * used to Switch to Frame Window based on index
	         	 * @param driver
	         	 * @param index
	         	 */
	         	public void switchToFrame(WebDriver driver , int index)
	         	{
	         		driver.switchTo().frame(index);
	         	}

	                      /**
	                  	 * used to Switch to Frame Window based on id or name attribute
	                  	 * @param driver
	                  	 * @param id_name_attribute
	                  	 */
	                  	public void switchToFrame(WebDriver driver , String id_name_attribute)
	                  	{
	                  		driver.switchTo().frame(id_name_attribute);
	                  	}
	                  	   

	                	/**
	                	 * used to select the value from the dropDwon  based on index
	                	 * @param driver
	                	 * @param index
	                	 */
	                	public void select(WebElement element , int index) {
	                		Select sel = new Select(element);
	                		sel.selectByIndex(index);
	                	}
                               
	                	/**
	                	 * used to select the value from the dropDwon  based on value / option avlaible in GUI
	                	 * @param element
	                	 * @param value
	                	 */
	                	public void select(WebElement element , String text) {
	                		Select sel = new Select(element);
	                		sel.selectByVisibleText(text);
	                	}

	                	/**
	                	 * used to place mouse cursor on specified element
	                	 * @param driver
	                	 * @param elemnet
	                	 */
	                	public void mouseOverOnElement(WebDriver driver , WebElement elemnet)
	                	{
	                		Actions act = new Actions(driver);
	                		act.moveToElement(elemnet).perform();
	                	}

	                	/**
	                	 * 	 used to right click  on specified element

	                	 * @param driver
	                	 * @param elemnet
	                	 */
	                	
	                	public void rightClickOnElement(WebDriver driver , WebElement elemnet)
	                	{
	                		Actions act = new Actions(driver);
	                		act.contextClick(elemnet).perform();
	                	}

	                	
	                	/**
	                	 * 
	                	 * @param driver
	                	 * @param javaScript
	                	 */
	                	public void executeJavaScript(WebDriver driver , String javaScript) {
	                		JavascriptExecutor js = (JavascriptExecutor)driver;
	                		js.executeAsyncScript(javaScript, null);
	                	}
	                	

	                    
	            	    /**
	            	     * pass enter Key appertain in to Browser
	            	     * @param driver
	            	     */
	            	   public void passEnterKey(WebDriver driver) {
	            		   Actions act = new Actions(driver);
	            		   act.sendKeys(Keys.ENTER).perform();
	            	   } 
	            	   /**
	                	 * used to do doubleclick on element
	                	 * @param driver
	                	 * @param elemnet
	                	 */
	                	public void doubleClick(WebDriver driver , WebElement elemnet)
	                	{
	                		Actions act = new Actions(driver);
	                		act.doubleClick(elemnet).perform();
	                	}
	                	
	                	  public void switchToAlertAndAccept(WebDriver driver,String expectedmsg)
	                	  {
	                		            
	                		       Alert alert = driver.switchTo().alert();
	                		           String txt = alert.getText();
	                		         
	                		       if((txt).contains(expectedmsg))
	                		       {
	                		    	   System.out.println(txt);
	                		    	   System.out.println("alert is verified");
	                		       }
	                		       else {
	                		    	   System.out.println("alert is not verified");
	                		       }
	                		         alert.accept();
	                	  }
	                	
	                	  public void switchToAlertAndCancel(WebDriver driver,String expectedmsg)
	                	  {
	                		       Alert alert = driver.switchTo().alert();
	                		       if(alert.getText().equals(expectedmsg))
	                		       {
	                		    	   System.out.println("alert is verified");
	                		       }
	                		       else {
	                		    	   System.out.println("alert is not verified");
	                		       }
	                		         alert.dismiss();
	                	  }
	                	  
	                	  public void maximaize(WebDriver driver)
	                	  {
	                		  driver.manage().window().maximize();
	                	  }
	                	  
	                	  public void waitforelementInDOM(WebDriver driver)
	                	  {
	                		  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	                	  }
	                	
	                	public void waitforpage(WebDriver driver, String partialpageurl)
	                	{
	                		WebDriverWait wait= new WebDriverWait(driver,20);
	                		wait.until(ExpectedConditions.urlContains(partialpageurl));
	                	}
                  }


	            
    


	
	
	
	
	
	
	
	
	
	
