package chap1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;



public class Test_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("hello world");
		try {
		File file = new File("Lesson1.txt");
		if(!file.exists())
		{
			file.createNewFile();
		}
		
			PrintWriter pr = new PrintWriter(file);
			
			pr.println("Hello this is my first text file");
			
			System.out.println("Done");
		}
		
		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}
