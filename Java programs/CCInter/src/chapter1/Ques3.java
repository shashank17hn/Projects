/* Write a method to replace all spaces in a string with '%20'. You may assume that the
string has sufficient space at the end of the string to hold the additional characters,
and that you are given the "true" length of the string.
*/
package chapter1;

import java.util.Scanner;

public class Ques3 {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println("Enter String : ");
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		String[] inputa =input.split(" ");
		String output="";
		
		
		for(int i=0; i<inputa.length; i++)
		{
			System.out.println(inputa[i]);
			output = output + inputa[i];
			if(i+1 < inputa.length)
			{
				output = output + "%20";
			}
		}
		
		System.out.println(output);
		
		
	}

}
