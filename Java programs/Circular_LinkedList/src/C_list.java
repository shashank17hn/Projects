
public class C_list {

	public Node head;
	private int count;
	
	public C_list()
	{
		head = null;
		count =0;
		
	}
	
	public void insert(int item)
	{
		if(head == null)
		{
			Node link = new Node(null,item,null);
			head = link;
			head.next = head.previous;
			
			count++;
		}
		else
		{
			Node link = new Node(head,item,head);
			
		    head.previous = link;
		   // head.next= link;
			
			head = link;
			count++;
		}
	}
	
	public void print()
	{
		Node current = head;
		do
		{
		     	  System.out.println(current.getdata());
				  current = current.next;
				 // count--;
				
		}
		while(current!= head);
		
	}
}
