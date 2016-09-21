package lesson2;

import java.util.List;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import lesson2.Point;

public class Triangle2 implements InitializingBean , DisposableBean{

	private List<Point> points;
	
	
	public List<Point> getPoints() {
		return points;
	}


	public void setPoints(List<Point> points) {
		this.points = points;
	}


	public void draw1()
	{
		for(Point point: points)
		{
			System.out.println("Point : " + point.getX()+ " , " + point.getY());
		}
	
	}


	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Initialization Done");
		System.out.println("******************************");
		
		
	}


	@Override
	public void destroy() throws Exception {
		System.out.println("******************************");
		System.out.println("Disposed");
		
	}
}

