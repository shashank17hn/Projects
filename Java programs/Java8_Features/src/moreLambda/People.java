package moreLambda;

public class People {

	private String FirstName;
	private String LastName;
	private int age;
	
	public People(String First , String Last , int age)
	{
		this.FirstName = First;
		this.LastName = Last;
		this.age = age;
	}
	
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	} 
	
}
