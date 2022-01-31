package practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class Nonselectqu {

	public static void main(String[] args) throws SQLException {
		Connection conn=null;
		int update=0;
		try{
		Driver dref=new Driver();
		DriverManager.registerDriver(dref);
		 conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/projects", "root","root");
		Statement stmt = conn.createStatement();
		String query = "insert into project values('Py_1','SachinJB','13/01/2022','Doosra','Ongoing','4')";
		 update = stmt.executeUpdate(query);
		 
		 String query2="select * from project";
		 if(update==1){
			 
				ResultSet result2 = stmt.executeQuery(query2);
				 while(result2.next()){
					 System.out.println(result2.getString(4));
				 }
			}
		
		}
		catch (Exception e) {
		}
		finally {
			
			conn.close();
		}

	}

}
