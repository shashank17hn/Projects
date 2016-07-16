package messageXML;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ProfileService {

	
	private Map<String,Profile> profiles = DataBase.getProfile();
	
	public ProfileService()
	{
		profiles.put("abc", new Profile(1, "abc", "abc" , "abc"));
		profiles.put("abc1", new Profile(2, "abc1", "abc1" , "abc1"));
	}
	
	public List<Profile> getAllprofiles()
	{
		return new ArrayList<Profile>(profiles.values());
	}
	
	public Profile AddProfile(Profile prof)
	{
		prof.setId(profiles.size()+1);
		profiles.put(prof.getProfileName(), prof);
		return prof;
	
	}
	
	public Profile UpdateProfile(Profile prof)
	{
		if(prof.getProfileName().isEmpty())
		{
			return null;
		}
		else
		{
			profiles.put(prof.getProfileName(), prof);
			return prof;
		}
	}
	
	public Profile RemoveProfile(String profName)
	{
		return profiles.remove(profName);
	}
}
