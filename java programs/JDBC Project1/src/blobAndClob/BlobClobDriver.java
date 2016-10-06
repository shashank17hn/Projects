package blobAndClob;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.*;

public class BlobClobDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			System.out.println("Upload started");
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","root","password");
			
			String sql = "update employees set resume = ? where id =1";
			
			PreparedStatement stat = con.prepareStatement(sql);
			
			File file = new File("sha.pdf");
			FileInputStream input = new FileInputStream(file);
			
			stat.setBinaryStream(1, input);
			
			stat.executeUpdate();
			
			System.out.println("File uploaded");
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
