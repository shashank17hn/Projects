
public class Linked_List {
	
	public Nodes head;
	private int size=0;

	Linked_List()
	{
		head=null;
	}
	  
	public void insert(int item)    // insert 
	{
		Nodes node1 = new Nodes(item);
		node1.next = head;
		head = node1;
		size++;
	}
	
	public void compare(Nodes List1, Nodes List2)
	{
	
		while(List1 != null && List2 != null)
		{
			if(List1.getData() == List2.getData())
			{ 
				
				System.out.print("| Match ");
				List1 = List1.next;
				List2= List2.next;
				
				
			 }
			
			else
			{ 
				System.out.print("|MisMatch");
				List1 = List1.next;
				List2= List2.next;
			}
		}
	}
	
	/*public Nodes reverseKey(Nodes head1,int Key)
	{
		Nodes Front = null;
		Nodes current = head;
		Nodes Back = null;
		int count =0;
		while(count < Key && current != null)
		{
			Front = current.next;
			current.next = Back;
			Back= current;
			current = Front;
			count++;
		}
		if(Front!=null)
		{
			head.next = reverseKey(Front,Key);
		}
		head = Back;
		return Back;
	}
	*/
	
	public void MargeAlt(Nodes List1, Nodes List2)
	{
	   Nodes tlist1 , tlist2;
	  
	   
	   while(List1 != null && List2 != null)
	   {
		   tlist1 = List1.next;
		   tlist2 = List2.next;
		   
		   List1.next = tlist2;
		   List2.next = tlist1;
		   
		   List1 = tlist1;
		   List2 = tlist2;
	   }
	   
		
	}
	public void reverse()
	{
		Nodes front = null;
		Nodes current = head;
		Nodes back = null;
		
		while(current!= null)
		{
			front = current.next;
			current.next = back;
			back = current;
			current = front;
			
		}		
		head = back;		
	}
	
	public void reverseUtil(Nodes current, Nodes back)      // recursive
	{
		if(current.next == null)
		{
			head = current;
			current.next= back;
			return;
		}
		
		Nodes front = current.next;
		current.next = back;
		reverseUtil(front, current);
		
		
	}
	
	
	public boolean delete()                             // delete
	{
		if(head==null)
			{ 
			return false;
			}
		else
		{
		  head = head.next;
		  size--;
		  return true;
		}
	}
	
	public void DetectAndRemoveLoop()                      // Loop remove
	{
		Nodes slow = head;
		Nodes fast = head.next;
		
		while(fast!=null && fast.next!= null)
		{
			if(slow == fast)
				break;
			slow = slow.next;
			fast = fast.next.next;
		}
		
		if(slow == fast)
		{
			slow = head;
			while(slow != fast.next)
			{
				slow = slow.next;
				fast = fast.next;
			}
			fast.next = null;
		}
		
		
		
	}
	
	
	public void print()
	{ 
		Nodes current = head;
		while(current != null)
		{
			System.out.print(" | " +current.getData());
			current = current.next;
		}
		System.out.println();
	}
}
