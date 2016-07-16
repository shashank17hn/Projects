package messageXML;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CommentService {

	DataBase db = new DataBase();
	private Map<Long, MessageModel> message = db.getMessage();
	
	public CommentService()
	{
		long id =1;
		long id2 =2;
		CommentModel cmt = new CommentModel(1,"First comment","abc");
		CommentModel cmt2 = new CommentModel(2,"Second comment","abc");
		Map<Long,CommentModel> comment = message.get(id).getComments();
		comment.put(cmt.getId(),cmt);
		comment = message.get(id).getComments();
		comment.put(cmt2.getId(),cmt2);
		
		CommentModel cmt3 = new CommentModel(1,"First comment","def");
		CommentModel cmt4 = new CommentModel(2,"Second comment","def");
		 comment = message.get(id2).getComments();
		 comment.put(cmt3.getId(),cmt3);
		 comment = message.get(id2).getComments();
		 comment.put(cmt4.getId(),cmt4);
	}
	 
	
	

	public List<CommentModel> getAllComment(long MsgId)
	{
		Map<Long,CommentModel> comment = message.get(MsgId).getComments();
		return new ArrayList<CommentModel>(comment.values());
	}
	
	public CommentModel getComment(long MsgId, long id)
	{
		Map<Long,CommentModel> comment = message.get(MsgId).getComments(); 
		return comment.get(id);
	}
	
	public CommentModel AddComment(long MsgId,CommentModel cmt)
	{
		Map<Long,CommentModel> comment = message.get(MsgId).getComments(); 
		cmt.setId(comment.size()+1);
		comment.put(cmt.getId(), cmt);
		return cmt;
	}
	
	public void DeleteComment(long MsgId, long id)
	{
		Map<Long,CommentModel> comment = message.get(MsgId).getComments(); 
		comment.remove(id);
	}
	
	public CommentModel UpdateComment(long MsgId,CommentModel cmt)
	{
		Map<Long,CommentModel> comment = message.get(MsgId).getComments(); 
		if(cmt.getId()<=0)
		{
			return null;
		}
		else
		{
			comment.put(cmt.getId(), cmt);
			return cmt;
		}
	}
	
	
	
}
