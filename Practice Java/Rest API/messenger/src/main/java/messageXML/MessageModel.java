package messageXML;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

@XmlRootElement
public class MessageModel {


 private long id;
 private String message;
 private Date created;
private String aurthor;
 private Map<Long,CommentModel> comments = new HashMap<>();
 
 public MessageModel()
 {
	 
 }
 
 public MessageModel(long id, String message, String aurthor)
 {
	 this.id = id;
	 this.aurthor = aurthor;
	 this.message = message;
	 this.created = new Date();
 }
 
public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}
public String getMessage() {
	return message;
}
public void setMessage(String message) {
	this.message = message;
}
public Date getCreated() {
	return created;
}
public void setCreated(Date created) {
	this.created = created;
}
public String getAurthor() {
	return aurthor;
}
public void setAurthor(String aurthor) {
	this.aurthor = aurthor;
}

@XmlTransient
public Map<Long, CommentModel> getComments() {
	return comments;
}

public void setComments(Map<Long, CommentModel> comments) {
	this.comments = comments;
}
 	
}
