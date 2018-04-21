package ObjectKeyImpl;

import java.util.HashMap;
import java.util.Map;

class Person
{
	private String name;
	private int id;
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	
	
	public Person(int id,String name)
	{
		this.id= id;
		this.name= name;
	}
	
	public String toString()
	{
		return id + " : " +name;
	}
}



public class ObjectKey {

	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person p1 = new Person (1,"1abc");
		Person p2 = new Person (2,"2abc");
		Person p3 = new Person (3,"3abc");
		Person p4 = new Person (1,"1abc");
		
		Map<Person,Integer> hash= new HashMap<Person,Integer>();
		
	 hash.put(p1, 1);
	 hash.put(p2, 2);
	 hash.put(p3, 3);
	 hash.put(p4, 4);
	 
		for(Person Key :hash.keySet())
		{
			System.out.println(Key + " : " + hash.get(Key));
		}
		

	}

}
