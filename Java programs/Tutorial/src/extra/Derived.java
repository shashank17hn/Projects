package extra;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Derived extends Base{
	
	 public static void main(String argv[]){
		 
		 int i =23;
	        if(argv.length ==0){
	        System.out.println("Usage: GetArg param");
	        }else{
	        System.out.println(argv[0]);
	        }
	        amethod(i);
	    }
		void Derived()
		{
			System.out.println("this is from derived ");
			
		}
		public static void amethod(int i){
			
			System.out.println(i);
			
			
			
		}
		
	

}
