
public class Main_LinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Linked_List ll = new Linked_List();
		ll.insert(1);
		ll.insert(2);
		ll.insert(3);
		ll.insert(4);
		ll.insert(5);
		ll.print();
		
		Linked_List l2 = new Linked_List();
		l2.insert(6);
		l2.insert(7);
		l2.insert(8);
		l2.insert(9);
		l2.insert(10);
		l2.print();
		
		Linked_List l3 = new Linked_List();
		l3.MargeAlt(ll.head, l2.head);
		ll.print();
		l2.print();
		
	/*	Linked_List l2 = new Linked_List();
		l2.insert(1);
		l2.insert(2);
		l2.insert(3);
		l2.insert(4);
		l2.insert(5);
		
		l2.print();
		
		Linked_List l3 = new Linked_List();
		l3.compare(ll.head, l2.head);
		l3.print();
		
	 */	
		//ll.delete();
		//ll.delete();
	   //	ll.print();
		
		//--------------------------------------------
		
		// Reverse
		//ll.reverse();
	   //  ll.reverseUtil(ll.head, null);
		//ll.print();
	
		//------------------------------------------------
		
 
        // Creating loop
		
		//ll.head.next.next.next.next.next = ll.head.next.next;
		
		//ll.DetectAndRemoveLoop();
		//ll.print();
		
       
    
		
	
		

	}

}
