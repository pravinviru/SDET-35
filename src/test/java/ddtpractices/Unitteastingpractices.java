package ddtpractices;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;
public class Unitteastingpractices {

	public static void main(String[] args) throws SQLException {
		Connection conn = null;
		 String name= "t";
		try {
			//Register to database
			Driver driver = new Driver();
			DriverManager.registerDriver(driver);
			  conn = DriverManager.getConnection("jdbc:mySql://localhost:3306/students", "root", "root");
			
			//write query
			     Statement stat = conn.createStatement();
                         String query = "select * from students_info";
			//execute query
                    ResultSet result = stat.executeQuery(query);
                    
                    while(result.next()) {
                    	 String res = result.getString(3);
                    	if(res.equals(name)) {
                    		boolean f=true;
                    	}
                    	else { boolean f=false;
                    		
                    }
		}
		}
		catch(Exception e) {
			
		}
	finally {
		conn.close();
	}
	}
}
