package preparedStmtDemo;

import java.sql.*;

public class PreparedDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try{
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","root","password");
			
			PreparedStatement mystat = con.prepareStatement("select * from employees where id > ?");
			
			mystat.setInt(1,1);
			
			ResultSet myRs = mystat.executeQuery();
			
			System.out.println("query executed");
			
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

		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}

}
