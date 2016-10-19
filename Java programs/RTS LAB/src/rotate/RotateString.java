package rotate;

import java.util.InputMismatchException;
import java.util.Scanner;

public class RotateString {

	public static String result ="";  // stores value of output
	
	public static void main(String[] args) {

		getInput(); //  calling input (which is menu) 
		

	}
	
	public static void getInput()    // its a input function basically a menu structure
	{
		
		System.out.println("Please enter the string");
		Scanner scan = new Scanner(System.in);
		String text = scan.next();
		int rotateBy=0;
		
		char ArrayToRotate[] = new char[text.length()]; 
		ArrayToRotate = text.toCharArray();         // array which will store the array which has to rotated. 
		try{
		System.out.println("Enter the no for rotation : ");   // no for rotation
	    rotateBy = scan.nextInt();
	    if(rotateBy > ArrayToRotate.length )
		{
			System.out.println("rotation value is more then array length, try again");
			getInput();
		    
		}
		else{
		
		System.out.print("String Entered : ");
		for(int j=0; j<ArrayToRotate.length;j++)
		{
			System.out.print( ArrayToRotate[j]);
		}
		System.out.println();
		rotate(ArrayToRotate,rotateBy);
		}
		
		}
		catch(InputMismatchException ex)
		{
			System.out.println("only numbers please , try again");
			getInput();
		}
		
	}
	
	public static void rotate(char[] ArrayToRotate, int rotateBy)  // function to manage rotation
	{
		char temp[] = new char[rotateBy];
		int start=0;                                 // sort of pivot
		int count = ArrayToRotate.length;            // count stores array length which is used to manage loop
		while(count !=0)
		{
			if(count>=rotateBy)                           
			{	
				for(int i=0;i<rotateBy;i++)
				{
		
					temp[i] =ArrayToRotate[start+i];    
		
				}
				reverse(temp, 0, rotateBy-1);
		
		
				count = count- rotateBy;
				start = start+rotateBy;
			}
		else                                                        // else condition for managing extra elements left
		{
			
			result = result + (ArrayToRotate[start]);
			
			start = start+1;
			count= count-1;
			//start = start+1;
		}
		}
		
		System.out.println("output :" + result);
	}

	public static void reverse(char[] ArrayToReverse, int start, int end)   // function to reverse array elements.
	{
		while(start<end)
		{
			char temp = ArrayToReverse[start];
			ArrayToReverse[start]= ArrayToReverse[end];
			ArrayToReverse[end]= temp;;
			start++;
			end--;
		}
		for(int j=0; j<ArrayToReverse.length;j++)
		{
		result = result + ArrayToReverse[j];
		}
	
		
	}
}
