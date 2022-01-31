package practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class JDBCpractice1 {
	

	public static void main(String[] args) throws SQLException {
		Connection conn=null;
		try{
		Driver driverref=new Driver();
		DriverManager.registerDriver(driverref);
		
		conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/projects", "root", "root");
		System.out.println("connection is done");
		
		Statement stmt = conn.createStatement();
		String query = "select * from project";
		ResultSet resultset = stmt.executeQuery(query);
		
		while(resultset.next()){
			System.out.println(resultset.getString(1) +"\t"+resultset.getString(2)+"\t"+resultset.getString(3)+"\t"+resultset.getString(4));
		}
		}
		catch (Exception e) {
		}
		finally {
			conn.close();
		}
		
		

	}

}
