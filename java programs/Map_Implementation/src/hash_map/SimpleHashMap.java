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
		
		Iterator<Integer> it = map1.keySet().iterator();
		
		                  
		
		while(it.hasNext())
		{
			System.out.println(map1.get(it.next()));
			// map1.put(6, "try");   gives concurrent modification exception.
		}
	}

}
