package Lesson_input;

public class Cube {
	
	int length;
	int breadth;
	int depth;
	
	public int volume()
	{
	return (length * breadth * depth);
	}
	
	Cube()
	{
		System.out.println("This is a contructer");
		length =10;
		breadth =20;
		depth = 30;
				
	}
	
	Cube(int l, int b, int c)
	{
		length =l;
		breadth = b;
		depth= c;
	}
	
	

}
