package ocuurences;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class Occurences {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter Element to find occurence ");
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		scan.close();
		
		Map<Character, Integer> map = new HashMap<Character , Integer>();
		char[] values = input.toCharArray();
		
		for(char ch : values)
		{
			if(map.containsKey(ch))
			{
				
				map.put(ch, map.get(ch)+1);
				
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
		
		System.out.println("from for loop ");
		for(Character ch : map.keySet())
		{
			
			System.out.println("key : " + ch + " value " + map.get(ch) );
		}
		
		Iterator<Character> it = map.keySet().iterator();

		
		System.out.println("from while loop ");
		while(it.hasNext())
		{
			Character key = it.next();
			System.out.println( map.get(key) + " key : " + key + " value ");
		}
		
		
		
		
	}

}
