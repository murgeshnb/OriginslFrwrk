package practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class JDBCpracticee2 {

	public static void main(String[] args) throws SQLException {
		Connection conn=null;
		try{
			Driver driverref=new Driver();
		
		DriverManager.registerDriver(driverref);
		
		conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/projects", "root", "root");
		System.out.println("Connection is done");
		
		Statement stmt = conn.createStatement();
		String query = "select * from project";
		
		ResultSet result = stmt.executeQuery(query);
		
		while(result.next()){
			System.out.println(result.getString(1));
		}
		}
		catch (Exception e) {
		}
		finally {
			conn.close();
			System.out.println("CLose the connection");
		}

	}

}
