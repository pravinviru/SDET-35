package practices;


import java.io.FileInputStream;
import java.io.IOException;

import java.io.Reader;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Propertyclass {
	

	public static void main(String[] args) throws InterruptedException, IOException {
		
   // System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
     WebDriver driver= new ChromeDriver();
     driver.manage().window().maximize();
     FileInputStream fis = new FileInputStream("./data/vtiger.properties");
       Properties p = new Properties();
         p.load(fis);
     
    String g = p.getProperty("url");
     
     driver.get(g);
     driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
     
     driver.findElement(By.xpath("//input[@type='text']")).sendKeys("admin" );
     driver.findElement(By.xpath("//input[@type='password']")).sendKeys("admin");
     driver.findElement(By.xpath("//input[@type='submit']")).click();
     
     Thread.sleep(3000);
     driver.close();
     
	}

	}

