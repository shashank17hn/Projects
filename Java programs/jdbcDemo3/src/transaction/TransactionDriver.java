package transaction;

import java.sql.*;
import java.util.Scanner;

public class TransactionDriver {
	
	public static void main(String args[])
	{

		
		System.out.println("Transcation Started");
	
	try{
		
		
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","root","password");
		
		con.setAutoCommit(false);
	
		
		Statement stat = con.createStatement();
		stat.executeUpdate("update employees set department = 'ee' where department = 'ec'");
		stat.executeUpdate("update employees set salary =300 where department = 'cs'");
		
		
		Scanner scan1 = new Scanner(System.in);
		boolean status = scan1.nextBoolean();
		
		if(status)
		{
			con.commit();
			System.out.println("COMMITED");
		}
		
		else
		{
			System.out.println("Roll Back");
		}
		
	}
	
	catch(Exception ex)
	{
		ex.printStackTrace();
	}
	}
	
}	

