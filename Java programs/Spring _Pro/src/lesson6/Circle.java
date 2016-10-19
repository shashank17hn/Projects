package lesson6;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

//@Component
//@Service
public class Circle implements Shape6 {

private Point center;
	
	public Point getCenter() {
	return center;
}

	//@Autowired
	//@Qualifier("CircleRelated")
	//@Resource(name = "point3")
	
	@Resource     // looks for variable "center" in XML file
	public void setCenter(Point center) {
	this.center = center;
}
    @PostConstruct
	public void circle_initialize()
	{
		System.out.println("Circle intitialized");
	}
	
    @PreDestroy
	public void circle_destroy()
	{
		System.out.println("Circle destroy");
	}



	@Override
	public void draw1() {
		System.out.println("Circle is Drawn");
		System.out.println("Point A : " + getCenter().getX()+ " , " + getCenter().getY());
		
	}

}
