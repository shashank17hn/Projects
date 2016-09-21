import java.util.Arrays;
import java.util.Scanner;

public class CharArrayUtils extends ArrayUtils{

	
	char [] char_array = new char [50];
	int[] con = new int[20];
	 void GenerateArray()
	    {
	    	
	    	
	        Scanner Scan2 = new Scanner(System.in);     
	        System.out.println("Please Enter the array");
	        String s = Scan2.nextLine();
	        char_array = s.toCharArray(); 
	        

	    }
	 void DisplayArray()
		{
			for(int i = 0; i < char_array.length;i++)
	        {
	        	System.out.print(char_array[i] + "\t");
	        }
			System.out.println();
		}
	 void RemoveDuplicate()
		{
		 int pos=0;
			char_array[pos] = char_array[0];
			for(int i = 0; i < char_array.length;i++)
	        {
	        	if(char_array[pos] != char_array[i])
	        	{
	        		pos++;
	        		char_array[pos]= char_array[i];
	        	}
	        }
			for(int i=0;i<= pos;i++)
			{
				System.out.print(char_array[i] + "\t");
			}
		}
	 void consicutive()
	 {
		 int i=0;
			for(int j = 0; j < char_array.length ;j++)
			{
				
				if((char_array[j]+1) != char_array[j+1])
				{
					//System.out.print("*** not concecutive ***");
				}
				else
				{
					
					
					 con[i]= char_array[j];
					 i++;
					 
					
				}
			}
	 }
	 
	 void Sorting()
	 {
		 Arrays.sort(char_array);
		 System.out.println("*** After Sorting ***");
		 
	 DisplayArray();
	 }
	 
}
