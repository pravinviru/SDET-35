package practices;

import static org.testng.Assert.assertEquals;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TakingScreenshot {
@Test
public void takeSnap() throws IOException {
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://actitime.com");
	TakesScreenshot ss= (TakesScreenshot)driver;
	File src = ss.getScreenshotAs(OutputType.FILE);
	File file=new File("./screenshot/scrn.png");
	//FileUtils.copyFile(src, file);screenshot
FileHandler.copy(src, file);
driver.close();
}
}