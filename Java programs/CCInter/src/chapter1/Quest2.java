package chapter1;

import java.util.Arrays;
import java.util.Scanner;

// Given two strings, write a method to decide if one is permutation of other (Angram) - god ,  dog

public class Quest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter two strings");
		
		Scanner scan = new Scanner(System.in);
		String input1 = scan.nextLine();
		String input2 = scan.nextLine();
		 
		System.out.println(input1 + " :  " + input2);
		char[] value1 = input1.toCharArray();
		char[] value2 = input2.toCharArray();
		
		int status=0;
		//Arrays.sort(value1);
	   //Arrays.sort(value2);
		char temp;
	     
		if(value1.length == value2.length)
		{
			for(int i=0;i<value1.length;i++)
			{
				for(int j=i+1;j<value1.length;j++)
				{
				if(value1[j] < value1[i])
				{
					
				  temp = value1[i];
				  value1[i] = value1[j];
				  value1[j] = temp;
				}
				if(value2[j] < value2[i])
				{
					
				  temp = value2[i];
				  value2[i] = value2[j];
				  value2[j] = temp;
				}
				
				}
				
				if(value1[i] == value2[i])
				{
					status++;
				}
			}
		}
		
		/*for(int i=0;i<value1.length;i++)
		{
			System.out.print(value1[i]);
		}
		
		System.out.println();
		for(int i=0;i<value1.length;i++)
		{
			System.out.print(value2[i]);
		}
		*/
		if(status == value1.length)
		{
			System.out.println("True");
		}
		else
		{
			System.out.println("False");
		}
		
		
		//boolean status = Arrays.equals(value1, value2);
		//System.out.println(status);
		
		
	}

}
