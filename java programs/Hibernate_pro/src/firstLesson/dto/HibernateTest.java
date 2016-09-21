package firstLesson.dto;



import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import firstLesson.dto.UserDetails;

public class HibernateTest {

	public static void main(String[] args) {
		
		UserDetails user = new UserDetails();

		user.setUserName("First Name");
		user.setJoindate(new Date());
		
		Address ad = new Address();
		ad.setCity("Fresno");
        ad.setState("CA");	 
       

		Address ad1 = new Address();
		ad1.setCity("Los Angels");
        ad1.setState("CA");	
        user.getListofAddress().add(ad);
        user.getListofAddress().add(ad1);
        
       
      
        
        
       SessionFactory sf = new Configuration().configure().buildSessionFactory();
      Session ses = sf.openSession();
      ses.beginTransaction();
      ses.save(user);
      ses.getTransaction().commit();
		

      user = null;
      ses.beginTransaction();
      user = (UserDetails) ses.get(UserDetails.class, 1);
      System.out.println("Retrived Data" + user.getUserName());
      
	}

}
