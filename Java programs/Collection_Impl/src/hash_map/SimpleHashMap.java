package hash_map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class SimpleHashMap {

	public static void main(String[] args) {

		
		Map<Integer,String> map1 = new HashMap<Integer,String>();
		
		map1.put(1, "abc");
		map1.put(2, "bbc");
		map1.put(3, "cbc");
		map1.put(4, "dbc");
		map1.put(5, "ebc");
		
	/*	Iterator<Integer> it = map1.keySet().iterator();
		
		                  
		
		while(it.hasNext())
		{
			System.out.println(map1.get(it.next()));
			// map1.put(6, "try");   gives concurrent modification exception.
		}*/
		
		for(Map.Entry<Integer, String> mapPrint: map1.entrySet())
		{
			//System.out.println("loop");
		  System.out.print(mapPrint.getKey() + " : ");
		  System.out.println(mapPrint.getValue());
			
		}
		
		for(Integer keys : map1.keySet())
		{
			  System.out.print(keys + " : ");
			  System.out.println(map1.get(keys));
		}
		
		System.out.println("using lambda expression");
		map1.forEach((k,v) -> {
			System.out.print(k + " : ");
			System.out.println(v);
		});
		
		
		System.out.println("using stream api");
		map1.entrySet().stream().forEach((e)-> {
			
			System.out.print(e.getKey() + " : ");
			System.out.println(e.getValue());
		});
	}

}
