package practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.Test;

import com.mysql.cj.jdbc.Driver;

public class Selectque1 {
	
	public static void main(String[] args) throws SQLException {
		Connection con = null;
		try{
		Driver drefe=new Driver();
		DriverManager.registerDriver(drefe);
		 con = DriverManager.getConnection("jdbc:mysql://localhost:3306/projects", "root", "root");
		Statement stmt = con.createStatement();
		String query = "select * from project";
		ResultSet qres = stmt.executeQuery(query);
		
		while(qres.next()){
			System.out.println(qres.getString(1)+"\t"+qres.getString(2)+"\t"+qres.getString(3)+"\t"+qres.getString(4));
		}
		}
		catch (Exception e) {
		}
		finally{
			con.close();
			System.out.println("Connection closed");
		}
	}
	

}
