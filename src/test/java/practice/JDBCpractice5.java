package practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class JDBCpractice5 {
	
	public static void main(String[] args) throws SQLException {
		Connection conn=null;
		try{
		Driver dref=new Driver();
		DriverManager.registerDriver(dref);
		 conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/projects", "root", "root");
		Statement stmt = conn.createStatement();
		String query = "select * from project";
		ResultSet result = stmt.executeQuery(query);
		
		while (result.next()) {
			System.out.println(result.getString(1)+"\t"+result.getString(2)+"\t"+result.getString(3)+"\t"+result.getString(4)+"\t"+result.getString(5));
		}
		}
		catch (Exception e) {
		}
		finally {
			conn.close();
		}
	}
	

}
