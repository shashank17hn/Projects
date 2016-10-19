package lesson5;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class DrawingApp5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("spring5.xml");
		//Triangle2 triangle2 = (Triangle2) context.getBean("triangle2");
	    //triangle2.draw1();
		
		Shape shapes =(Shape) context.getBean("circle");
		shapes.draw1();
		Shape shapes1 =(Shape) context.getBean("triangle2");
		shapes1.draw1();
		
	}

}
