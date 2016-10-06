package objectComparator;

import java.util.*;

class Person
{

	private int id;
	private String name;
	public Person(int id , String name)
	{
		this.id=id;
		this.name= name;
				
	}
	
	public int getId() {
		return id;
	}
	
	
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String toString()
	{
		return (id + " : " + name);
	}
}

public class ObjectCompEX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person p1 = new Person(4, "def");
		Person p2 = new Person(5, "abc");
		Person p3 = new Person(1, "lom");
		Person p4 = new Person(2, "kge");
		
		
		
		List<Person> list = new ArrayList<Person>();
		
		
		list.add(p1);
		list.add(p2);
		list.add(p3);
		list.add(p4);
		
		for(Person person : list)
		{
			System.out.println(person);
		}
		
		Collections.sort(list, new Comparator<Person>()
				{

					@Override
					public int compare(Person o1, Person o2) {
						// TODO Auto-generated method stub
						return o1.getName().compareTo(o2.getName());
						
						
					}
			
				});
		
		System.out.println("+++++++++++++++++++++++++++++++++++++");
		
		
		for(Person person : list)
		{
			System.out.println(person);
		}

	}

}
