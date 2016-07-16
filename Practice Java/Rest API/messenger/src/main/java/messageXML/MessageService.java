package messageXML;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Map;

public class MessageService {

	DataBase db = new DataBase(); 
	private Map<Long, MessageModel> message = db.getMessage();
	
	public MessageService(){
		message.put(1l, new MessageModel(1,"abc","First Message"));
		message.put(2l, new MessageModel(2,"def","Second Message"));
		
	}
	
	public MessageModel getMessage(long id) {
		return message.get(id);
	}

	public List<MessageModel> getMessageByYear(int year)
	{
		List<MessageModel>MessageYear  = new ArrayList<>();
		Calendar cal = Calendar.getInstance();
		for(MessageModel msg: message.values())
		{
			cal.setTime(msg.getCreated());
			if(cal.get(Calendar.YEAR)== year )
			{
				MessageYear.add(msg);
			}
		}
		return MessageYear;
	}
	
	public List<MessageModel> MessagePaginated(int start, int size)
	{
		ArrayList<MessageModel> list = new ArrayList<MessageModel>(message.values());
		if(start +size > list.size())
		{
			return new ArrayList<MessageModel>();
		}
		
		return list.subList(start, start+size);
		
	}
	
	public void setMessage(Map<Long, MessageModel> message) {
		this.message = message;
	}

	public List<MessageModel> gelAllMessage()
	{
		return new ArrayList<MessageModel>(message.values());
		
	}
	
	public MessageModel addMessage(MessageModel msg)
	{
		msg.setId(message.size()+1);
		message.put(msg.getId(), msg);
		return msg;
	}
	
	public MessageModel removeMessage(long id)
	{
		return message.remove(id);
		
	}
	
	public MessageModel updateMessage(MessageModel msg)
	{
	
		if(msg.getId()<=0)
		{
			return null;
		}
		else
		{
			message.put(msg.getId(), msg);
			return msg;
		}
	}

}
