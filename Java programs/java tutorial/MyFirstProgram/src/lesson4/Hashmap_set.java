package lesson4;
import java.util.HashMap;
import java.util.HashSet;
public class Hashmap_set {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet<String> directs = new HashSet<String>();
		directs.add("abc");
		directs.add("efg");
		System.out.println(directs);
		directs.remove("abc");
		System.out.println(directs);
		
		
		HashMap<String, Integer> dire = new HashMap<String, Integer>();
		dire.put("abc", 1);
		dire.put("def", 2);
		dire.put("sdf", 3);
		System.out.println(dire);
		
		dire.remove("def");
		System.out.println(dire);
		
		
		HashMap<Integer, HashSet<String>> a1= new HashMap<Integer, HashSet<String>>();
		HashSet<String> a2= new HashSet<String>();
		a2.add("azc");
		a2.add("jfhj");
		a1.put(1, a2);
		System.out.println(a1);
	}

}
