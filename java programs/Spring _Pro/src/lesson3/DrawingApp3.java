package lesson3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// TODO Auto-generated method stub
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring3.xml");
		context.registerShutdownHook();
		Triangle2 triangle2 = (Triangle2) context.getBean("triangle2");
	    triangle2.draw1();
	}

}
