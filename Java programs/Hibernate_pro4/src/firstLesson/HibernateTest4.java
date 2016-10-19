package firstLesson;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import firstLesson.UserDetails4;

public class HibernateTest4 {

	public static void main(String[] args) {
		
	

	
		       
    
       
     /* for(int i=0; i<10; i++)
       {
    		UserDetails4 user = new UserDetails4();     
    		user.setUserName("User" + i);
    		ses.save(user);
       } */
       //for insertion 
       
     	  /* UserDetails4 user = (UserDetails4)ses.get(UserDetails4.class, 6);
           System.out.println("User retrived is " + user.getUserName()); */
          // for fetching directly without HQL
       
       //Query query = ses.createQuery("from UserDetails4");
       //  String min = "5";
       //  String name = "User9";
       
       //Query query = ses.getNamedQuery("UserDetail.byId");
      // query.setInteger(0, 2);
      /* Query query = ses.createQuery("select userName from UserDetails4 where userId > ? and userName =?");
       query.setInteger(0, Integer.parseInt(min));
       query.setString(1, name); */ 
       // METHOD 1
       
      /* Query query = ses.createQuery("select userName from UserDetails4 where :userId > userId and userName = :userName");
       query.setInteger("userId", Integer.parseInt(min));
       query.setString("userName", name); */ 
       // METHOD 2
       
       // query.setFirstResult(5);
      //  query.setMaxResults(4);
       //Query query = ses.createQuery("from UserDetails4 where userId >5");
       //   List user =  query.list();
      //  List<UserDetails4> user = (List<UserDetails4>)query.list();
       
		
		 // System.out.println("Size of the table = "+ user.size());
		
		   SessionFactory sf = new Configuration().configure().buildSessionFactory();
	       Session ses = sf.openSession();
	       ses.beginTransaction();
      
         Query query = ses.createQuery("from UserDetails4");
          List<String> user = (List<String>) query.list();
          ses.getTransaction().commit();
          ses.close();
         
		for(String u : user)
		{
			System.out.println(u);
		}

    
      
	}

}
