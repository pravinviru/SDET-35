package generic_utility;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListnerImgClass implements ITestListener {
	
	
	public void onTestFailutre(ITestResult result)
	{
		System.out.println("======Failure");
		
		
		
	             Java_Utility jlib = new Java_Utility();
	             
	                   String testname = result.getMethod().getMethodName();
	                   
	                      EventFiringWebDriver edriver = new EventFiringWebDriver(Baseclass.sdriver);
	                        File srcFile = edriver.getScreenshotAs(OutputType.FILE);
	                          File destFile = new File("./screenshot/screenshot1.png");
	                        
	                        try {
	                        	FileUtils.copyFile(srcFile,destFile );
	                        }
	                        catch(IOException e) {
	                        	
	                        }
	}

}
