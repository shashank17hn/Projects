
public class Node {

	private int data;
	public Node next;
	public Node previous;
	
	
	public Node(int data)
	{
		next = null;
		previous = null;
		this.data = data;			
	}
	
	public Node(Node previous, int data, Node next)
	{
		this.next = next;
		this.previous= previous;
		this.data= data;
		
	}

	public int getData() {
		return data;
	}


	
	
}
