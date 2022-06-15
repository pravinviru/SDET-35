package ddtpractices;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class actitime {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("admin");
		driver.findElement(By.xpath("(//input[@type='password'])[1]")).sendKeys("manager");
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		
		Thread.sleep(3000);
		driver.close();
		

	}

}
