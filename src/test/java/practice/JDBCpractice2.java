package practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class JDBCpractice2 {

	public static void main(String[] args) throws SQLException {
		Connection conn=null;
		int result=0;
		try{
		Driver driveref=new Driver();
		
		DriverManager.registerDriver(driveref);
		 conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/projects", "root", "root");
		System.out.println("Connection is done");
		
		Statement stmt = conn.createStatement();
		String query = "insert into project values('TY_PROJ_005','Murgesh N B','12/01/2022','Fifth Project','created','2')";
		
		 result = stmt.executeUpdate(query);
		}
		catch (Exception e) {
		}
		finally {
			if(result==1){
				System.out.println("Project insertred successfully");
			}
			else{
				System.out.println("Project not inserted");
			}
			conn.close();
		}
	}

}
