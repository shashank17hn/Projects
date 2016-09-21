package hash_set;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashSetUse {

	public static void main(String[] args) {

		HashSet<Integer> hs = new HashSet<Integer>(); // hashset doesnt allow duplicate values.
		hs.add(1);
		hs.add(20);
		hs.add(30);
		hs.add(4);
		hs.add(null);
		
		System.out.println(hs);   // printed in no order . Order is unpredictable
		Set<Integer> s1 = Collections.synchronizedSet(hs);
		System.out.println(s1);
		
		LinkedHashSet<Integer> lhs = new LinkedHashSet<Integer>();  // printed in as it is inserted.
		lhs.add(101);
		lhs.add(201);
		lhs.add(301);
		lhs.add(401);
		lhs.add(501);
		
		System.out.println(lhs);  
		
		TreeSet<Integer> ts = new TreeSet<Integer>();  // tree set sort out the list and print in sorted form .
		ts.add(40);
		ts.add(10);
		ts.add(50);
		ts.add(20);
		ts.add(30);
		ts.add(30);
		
		System.out.println(ts);
		
		// all can be displayed by using Iterator
		System.out.println("******************* Iteration *********************");
		Iterator<Integer> it = ts.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		
	}
		
}
