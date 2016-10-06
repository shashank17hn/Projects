package natural_Comparable;

import java.util.*;

class Person implements Comparable<Person>
{
  private int id;
  private String name;
  

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

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

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}



 
  public Person(int id, String name)
  {
	  this.id = id;
	  this.name= name;
			  
  }

@Override
public int compareTo(Person o) {
   
	//return name.compareTo(o.name);  // name wise
	int len = name.length();
	int len2 = o.name.length();
	
	if(len> len2)
	{
		return 1;
	}
	else if (len < len2)
	{
		return -1;
	}
	else {
	 return name.compareTo(o.name);
	}
}
	
public String toString()
{
	return id + " : " + name; 
			
}

}




public class NaturalEX {
	
	public static void main(String args[])
	{
		List<Person> list = new ArrayList<Person>();
		Set<Person> set = new TreeSet<Person>();
		
		add(list);
		add(set);
		Collections.sort(list);
		show(list);
		
		System.out.println("===== now set ======");
		
		show(set);		

		
		
	}

	public static void add(Collection<Person> col)
	{
		
		col.add(new Person(1, "deff"));
		col.add(new Person(4, "fdefffff"));
		col.add(new Person(2, "adefe"));
		col.add(new Person(5, "edef"));
	}
	
	public static void show(Collection<Person> col)
	{
		for(Person per: col)
		{
			System.out.println(per);
		}
		
	}
	
	
}
