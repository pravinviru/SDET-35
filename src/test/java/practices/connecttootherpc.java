package practices;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class connecttootherpc {

	public static void main(String[] args) throws MalformedURLException {
		
		
		          URL url = new URL("http://192.168.0.106:5555/wd/hub");
             DesiredCapabilities cap = new DesiredCapabilities();
          	cap.setBrowserName("chrome");
        	cap.setPlatform(Platform.WINDOWS);
        	RemoteWebDriver driver = new RemoteWebDriver(url, cap);
        	driver.get("http://gmail.com");

	}

}
