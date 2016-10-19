package ocuurences;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Occurences {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter Element to find occurence ");
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		int counter=0;
		Map<Character, Integer> map = new HashMap<Character , Integer>();
		char[] values = input.toCharArray();
		
		for(char ch : values)
		{
			if(map.containsKey(ch))
			{
				counter++;
				map.put(ch, map.get(ch)+1);
				counter = 0;
			}
			
			else
			{
				map.put(ch, 1);
			}
			
		}
		
		for(Character ch : map.keySet())
		{
			System.out.println(ch + " : " +  map.get(ch));
		}
		
		
		
	}

}
