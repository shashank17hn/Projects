package extra;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Base {
	
		 Base(){}
	public Base(int i )
	{
		System.out.println("from base");
	
		
	}
	public static void amethod()throws FileNotFoundException{
		
		System.out.println("base class");
	}
}
