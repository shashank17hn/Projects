package lesson7;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp7 {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("spring7.xml");
		
		System.out.println("******************************************");
		
		Triangle2 triangle2 = (Triangle2) context.getBean("triangle2");
		triangle2.draw1();

	}

}
