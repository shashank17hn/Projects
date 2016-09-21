package secondLesson;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Vehical {

	
	@Id @GeneratedValue
	private int vehical_Id;
	private String Vehical_name;
	
	
	@ManyToMany(mappedBy ="vehical")
	private Collection<UserDetails2> user = new ArrayList<UserDetails2>();
	
	public Collection<UserDetails2> getUser() {
		return user;
	}
	public void setUser(Collection<UserDetails2> user) {
		this.user = user;
	}
	public int getVehical_Id() {
		return vehical_Id;
	}
	public void setVehical_Id(int vehical_Id) {
		this.vehical_Id = vehical_Id;
	}
	public String getVehical_name() {
		return Vehical_name;
	}
	public void setVehical_name(String vehical_name) {
		Vehical_name = vehical_name;
	}
	
}
