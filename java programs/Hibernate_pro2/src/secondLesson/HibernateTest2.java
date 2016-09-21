package secondLesson;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		UserDetails2 user = new UserDetails2();
		user.setUserName("First");
		
		Vehical veh = new Vehical();
		veh.setVehical_name("car");
		
		Vehical veh2 = new Vehical();
		veh2.setVehical_name("Jeep");
		
		user.getVehical().add(veh);
		user.getVehical().add(veh2);
		veh.getUser().add(user);
		veh2.getUser().add(user);
		
		
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session ses = sf.openSession();
		ses.beginTransaction();
		ses.save(user);
		ses.save(veh);
		ses.save(veh2);
		ses.getTransaction().commit();
		
		
		

	}

}
