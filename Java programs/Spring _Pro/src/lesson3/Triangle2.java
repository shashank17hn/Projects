package lesson3;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Triangle2 implements InitializingBean, DisposableBean {
	private Point pointA;
	private Point pointB;
	private Point pointC;
	
	public Point getPointA() {
		return pointA;
	}
	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}
	public Point getPointB() {
		return pointB;
	}
	public void setPointB(Point pointB) {
		this.pointB = pointB;
	}
	public Point getPointC() {
		return pointC;
	}
	public void setPointC(Point pointC) {
		this.pointC = pointC;
	}
	
	public void draw1()
	{
		System.out.println("Point A : " + getPointA().getX()+ " , " + getPointA().getY());
	    System.out.println("Point B : " + getPointB().getX()+ " , " + getPointB().getY());
		System.out.println("Point C : " + getPointC().getX()+ " , " + getPointC().getY());
	}
	
	public void myInit()
	{
		
		System.out.println("My Init method is called for triangle");
		System.out.println("#############################");
		
	}
	
	public void cleanUp()
	{
		System.out.println("#############################");
		System.out.println("Clean up method is called for triangle");
	}
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Initialization Done");
		
	}
	@Override
	public void destroy() throws Exception {
		System.out.println("Disposal Done");		
	}
	
	
}
