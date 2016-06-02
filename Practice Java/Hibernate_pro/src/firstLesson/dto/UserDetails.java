package firstLesson.dto;

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
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity 
@Table (name = "USER_DETAILS")
public class UserDetails {
	
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	@Column (name = "User_ID")
	private int userId;
	private String userName;
	private Date Joindate;
	//@Embedded
	//private Address address;
	@ElementCollection
	private Set<Address> listofAddress = new HashSet();
	
	
	public Set<Address> getListofAddress() {
		return listofAddress;
	}
	public void setListofAddress(Set<Address> listofAddress) {
		this.listofAddress = listofAddress;
	}
	
	public Date getJoindate() {
		return Joindate;
	}
	@Temporal(TemporalType.DATE)
	public void setJoindate(Date joindate) {
		Joindate = joindate;
	}
	
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	@Column (name = "User_Name")
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	} 
	

}
