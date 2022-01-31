package practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.Assert;

import com.mysql.jdbc.Driver;

public class JDBCpractice7 {

	public static void main(String[] args) throws SQLException {
		Connection conn=null;
		String actproj="Doosra";
		boolean flag = false;
		try{
		Driver dref=new Driver();
		DriverManager.registerDriver(dref);
		 conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/projects", "root", "root");
		Statement stmt = conn.createStatement();
		String query = "select * from project";
		ResultSet result = stmt.executeQuery(query);
		
		while(result.next()){
			String prjct = result.getString(4);
			if(actproj.equals(prjct)){
				flag=true;
				System.out.println("Project name is there "+prjct);
			}
			//Assert.assertTrue(flag);
		}
		}
		catch (Exception e) {
			// TODO: handle exception
		}
		finally {
			conn.close();
			System.out.println("Conn closed");
		}

	}

}
