package linkedList_stack;

public class Main_Stack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ll_stack ll = new ll_stack();
		ll.push(4);
		ll.push(3);
		ll.push(2);
		ll.push(1);
		
		ll.print();
	
		ll.pop();
		ll.pop();
		ll.print();

	}

}