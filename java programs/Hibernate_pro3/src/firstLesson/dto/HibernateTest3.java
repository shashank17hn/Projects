package firstLesson.dto;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class HibernateTest3 {

	public static void main(String[] args) {
		
	
		Vehical vehical = new Vehical();
		vehical.setVehical_name("Car");
		
		TwoWheeler two = new TwoWheeler();
		two.setVehical_name("Bike");
		two.setSteeringHandle("It uses handle");
		
		FourWheeler four = new FourWheeler();
		four.setVehical_name("Jeep");
		four.setSteeringWheel("It uses wheel");
		       
       SessionFactory sf = new Configuration().configure().buildSessionFactory();
       Session ses = sf.openSession();
       ses.beginTransaction();
       ses.save(vehical);
       ses.save(two);
       ses.save(four);
       ses.getTransaction().commit();
		

    
      
	}

}
