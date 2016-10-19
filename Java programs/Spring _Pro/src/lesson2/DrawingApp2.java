package lesson2;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

public class DrawingApp2 {

	public static void main(String[] args) {
	
		
		//Triangle triangle = new Triangle();
		
		//BeanFactory factory = new XmlBeanFactory(new FileSystemResource("spring.xml")); // 1st mtd 
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring2.xml");
		context.registerShutdownHook();
		Triangle2 triangle2 = (Triangle2) context.getBean("triangle2");
	    triangle2.draw1();

	}

}
