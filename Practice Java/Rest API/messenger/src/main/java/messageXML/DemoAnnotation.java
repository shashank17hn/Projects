package messageXML;

import javax.ws.rs.BeanParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.CookieParam;
import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.MatrixParam;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.UriInfo;

@Path("demo")
@Consumes(MediaType.TEXT_PLAIN)
@Produces(MediaType.TEXT_PLAIN)
public class DemoAnnotation {
	
	@GET
	@Path("param")
	public String demo(@BeanParam FilterBean fitbean) // another way to access all the params by storing them in class
	{
		return " Matrix Param : " + fitbean.getMatrix() + " Header Param : " + fitbean.getHeader() + " Cookie Param : " + fitbean.getCookie();
	}
	
	@GET
	@Path("context")
	public String demo2(@Context UriInfo info,
						@Context HttpHeaders header)
	{
		String path = info.getAbsolutePath().toString();
		String headerValue = header.getCookies().toString();
		return " path : " + path + " Cookies " + headerValue;
	}
	
	
	
	
	
	

}
