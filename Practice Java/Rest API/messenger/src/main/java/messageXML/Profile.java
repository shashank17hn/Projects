package messageXML;

import java.util.Date;

public class Profile {
	
	private long id;
	private String profileName;
	private String FirstName;
	private String LastName;
	
	public Profile(long id, String profileName, String FirstName, String LastName)
	{
		this.id = id;
		this.profileName = profileName;
		this.FirstName = FirstName;
		this.LastName = LastName;
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getProfileName() {
		return profileName;
	}
	public void setProfileName(String profileName) {
		this.profileName = profileName;
	}
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public Date getCreated() {
		return created;
	}
	public void setCreated(Date created) {
		this.created = created;
	}
	private Date created; 

}