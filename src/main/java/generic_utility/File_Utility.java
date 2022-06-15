package generic_utility;



                
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

                 /**
                  *  it;s contains External File specific libraries
                  * @author pravin
                  *
                  */

public class File_Utility {
	
	    /**
	     * it is used to fetch data from propertiesfile
	     * @param key
	     * @return string
	     * @throws Throwable
	     */
	
	   public String getProperty(String key) throws Throwable {
		   
		   FileInputStream fis = new  FileInputStream("./data/vtiger.properties");
		    Properties prop = new Properties();
		    prop.load(fis);
		   String d = prop.getProperty(key);
		   
		   return d;
	   }

}
