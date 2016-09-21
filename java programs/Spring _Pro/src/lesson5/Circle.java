package lesson5;

public class Circle implements Shape{

	private Point pointA;
	
	public Point getPointA() {
		return pointA;
	}

	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}

	@Override
	public void draw1() {
		System.out.println("Circle is Drawn");
		System.out.println("Point A : " + getPointA().getX()+ " , " + getPointA().getY());
		
	}
	

}
