package hash_Map;

import java.util.HashMap;
import java.util.HashSet;

public class HashMapImplement {

	public static void main(String[] args) {
	 
		HashMap<Integer,String> hm = new HashMap<Integer,String>();
		hm.put(01, "Shashank");
		hm.put(02, "Charmi");
		hm.put(03, "Shashank");  // Duplicate VALUE allowed but NO duplicate KEY allowed
		
		System.out.println(hm);
		System.out.println(hm.get(1));
		System.out.println(hm.containsKey(01));
		
		//*************** HashMap having  HashSet ***********************//
		
		HashMap<Integer,HashSet<String>> hm2 = new HashMap<Integer,HashSet<String>>();
		HashSet<String> hs1 = new HashSet<String>();
		hs1.add("abc");
		hs1.add("def");
		
		HashSet<String> hs2 = new HashSet<String>();
		hs2.add("123");
		hs2.add("456");
		
		hm2.put(1, hs1);
		hm2.put(2, hs2);
		
		System.out.println(hm2);
		

	}

}
