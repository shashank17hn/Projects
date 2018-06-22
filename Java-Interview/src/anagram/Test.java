package anagram;

import java.util.HashMap;
import java.util.Map;

public class Test {

	
	
	public static void main(String[] args) {
		
		String given = "aaabbcc";
		String given2 = "aaabbcc";
		
		String a = given.replaceAll("//s","").toLowerCase();
		String b = given2.replaceAll("//s", "").toLowerCase();
		
		Map<Character,Integer> map = new HashMap<Character,Integer>();
		
		
		for(int i=0; i< a.length() ; i++)
		{
			System.out.println(a.charAt(i));
			if(map.containsKey(a.charAt(i)))
			{
				map.put(a.charAt(i), map.get(a.charAt(i))+1);
				//System.out.println( map.get(a.charAt(i)+1));
			}
			
			else
			{
				System.out.println("inside" + i);	
				map.put(a.charAt(i), 1);
			}
			
			if(map.containsKey(b.charAt(i)))
			{
				map.put(b.charAt(i), map.get(b.charAt(i))-1);
			}
			
			else
			{
				map.put(b.charAt(i), 1);
			}
			
			
		}
		System.out.println(map);
		
		boolean status = true;
		for(Integer key : map.values())
		{
			if(key !=0)
			{
				status = false;
			}
		}
		
		System.out.println(status);
	}
	
}
