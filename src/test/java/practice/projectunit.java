package practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.mysql.cj.jdbc.Driver;

public class projectunit {
	
	@Test
	public void projectunit() throws Throwable
	{
		String projectname="FIRSTPROJECT";
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
		Assert.assertTrue(flag);
		}
		catch (Exception e) {
		}
		finally {
			conn.close();
		}
	}

}
