package practices;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class program {

	public static void main(String[] args) throws InterruptedException {
		    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
         driver.get("http://localhost:8888/");
         driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
         
         driver.findElement(By.xpath("//input[@type='text']")).sendKeys("admin");
         driver.findElement(By.xpath("//input[@type='password']")).sendKeys("admin");
         driver.findElement(By.xpath("//input[@type='submit']")).click();
         
         
         
         driver.findElement(By.xpath("(//a[text()='Organizations'])[1]")).click();
         driver.findElement(By.xpath("//img[@title='Create Organization...']")).click();
         
         driver.findElement(By.xpath("//input[@name='accountname']")).sendKeys("product");
         driver.findElement(By.xpath("(//input[@title='Save [Alt+S]'])[1]")).click();
            Thread.sleep(3000);
         
              Alert a = driver.switchTo().alert();
                a.accept();
                driver.findElement(By.xpath("(//input[@title='Save [Alt+S]'])[1]")).click();
         
         Thread.sleep(3000);
        // driver.close();
	}

}
