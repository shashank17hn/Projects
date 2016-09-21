package lesson4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrwaingApp4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("spring4.xml");
		Triangle2 triangle2 = (Triangle2) context.getBean("triangle2");
	    triangle2.draw1();

	}

}
