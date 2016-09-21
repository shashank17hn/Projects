package Lesson_input;

public class Test {
	
	int id;
	String name;
	int age;
	public static int grade =0;
	
	Test()
	{
		grade++;
	}
	public static void grade_no()
	{
		
		System.out.println(grade);
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	

}
