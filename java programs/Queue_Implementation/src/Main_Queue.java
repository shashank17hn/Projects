
public class Main_Queue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Queue queue = new Queue();
		queue.enque(2);
		queue.enque(3);
		queue.enque(4);
		
		queue.print();
		
		queue.dequeue();
	  queue.print();
	  queue.dequeue();
	  queue.print();
	  queue.dequeue();
	  queue.print();
	  queue.dequeue();
		
	}

}
