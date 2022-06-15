package practices;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class Selectquery {

	public static void main(String[] args) throws Throwable {
		Connection connection=null;
		try {
			
		
		//register to database
		Driver driver = new Driver();
		
		DriverManager.registerDriver(driver);
		
		//connection
		 connection = DriverManager.getConnection("jdbc:mySql://localhost:3306/students","root", "root");
		
		//create query
		                     Statement stat = connection.createStatement();
		                    String query = "select * from students_info ";
   //execute query
		                 ResultSet resultset = stat.executeQuery(query);
		                 
		                 while(resultset.next())
		                 {
		                	 System.out.println(resultset.getInt(1)+"\t"+resultset.getString(2));
		                 }
	
	}
	
	catch(Exception e)
	{
		System.out.println(e.getMessage());
	}
//close the connection
	finally {
		connection.close();
	}

}} 
