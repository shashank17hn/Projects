package chap1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class Test_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BufferedReader br = null;
		
		try{
			br = new BufferedReader(new FileReader("Lesson1.txt"));
			String line;
			while ((line = br.readLine()) != null)
				System.out.println(line);
		}
		catch(IOException e)
		{
			System.out.println(e);
		}
		finally{
		try {
			br.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		}
		

	}

}
