
public class Main_DoublyList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Doubly_List dl = new Doubly_List();
		dl.insertFront(2);
		dl.insertFront(3);
		dl.print();
		dl.insertBack(7);
		dl.insertBack(8);
		dl.print();
		dl.deleteFront();
		dl.print();
		dl.deleteBack();
		dl.print();
		dl.insertAt(9,2);
		dl.print();
		dl.deleteAt(3);
		dl.print();
	}

}