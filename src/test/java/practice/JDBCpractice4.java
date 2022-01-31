package practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class JDBCpractice4 {

	public static void main(String[] args) throws SQLException {
		
	
		String projectname="Fifth Project";
		Connection conn=null;
		try{
		Driver dref=new Driver();
		DriverManager.registerDriver(dref);
		 conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/projects", "root", "root");
		Statement stmt = conn.createStatement();
		String query = "select * from project";
		ResultSet resultset = stmt.executeQuery(query);
		boolean flag=false;
		while(resultset.next()){
			String actualprojectname = resultset.getString(4);
			if(actualprojectname.equals(projectname)){
				flag=true;}
		}
		}
		catch (Exception e) {
		}
		finally {
			conn.close();
			System.out.println("Conn closed");
		}

	}
}
