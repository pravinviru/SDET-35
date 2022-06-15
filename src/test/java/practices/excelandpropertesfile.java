package practices;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class excelandpropertesfile {

	public static void main(String[] args) throws Throwable {
		 WebDriver driver= new ChromeDriver();
	     driver.manage().window().maximize();
	     FileInputStream fis = new FileInputStream("./data/vtiger.properties");
	       Properties p = new Properties();
	         p.load(fis);
	        String browser = p.getProperty("browser");
	         String url = p.getProperty("url");
	                  String username = p.getProperty("username");
	                     String password = p.getProperty("password");
	                     
	                     driver.get(url);
	                     driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	                     
	                     driver.findElement(By.xpath("//input[@type='text']")).sendKeys("username" );
	                     driver.findElement(By.xpath("//input[@type='password']")).sendKeys("password ");
	                     driver.findElement(By.xpath("//input[@type='submit']")).click();
	                     
	                     Thread.sleep(3000);

	}

}
