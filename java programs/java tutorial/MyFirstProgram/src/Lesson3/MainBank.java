package Lesson3;

import java.util.LinkedList;

public class MainBank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			int x= 100/0;
		}
		catch(Exception e)
		{
			System.out.println(e);
			
		}
		finally {
			System.out.println("This is final");
			
			
		}
		
		Bank bank1 = new BankABC();
		int ans= bank1.interest();
		System.out.println(ans);
		
		LinkedList<String> link = new LinkedList();
		
		link.add("abc");
		link.addFirst("def");
		link.addLast("obj");
		
		for(String X : link)
		{
			System.out.println(X);
		}
		
		link.add(2, "index");
		link.remove(2);
		

	}

}
