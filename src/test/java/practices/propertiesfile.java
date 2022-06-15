package practices;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class propertiesfile {

	public static void main(String[] args) throws Throwable {
		//get the java representation of the object for physical file
		         FileInputStream fis = new FileInputStream("./data/vtiger.properties");
		 //create a object to property class to load all the keys
		       Properties p = new Properties();
		       p.load(fis);
		       //read the values using get property
		        String k = p.getProperty("browser");
		       String d = p.getProperty("url");
		      String l = p.getProperty("username");
		          String m = p.getProperty("password");
		          
		          WebDriver driver;
		          if(k.equalsIgnoreCase("firefox"))
		          {
		        	  WebDriverManager.firefoxdriver().setup();
		        	     driver=new FirefoxDriver();
		          }
		          else if(k.equalsIgnoreCase("chromedriver")){
		        	  
		        	 WebDriverManager.chromiumdriver() .setup();
		        	 driver = new ChromeDriver();
		          }
		          else {
		        	  driver= new ChromeDriver();
		        	  
		          }

		          
		          driver.get(d);
		          driver.findElement(By.xpath("//input[@type='text']")).sendKeys(l );
		          driver.findElement(By.xpath("//input[@type='password']")).sendKeys(m);
		          driver.findElement(By.xpath("//input[@type='submit']")).click();
		          
		          Thread.sleep(3000);
		          driver.close();
	}

}

