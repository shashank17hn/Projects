package volatile_Impl;

import java.util.Scanner;

class Processor extends Thread{
	
	private  boolean status = true;
	
	public void run()
	{
		while(status)
		{
			System.out.println("Hello from :" + currentThread().getId());
		}
	}
	
	public void shutdown()
	{
		status= false;
	}
}

public class VolatileEX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Processor p1 = new Processor();
		Processor p2 = new Processor();
		p1.start();
		p2.start();
		
		Scanner scan = new Scanner(System.in);
		scan.nextLine();
		
		p1.shutdown();
	   // p2.shutdown();
		

	}

}
