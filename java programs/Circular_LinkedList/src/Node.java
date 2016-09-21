
public class Node {
	
	public Node next= null;
	public Node previous = null;
	private int data;
	
	public Node(Node previous, int data, Node next)
	{
		this.data = data;
		this.next = next;
		this.previous = previous;
		
	}
	
	public int getdata()
	{
		return data;
	}
	

}
