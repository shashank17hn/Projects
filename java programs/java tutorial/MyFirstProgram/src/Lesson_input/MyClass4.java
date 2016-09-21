package Lesson_input;

public class MyClass4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//abc();
		//abcd("Shashank");
		//int sum = Abcde(4,5);
		//System.out.println(sum);
		//Abcdef(6,7);
	//	Abcdef(10,7);
		
		Test test1 = new Test();
		Test test2 = new Test();
		Test.grade_no();
		
		
		Cube cube = new Cube();
		System.out.println(cube.volume());
		
		Cube cube1 = new Cube(10,10,10);
				System.out.println(cube1.volume());
		

	}

	public static void abc()
	{
		System.out.println("Hello this is the function ");
	}
	
	public static void abcd( String name)
	{
		System.out.println(name);
	}
	
	public static int Abcde(int a,int b)
	{
		return(a+b);
		
	}
	public static void Abcdef(int a,int b)
	{
		System.out.println(a+b);
		
	}
}

