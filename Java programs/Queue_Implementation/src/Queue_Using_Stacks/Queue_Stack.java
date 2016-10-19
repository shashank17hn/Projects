package Queue_Using_Stacks;

import java.util.Iterator;
import java.util.Stack;



public class Queue_Stack {
	
	Stack<Integer> stack = new Stack<Integer>();
	Stack<Integer> temp = new Stack<Integer>();
	
	public void Enqueue(int item)
	{
		temp.push(item);
		//
	}
	
	public void Dequeue()
	{
		
		stack.pop();
			
	}
	
	public void transfer()
	{
		
			int t_size;
			t_size = temp.size();
			
			for(int i=0;i<t_size;i++)
			{
				stack.push(temp.pop());	
			}
		
	}
	
	public void print()
	{
		
		if(temp.size()==1)
		{
			System.out.println(temp);
		}
		if(temp.size()==0 && stack.size()==0)
		{
			System.out.println("Stack is Empty 2" );
		}
		else
		{
			transfer();
			System.out.println(stack);
			
			/*

			Iterator it = stack.iterator();
			while(it.hasNext())
			{
				System.out.println(it.next());
			}*/
			
		}
		
	}
	
	
	

}
