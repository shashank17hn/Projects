package linkedList_stack;

import java.util.LinkedList;

public class ll_stack {
	
	LinkedList<Integer> ll = new LinkedList<Integer>();
	public void push(int item)
	{
	
		ll.addLast(item);

	}
	
	public void pop()
	{
		ll.removeLast();
	}
	
	public void print()
	{
		System.out.print(ll);
	}
	
}
