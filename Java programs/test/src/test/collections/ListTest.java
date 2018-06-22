package test.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;



public class ListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Person> list = new ArrayList<>();
		list.add(new Person("abc" , 2));
		list.add(new Person("bce" , 1));
		list.add(new Person("aaa" , 3));
		
		Collections.sort(list);
		
	/*	java.util.Collections.sort(list , new Comparator<Person>() {

			@Override
			public int compare(Person p1, Person p2) {
				 if(p1.name.compareTo(p2.name)==1)
				 return -1;
				 else 
					 return 1;
			}
			
			
			
		});
		*/
		
	

		System.out.println(list);
		
	}

}

class Person implements Comparable<Person> {
	
	
	
	String name;
	int id;
	
	
	public Person(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}


	@Override
	public String toString() {
		return "Person [name=" + name + ", id=" + id + "]";
	}


	@Override
	public int compareTo(Person p1) {
		return  name.compareTo(p1.name);
		
	}
	
	
	
}
