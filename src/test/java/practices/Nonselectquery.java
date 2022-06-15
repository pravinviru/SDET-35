package practices;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class Nonselectquery {

	public static void main(String[] args) throws SQLException {
		Connection connection=null;
		int result = 0;
		try {
			Driver driverref = new Driver();
			DriverManager.registerDriver(driverref);
			
			 connection = DriverManager.getConnection("jdbc:mySql://localhost:3306/students", "root","root");
			  
			  Statement statement = connection.createStatement();
			  
			     String query = "insert into students_info values(7,'p','l','o')";
			     
			          result = statement.executeUpdate(query);         
		}
		 catch(Exception e)
		{
			 e.getMessage();
		}
      finally
      {
    	  if(result==1)
    	  {
    		System.out.println("row is inserted");  
    	  }
    	  else {
    		  System.out.println("row is not inserted");
    	  }
    	  connection.close();
      }
	
	}

}
