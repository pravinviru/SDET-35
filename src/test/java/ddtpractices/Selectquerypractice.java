package ddtpractices;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class Selectquerypractice {

	public static void main(String[] args) throws SQLException {
		Connection conn=null;
		try
		{
			Driver  driver= new Driver();
			//register to database
			DriverManager.registerDriver(driver);
			//get connection to database
			conn = DriverManager.getConnection("jdbc:mySql://localhost:3306/students", "root", "root");
			//create statement
			         Statement stat = conn.createStatement();
		    //write a querry
			           String querry = "select * from students_info";
		    //execute querry
			           ResultSet result = stat.executeQuery(querry);
			//to print particular column           
			while(result.next())
			{
				System.out.println(result.getInt(1)+"\t"+result.getString(2));
			}
		}
		catch(Exception e) {
			e.getMessage();
		}
		finally
		{
			conn.close();
		}
	}

}
