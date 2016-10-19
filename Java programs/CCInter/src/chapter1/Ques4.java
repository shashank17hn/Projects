
/*Implement a method to perform basic string compression using the counts of
	repeated characters. For example, the string aabcccccaaa would become
	a2blc5a3. If the "compressed" string would not become smaller than the original
	string, your method should return the original string.*/
		
package chapter1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class Ques4 {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter Element to find occurence ");
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		int counter=1;
		String output = "";
		StringBuffer sb = new StringBuffer();
		char[] values = input.toCharArray();
		char temp= values[1];
		
		for(int i =1 ; i <values.length; i++)
		{                                                                                     
				
			if(temp == values[i])
			{
				counter++;
		
			}
			else
			{
				sb.append(temp);
				sb.append(counter);
				output = output + temp + counter;
				temp = values[i];
				counter =1;
				
				
			}
			
		}
		output = output + temp + counter;
		sb.append(temp);
		sb.append(counter);
		if(output.length() > input.length())
		{
			System.out.println(input);
			
		}
		else
		{
		
			System.out.println(output);
			System.out.println(sb);
		}
		
		
		
	}

}
