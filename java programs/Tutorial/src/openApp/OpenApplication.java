package openApp;

import java.text.SimpleDateFormat;
import java.util.Date;

public class OpenApplication {

	public static void main(String[] args) {
		

		try{
			Runtime.getRuntime().exec("notepad.exe");
		}
		catch(Exception ex)
		{
			System.out.println("failur");
			ex.printStackTrace();
		}
		
		Date date = new Date();
		
		SimpleDateFormat formatter = new SimpleDateFormat("dd MM yyyy");
		
		System.out.println(formatter.format(date));
		
				 
	}
	
	

}
