package vectorInfo;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class VectorConcept {

	public static void main(String[] args) {
		
		Vector <Integer> vec = new Vector <Integer>(3);
		
		ArrayList<Integer> al = new ArrayList<Integer>(3);
		
		System.out.println("Vector capacity at begning " + vec.capacity());
		System.out.println("ArrayList capacity at begning " + al.size());
		
		
		vec.add(10);
		vec.add(20);
		vec.add(30);  
		vec.add(40); // vector size increases by the increment .. ie 3 mentioned above. now the size become 6 from 3.
		
		al.add(101);
		al.add(201);
		al.add(301); // Arraylist size increases by one
		al.add(401);
		
		System.out.println("Vector capacity at end " + vec.capacity());
		System.out.println("ArrayList capacity at end " + al.size());

		vec.setSize(10);  // vector can set size but in arraylist cant
		System.out.println("Vector capacity after manually setsize " + vec.capacity());
		
		System.out.print("vector :" + vec);
		System.out.println();
		System.out.print("ArrayList :" + al);
		
		// Iterarors 
		System.out.println("---------------- Iterator ----------------");
		Iterator it = al.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		System.out.println("---------------- ListIterator ----------------");
		ListIterator<Integer> li = al.listIterator();
		while(li.hasNext())
		{
			System.out.println(li.next());
		}
		System.out.println("Reverse");
		while(li.hasPrevious())
		{
			System.out.println(li.previous());
		}
		System.out.println("Enhanced For loop");
		for(Integer x :al)
		{
			System.out.println(x);
		}
		
		System.out.println("Vector Iteration");
		Iterator it2 = vec.iterator();
		while(it2.hasNext())
		{
			System.out.println(it2.next());
		}
		
		ListIterator<Integer> li2 = vec.listIterator();
		while(li2.hasNext())
		{
			System.out.println(li2.next());
		}
		
		System.out.println("Enumeration");
		
		Enumeration <Integer> enu = vec.elements();
		while(enu.hasMoreElements())
		{
			System.out.println(enu.nextElement());
		}
		
		
		

	}

}
