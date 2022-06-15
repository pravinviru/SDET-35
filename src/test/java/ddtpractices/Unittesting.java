package ddtpractices;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class Unittesting {

	public static void main(String[] args) throws Throwable {
		 String name="kumar";
		 Connection connection= null;
		try {
			Driver driver = new Driver();
			DriverManager.registerDriver(driver);
			
		 connection = DriverManager.getConnection("jdbc:mySql://localhost:3306/students", "root", "root");
			
			    Statement stat = connection.createStatement();
			        String query = "select * from students_info";
			        
			         ResultSet resultset = stat.executeQuery(query);
			         boolean f = false; 
			while(resultset.next())
			{    
				String actualprojectname=resultset.getString(4);
				if(actualprojectname.equalsIgnoreCase(name))
				{
					f= true;
				}
					
		}
			System.out.println(f);
		}
  catch(Exception e)
		{
	  e.printStackTrace();    
	      e.getMessage();
		}
		finally
		{
			connection.close();
		}
	}

}
  