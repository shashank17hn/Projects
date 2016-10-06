package metaData;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;

import com.mysql.jdbc.DatabaseMetaData;

public class DriverMetaData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try{
			
			
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","root","password");
			DatabaseMetaData dbm = (DatabaseMetaData) con.getMetaData();
			
			
			System.out.println("Product name :" + dbm.getDatabaseProductName());
			System.out.println("Product version :" + dbm.getDatabaseProductVersion());
			System.out.println("driver name :" + dbm.getDriverName());
			System.out.println("Driver version :" + dbm.getDriverVersion());
			
			Statement stat = con.createStatement();
			
			ResultSet rs = stat.executeQuery("select * from employees");
			
			
			ResultSetMetaData rsmd = rs.getMetaData();
			
			int count = rsmd.getColumnCount();
			
			for(int i =1 ;i<= count; i++)
			{
				System.out.println("column name : " + rsmd.getColumnName(i) );
				System.out.println("column type name : " + rsmd.getColumnTypeName(i) );
				System.out.println("is null : " + rsmd.isNullable(i) );
				System.out.println("is autoincrement : " + rsmd.isAutoIncrement(i) );
			}
			
			
			
			
			
		}
		
		catch(Exception Ex)
		{
			Ex.printStackTrace();
		}

	}
		
		

}
