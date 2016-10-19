package lesson6;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import lesson5.Shape;


public class DrawingApp6 { 

	public static void main(String[] args) {

		
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring6.xml");
		Shape6 shapes =(Shape6) context.getBean("circle");
		//Shape6 shapes2 =(Shape6) context.getBean("listener");
		shapes.draw1();
		context.registerShutdownHook();
	    // Shape shapes1 =(Shape) context.getBean("triangle2");
	   // shapes1.draw1();

	}

}
