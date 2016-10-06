package jdbcDemo1;

import java.sql.*;
import java.util.Scanner; 

public class Driver {
	
	
	public static Statement myStat; 
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ResultSet myRs = createConnection();
		
		System.out.println("Enter your choice 1 show, 2 insert, 3 update, 4 delete");
		Scanner scan = new Scanner(System.in);
	
		int optnSelected = scan.nextInt();
		
		switch(optnSelected)
		{
		case 1:
			{
				showTable(myRs);
				break;
			}
		case 2: {
			
			insertValues(myRs);
			break;
		}
		
		case 3:
		{
			updateTable(myRs);
			break;
		}
		case 4:
		{
			DeleteRow();
		}
		}
	
	}
	
	

	public  static ResultSet createConnection()
	{
	
	           // 1 setting up connection to database
		
		try{
	
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","root","password");
				
				// 2 create statement
	  			  
			    myStat = con.createStatement();
				
				//3 Execute query
				
				ResultSet myRs = myStat.executeQuery("select * from employees");
				
				//4  show the result which you get from SQL
				
				return myRs;
		}
		
		catch(Exception ex)
		{
			System.out.println(ex);
		}
		return null;
		

	
	}
	
	
	
	public static void showTable( ResultSet myRs)   // show table
	{
		try{
			
			while(myRs.next())
			{
				System.out.println(myRs.getString("last_name")+ ", " + myRs.getString("first_name") + "," + myRs.getString("email") );
			}
		}
		catch(Exception ex)
		{
			System.out.println(ex);
		}
		
		
	}
	
	
	public static void insertValues (ResultSet myRs) // insert values
	{
		
		System.out.println("enter last name");
		Scanner scan1 = new Scanner(System.in);
		String lastName = scan1.nextLine();
		
		
		System.out.println("enter first name");
		Scanner scan2 = new Scanner(System.in);
		String firstName = scan2.nextLine();
		
		System.out.println("enter email");
		Scanner scan3 = new Scanner(System.in);
		String email = scan3.nextLine();
		
		String sql = "insert into employees"
				 +"(last_name,first_name,email)"
				 +"values ('"
				 +lastName+"','"
				 +firstName+"','"
				 +email
				 +"')";
		
		
		System.out.println(lastName +" , " + firstName + " , " + email );
		
		
		
		try {
			
			
			myStat.executeUpdate(sql);
			System.out.println("inserted,Update content is below Table content is");
			
			myRs.close();
			
			showTable(createConnection());
			
			
		} catch (SQLException e) {

			e.printStackTrace();
		}
		
		
	}
	
	public static void updateTable(ResultSet myRs)
	{
		
		System.out.println("Update which id ?");
		Scanner scan1 = new Scanner(System.in);
		String input = scan1.nextLine();
		
		System.out.println("What you want to update : 1 lastName , 2 FirstName , 3 email ");
		Scanner scan2 = new Scanner(System.in);
		int colName = scan2.nextInt();
		String selection= null;
		String value= null;
		
		
		Scanner scan3 = new Scanner(System.in);
		switch (colName) {
		case 1: {
			System.out.println("enter updated lastname");
		    value = scan3.nextLine();
		    selection = "last_name";
		    System.out.println(selection + ":" + value);
			System.out.println(value);
			break;
		}

		case 2: {
			System.out.println("enter updated firstname");
			value = scan3.nextLine();
			 selection = "first_name";
			System.out.println(selection + ":" + value);
			System.out.println(value);
			break;
		}
		
		case 3: {
			System.out.println("enter updated email");
			value = scan3.nextLine();
			 selection = "email";
			System.out.println(selection + ":" + value);
			selection = "email";
			break;
		}
		}
		
		updateTableEntry(input,value,selection);
	}
	
	public static void updateTableEntry(String input,String value, String selection)
	{
		System.out.println("value recieved"+ input+ "- " +selection + ":" + value);
		
		try{
			
				
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","root","password");
				
				// 2 create statement
	  			  
			    myStat = con.createStatement();
				
				//3 Execute query
				
				ResultSet myRs = myStat.executeQuery("select * from employees");
				
				//4  show the result which you get from SQL
				
		
			
			while(myRs.next())
			{
				if(input.equals(myRs.getString("id")) )
				{
					String sql = "update employees set " + selection + " = '"+ value +" ' where id =" +input;
					
					myStat.executeUpdate(sql);
					
					System.out.println("Updation Complete");
			
				}
				
				
			}
			}
			
			catch(Exception ex)
			{
				System.out.println(ex);
			}
		
		
		
		showTable(createConnection());
	}	
	
	
	public static void DeleteRow()
	{
		
		System.out.println("Enter which id to delete");
		Scanner scan1 = new Scanner(System.in);
		String input = scan1.next();

		try{
			
				
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","root","password");
				
				// 2 create statement
	  			  
			    myStat = con.createStatement();
				
				//3 Execute query
			    String sql = "delete from employees where id =" + input; 

				//4  show the result which you get from SQL
			    
			    int rowsAffected = myStat.executeUpdate(sql);
			    System.out.println("Rows affected : " + rowsAffected);
				
		}
		
		
			
			
			
			catch(Exception ex)
			{
				System.out.println(ex);
			}
		
		
		
		showTable(createConnection());
		
		
		
	}
	
	

}
