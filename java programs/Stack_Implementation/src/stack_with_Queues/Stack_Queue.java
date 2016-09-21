package stack_with_Queues;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class Stack_Queue {
	
	Queue<Integer> queue = new LinkedList<Integer>();
	Queue<Integer> Temp = new LinkedList<Integer>();
	
	public void push(int item)
	{
		int temp_size;
		if(queue.size()==0)
		{
			queue.add(item);
		}
		else
		{
		
			temp_size = queue.size() ;
			for(int i=0;i<temp_size;i++)
			{
				Temp.add(queue.remove());
			}
			
			queue.add(item);
			
			for(int i=0;i<temp_size;i++)
			{
				queue.add(Temp.remove());
			}
			
		}
	}
	
	public void print()
	{
		System.out.println(queue);
	}
	
	public void pop()
	{
		if(queue.size()==0)
		{
			System.out.println("Queue is empty");
		}
		else
		{	
			
			queue.remove();
			
		}
	}
	
	public void printALL()
	{
		if(queue.size()==0)
		{
			System.out.println("Queue is empty");
		}
		
		else
		{
			Iterator it = queue.iterator();
			while(it.hasNext())
			{
				System.out.println(it.next());
			}
		}
	}
	

}
