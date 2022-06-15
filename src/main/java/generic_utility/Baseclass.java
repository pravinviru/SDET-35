package generic_utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import com.crm.comcast.pomrepositoryutility.LoginPage;
import com.crm.comcast.pomrepositoryutility.homePage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass {


	public Webdriver_Utility vebdriver = new Webdriver_Utility();
	public Excel_Utility exceldriver = new  Excel_Utility();
	public Java_Utility javadriver = new Java_Utility();
	public File_Utility filedriver = new  File_Utility();
	public WebDriver driver = null;
	public static WebDriver sdriver=null;


	@BeforeSuite(groups= {"smokeTest","regressionTest"})
	public void beforesuite()
	{
		System.out.println("database connection");
	}

	@BeforeTest(groups= {"smokeTest","regressionTest"})
	public void beforetest()
	{
		System.out.println("execute in parallel mode");
	}

	
	@Parameters("browser")
	@BeforeClass(groups= {"smokeTest","regressionTest"})
	public void beforeclass(@Optional ("chrome")String browser ) throws Throwable
	{
		//String browser = filedriver.getProperty("browser");
		Reporter.log(browser, true);
		if(browser.equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver= new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}

		else {
			driver = new ChromeDriver();
		}

		driver.manage().window().maximize();
		sdriver = driver;
		vebdriver.waitforelementInDOM(driver);
		String url = filedriver.getProperty("url");
		driver.get(url);

	}

	@BeforeMethod(groups= {"smokeTest","regressionTest"})
	public void beforemethod() throws Throwable
	{
		String username = filedriver.getProperty("username");
		String password = filedriver.getProperty("password");
		LoginPage login = new  LoginPage(driver);
		login.loginToApp(username, password);
	}

	@AfterMethod(groups= {"smokeTest","regressionTest"})
	public void aftermethod()
	{
		homePage homepage = new homePage(driver);
		homepage.admin(driver);
		homepage.signout();
	}

	@AfterClass(groups= {"smokeTest","regressionTest"})
	public void afterclass()
	{ 
		driver.quit();
	}

	@AfterTest(groups= {"smokeTest","regressionTest"})
	public void aftertest()
	{
		System.out.println("parallel execution is completed");
	}

	@AfterSuite(groups= {"smokeTest","regressionTest"})
	public void aftersuite()
	{
		System.out.println("connection with database removed");
	}

}
