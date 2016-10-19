package Lesson2_inherit;

public class MyMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Rectangle rec = new Rectangle();
		Triangle tri = new Triangle();
		
		int ans1= rec.setvalue();
		int ans2 = tri.setvalue();
		
		System.out.println("Area of rectangle" + ans1);
		System.out.println("Area of Triangle" + ans2);

	}

}
