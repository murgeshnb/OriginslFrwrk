package practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class JDBCpractice6 {

	public static void main(String[] args) throws SQLException {
		Connection conn=null;
		int res=0;
		try{
		Driver dref=new Driver();
		DriverManager.registerDriver(dref);
		 conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/projects", "root", "root");
		Statement stmt = conn.createStatement();
		String query = "insert into project values('Py_02','RockyBhai','17/01/2022','MondayProject','ONGOing','2')";
		 res = stmt.executeUpdate(query);
		
		}
		catch (Exception e) {
		}
		finally {
			if(res==1){
				System.out.println("Project inserted successfully");
			}
			else{
				System.out.println("Project insetion failed");
			}
			conn.close();
		}

	}

}
