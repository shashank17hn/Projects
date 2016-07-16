package messageXML;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class CommentModel {
	
	public CommentModel()
	{
		
	}

	private long id;
	private String comment;
	private Date created;
	private String author;
	
	public CommentModel(long id, String comment, String author)
	{
		this.id = id;
		this.author= author;
		this.comment= comment;
		this.created = new Date();
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public Date getCreated() {
		return created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	
}
