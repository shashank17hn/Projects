import java.util.*;
public class Interface_solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		IntArrayUtils Int_util = new IntArrayUtils();
		CharArrayUtils Char_Util = new CharArrayUtils();
		
		System.out.println("Enter 1 for Integer array and 2 for Character array");
		Scanner Scan3 = new Scanner(System.in);
		int choice = Scan3.nextInt();
		switch(choice)
		{
			case 1:
			{
				Int_util.GenerateArray();
	    		Int_util.DisplayArray();
	    		Int_util.Sorting();
	    		Int_util.RemoveDuplicate();
	    		Int_util.consicutive();
	    		break;
				
			 }
			    
			
			 case 2:
			 {	
			
		     		
		     Char_Util.GenerateArray();
			 Char_Util.DisplayArray();
			 Char_Util.Sorting();
		     Char_Util.RemoveDuplicate();
		    // Char_Util.consicutive();
				break;
			 }
			default:
			{
				System.out.println("Sorry Invalid Choice");
				break;
			}
		}
		

	}

}
