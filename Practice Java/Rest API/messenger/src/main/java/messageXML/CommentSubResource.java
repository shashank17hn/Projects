package messageXML;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


@Path("/")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class CommentSubResource {
	
	private CommentService cs = new CommentService();
	
/*	@GET
	@Path("/{commentId}")
	public String show(@PathParam("messageId") long mid, @PathParam("commentId") long cid)
	{
		return "comment id :" + cid + " Msg id : " + mid;
	}*/
	
	@GET
	public List<CommentModel> showAllComments(@PathParam("messageId") long mid)
	{
		return cs.getAllComment(mid);
	}
	
	@GET
	@Path("/{commentId}")
	public CommentModel showComments(@PathParam("messageId") long mid, @PathParam("commentId") long cid)
	{
		return cs.getComment(mid, cid);
	}
	
	@POST
	public CommentModel AddComment(@PathParam("messageId") long mid, CommentModel cmt)
	{
		return cs.AddComment(mid, cmt);
	}
	
	
	
	

}
