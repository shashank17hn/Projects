
public class Main_Circular {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Circular cir = new Circular();
		cir.enqueue(1);
		cir.enqueue(2);
		cir.enqueue(3);
		cir.enqueue(4);
		cir.enqueue(5);
	//	cir.enqueue(6);
		cir.print();
		System.out.println(cir.dequeue());
		cir.enqueue(6);
		cir.print();
		//System.out.println(cir.dequeue());
		//cir.enqueue(7);
	//	cir.print();
	}

}
