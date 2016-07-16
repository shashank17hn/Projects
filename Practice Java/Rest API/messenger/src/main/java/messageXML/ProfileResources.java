package messageXML;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("profile")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class ProfileResources {
	
	ProfileService ps = new ProfileService();
	
	@GET
	public List<Profile> getAllProfile(){
		return ps.getAllprofiles();
	}

	@POST
	public Profile addProfile(Profile prof)
	{
		return ps.AddProfile(prof);
	}
	
	@DELETE
	@Path("/{profileId}")
	public void DeleteProfile(@PathParam("profileId") String prof)
	{
		ps.RemoveProfile(prof);
	}
	
	@PUT
	@Path("/{profileId}")
	public Profile UpdateProfile(@PathParam("profileId") String prof, Profile profile)
	{
		profile.setProfileName(prof);
		return ps.UpdateProfile(profile);
	}
}
