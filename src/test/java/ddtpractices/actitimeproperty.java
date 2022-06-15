package ddtpractices;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class actitimeproperty {

	public static void main(String[] args) throws Throwable {
		    FileInputStream fis = new FileInputStream("./data/vtiger.properties");
		    
		    Properties p = new Properties();
		    p.load(fis);
		       String browser = p.getProperty("browser");
		  String url = p.getProperty("url1");
		           String un = p.getProperty("un");
		                   String pw = p.getProperty("pw");
		                   
		                 WebDriver driver = null; 
		       if(browser.equalsIgnoreCase("firefox")) {
		    	   WebDriverManager.firefoxdriver().setup();
		    	   
		       }
		       else if(browser.equalsIgnoreCase("chromedriver")){
		        	  
		        	 WebDriverManager.chromiumdriver() .setup();
		        	 driver = new ChromeDriver();
		          }
		          else {
		        	  driver= new ChromeDriver();
		        	  
		          }

		       driver.get(url);
		       driver.findElement(By.xpath("//input[@type='text']")).sendKeys(un);
		       driver.findElement(By.xpath("//input[@type='password']")).sendKeys(pw);
		       driver.findElement(By.xpath("//div[text()='Login ']")).click();
		       
		       Thread.sleep(3000);
		       driver.close();

	}

}
