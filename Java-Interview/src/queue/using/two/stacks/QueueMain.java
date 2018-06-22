package queue.using.two.stacks;

public class QueueMain {

	public static void main(String[] args) {
		
		Queue<Integer> queue = new Queue<>();
		queue.enQueue(1);
		queue.enQueue(2);
		queue.enQueue(3);
		queue.enQueue(4);
		
		System.out.println(queue.deQueue());
		System.out.println(queue.deQueue());
		System.out.println(queue.deQueue());
		System.out.println(queue.deQueue());
		
		

	}

}
