package secondLesson;




import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity 
@Table (name = "USER_DETAILS2")

public class UserDetails2 {
	
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	
	private int userId;


	private String userName;
    @ManyToMany	
	private Collection<Vehical> vehical = new ArrayList<Vehical>();

	public Collection<Vehical> getVehical() {
		return vehical;
	}
	public void setVehical(Collection<Vehical> vehical) {
		this.vehical = vehical;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	
	
	

}
