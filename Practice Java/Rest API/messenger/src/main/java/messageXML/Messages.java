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
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("messages")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class Messages {
	
	MessageService ms = new MessageService();

	@GET
	public List<MessageModel> showMessage(@QueryParam("year") int year,
										  @QueryParam("start") int start,
										  @QueryParam("size") int  size )
	{
		if(year>0)
		{
			return ms.getMessageByYear(year);
		}
		if(start>=0 && size>0)
		{
			return ms.MessagePaginated(start, size);
		}
		return ms.gelAllMessage();
	}
	
	@POST
	public MessageModel newMessage(MessageModel msg)
	{
		return ms.addMessage(msg);
	}
	
	@PUT
	@Path("{messageId}")
	public MessageModel updateMessage(@PathParam("messageId") long id, MessageModel msg)
	{
		msg.setId(id);
		return ms.updateMessage(msg);
	}
	
	@GET
	@Path("{messageId}")
	public MessageModel getMessages(@PathParam("messageId") long id)
	{
		return ms.getMessage(id);
	}

	@DELETE
	@Path("{messageId}")
	public void deleteMessage(@PathParam("messageId") long id)
	{
		ms.removeMessage(id);
	}
	
	
	@Path("/{messageId}/comments")
	public CommentSubResource getcomment()
	{
		return new CommentSubResource();
	}

}
