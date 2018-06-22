package queue.using.two.stacks;

import java.util.Stack;

public class Queue<E> {
	
	private Stack<E> stack1 = new Stack<>();
	private Stack<E> stack2 = new Stack<>();



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
