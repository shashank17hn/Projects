package extra;

import java.io.DataInputStream;
import java.io.IOException;
import java.util.Scanner;

public class ExtraTest {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		 String s = "Hello";
         s = s.trim();
         System.out.println("trimmed " + s);
         
         int _str= 52;
		
		
		int y =0;
		boolean set = false;
		
		 y = (set== true) ? 1:2;
		
		System.out.println(y);
		
		try{
			 { System.out.println("try block"); }
		    } 


		finally{
			System.out.println("finally caled");
		}
		
		
	    int[] ai = new int[10];
	   
        System.out.println(ai[3]);
        
      //  int i;
       // System.out.println(i);
		
		char a = '2';
		int val= (int)a;
		System.out.println(val);
		
		
		String one = "abcde";
		String two = new String("abcde");
		
		boolean right = one.equals(two);
		if(right)
		{
			System.out.println("its same ");
		}
		
		else
		{
			System.out.println("its not same");
		}
		
		if(one == two)    // == doesnt works with the string . bcoz it doesnt compares the value 
		{
			System.out.println("its same 123 ");
		}
		else
			
		{
			System.out.println("its not same 123");
		}
			
		System.out.println("--------------------------------------------------");
		
		System.out.println("Enter a no");
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
		
		
		
		switch(input)
		{
		  case 10:
			  {
				  System.out.println("Its 10");
			  break;
			  }
		  case 20:
		      {
			  System.out.println("its 20");
			  break;
			  }
		  case 30:
		  case 50:
		  {
			  System.out.println("its 30 and 50 both");
			  break;
		  }
		  default:
		  {
			  System.out.println("invalid value");
		  }
		}
		
		System.out.println("----------------------------");
		
		System.out.println("enter text");
		//Scanner Scan2 = new Scanner(System.in);
		String text = scan.next();
		text += scan.nextLine();  
		
		
		char[] text1 = text.toCharArray();
		System.out.println(text);
		for(char abc: text1)
		{
			System.out.print(abc);
		}
		
		//	int[] x = new int[5]{0,1,2,3,4};
		  //int x[];
		//int[] x ;
	//	int y[];
	}
		

	}


