package chapter1;

import java.util.Scanner;

// Implement an algorithm to determine if a string has all unique characters.what if you can not use another data structure.

public class Ques1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner scan = new Scanner(System.in);
		String input = scan.next();
		String output="";
		int status=0;
		
		char[] value = input.toCharArray();
		for(int i=0; i<value.length ; i++)
		{
			for(int j=0;j< value.length; j++)
			{
				
				if(i!=j)
				{
					if(value[i] == value[j])
					{
						status++;
						output = output + value[i];
					}
					
					
				}
				
				else
				{
					System.out.println("Skip");
				}
			
			}
		}
		System.out.println("output : " + output);
		if(status < 1)
		{
		System.out.println("All unique characters");
		}
		else
		{  
			System.out.println(" Duplicate  characters");
		}
		

	}

}
