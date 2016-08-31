package beautiful_String;

import java.lang.reflect.Array;
import java.util.Scanner;

public class BeautifulString {
	
	public static char[] alphabet = new char[26];
	public static String tempStr="";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char[] inputArray;
		int[] comparedArray;
		int[] sortedArray;
		int beautifulString;
	
		inputArray = getInput();
		comparedArray= getCompared(inputArray);
		sortedArray= getSorted(comparedArray);
		beautifulString = CalculateBeautifulString(sortedArray);
		System.out.println("Beautiful String : " + beautifulString);
	

	}	
	
	public static char[] getInput()
	{
		
		char[] inputArray;
		String input;

		for(char i='a';i<='z';i++)
		{
			alphabet[i-'a'] =i;      // populate alphabet Array from A to Z
		}
		
		Scanner scan = new Scanner(System.in);
		input = scan.next();
		inputArray = input.toCharArray();     // input from user
		
		System.out.print("Given Input : ");
		for(int i=0;i<inputArray.length;i++)
		{
			System.out.print(inputArray[i]);   // printing giving input
		}
		System.out.println();
		return inputArray;
		
	}
	
	public static int[] getCompared(char[] inputArray)
	{
		for(int i=0;i<alphabet.length;i++)
		{
			int counter = 0;
			for(int j=0;j<inputArray.length;j++)
			{
				
				if(alphabet[i]==inputArray[j])   // compared with alphabet array to find the occurrence of alphabets
						{
				
							counter ++;
						}
				
			}
			
			if(counter!=0)
			{
			 System.out.println(alphabet[i] + ":" +counter);
			  // just for printing occurence
			}
			
			if(counter !=0)
			{
				tempStr +=counter;                // string of occurrences 
			}
			
		}
		
		System.out.println("Occurence of rest of the alphabet is 0"); 
		
		//<------------------------------------ End of comparison  ------------------------------------------->
		
		int[] countArr = new int[tempStr.length()];
		for(int i=0 ; i<tempStr.length(); i++)
		{
			countArr[i]= Character.digit(tempStr.charAt(i), 10);    // changing string to integer array
			System.out.print(countArr[i]);
			
		}
		
		return countArr;
	}
		
	public static int[] getSorted(int[] comparedArray)
	{
		boolean flag =true;
		int k=0;
		int temp;
		 while ( flag )
	     {
			 flag= false;  
		
	              //set flag to false awaiting a possible swap
	           
	            for( int j=0;  j < comparedArray.length -1;  j++ )
	            {
	              if ( comparedArray[ j ] < comparedArray[j+1] )   // change to > for ascending sort
	                   {
	                	 
	                           temp = comparedArray[ j ];                //swap elements
	                           comparedArray[ j ] = comparedArray[ j+1 ];
	                           comparedArray[ j+1 ] = temp;
	                          flag = true;              //shows a swap occurred  
	                        
	                  } 
	            } 
	      } 
		
		
		return comparedArray;
	}
	
	public static int CalculateBeautifulString(int[] sortedArray)
	{
		
		int BeautifulString =0 ;
		int AlphaValue= 26;
		for(int i=0;i<sortedArray.length;i++)
		{
			System.out.println();
			System.out.println( sortedArray[i] + " * " + AlphaValue + "=" + sortedArray[i]*AlphaValue);
			BeautifulString = BeautifulString + sortedArray[i]*AlphaValue;
			AlphaValue--;
		}
		
		return BeautifulString;
		
	}

	
}
