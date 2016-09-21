package chap1;

import java.util.Date;
import java.text.*;

public class Test_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Date date = new Date();
		System.out.println(date.toString());
		
		SimpleDateFormat sdf = new SimpleDateFormat("E dd/mm/yyyy HH-mm-ss");
		System.out.println(sdf.format(date));
		

	}

}
