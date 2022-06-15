package ddtpractices;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class Nonselectquerypractice {

	public static void main(String[] args) {
		Connection conn=null;
		int result=0;
		try {
			
			Driver driver= new Driver();
			//register driver object to databse
			DriverManager.registerDriver(driver);
			//get connection to database
			 conn = DriverManager.getConnection("jdbc:mySql://localhost:3306/students", "root", "root");
			//create statement
			     Statement stat = conn.createStatement();
			       String querry = "insert into students_info values(9,'h','t','y')";
			//execute querry
			      result = stat.executeUpdate(querry);
		}
    catch(Exception e) {
    	
    }
		finally {
			if(result==1) {
				
				System.out.println("row is inserted");
			}
			else {
				System.out.println("row is not inserted");
			}
		}
	}

}
