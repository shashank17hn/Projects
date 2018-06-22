package queue.using.two.stacks;

import java.util.Stack;

public class Queue<E> {
	
	private Stack<E> stack1 = new Stack<>();
	private Stack<E> stack2 = new Stack<>();

	/*
	enqueue wont be a problem it will be as it is. But dequeue will be little different . 
	Need to put every element in stack2 and then pop it from stack2 so that the order will be reversed and right element will pop */


	public void enQueue(E item) {
		stack1.push(item);
	}
	
	public E deQueue() {
		if(stack2.isEmpty()) {
			while(!stack1.empty())
			stack2.push(stack1.pop());
		}
	    return stack2.pop();
	} 
	

}
