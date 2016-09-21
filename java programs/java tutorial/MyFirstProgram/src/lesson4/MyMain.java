package lesson4;
import java.util.ArrayList;

public class MyMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank bank1 = new BankAbc();
		int ans = bank1.interest();
		System.out.println(ans);
		
		ArrayList<Integer> mylist = new ArrayList<Integer>(5);
		
		mylist.add(1);
		mylist.add(2);
		mylist.add(3);
		mylist.add(22);
		mylist.add(100);
		
		for (int X : mylist)
		{
			System.out.println(X);
			
		}
		
		System.out.println("Size of array " +mylist.size());
		
		mylist.remove(2);
		
		for (int X : mylist)
		{
			System.out.println(X);
			
		}
		System.out.println("Size of array2 " +mylist.size());
		mylist.trimToSize();
		System.out.println("Size of array2 " +mylist.size());
		
		mylist.set(3, 50);
		
		
		
		

	}

}
