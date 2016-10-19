package deadLock;

import java.util.Random;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class DeadLockEX {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Processor ex = new Processor();
		
		Thread t1 = new Thread(new Runnable()
				{
				
					@Override
					public void run() {
						// TODO Auto-generated method stub
						
						ex.firstThread();
					}
			
				});
		
		
		Thread t2 = new Thread(new Runnable()
		{

			@Override
			public void run() {
				// TODO Auto-generated method stub
				
				ex.secondThread();
			}
	
		});

		t1.start();
		t2.start();
		
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Account-1 Balance : " + ex.acc1.getBalance());
		
		System.out.println("Account-2 Balance : " + ex.acc2.getBalance());
		
		System.out.println("Total Balance : " + ( ex.acc1.getBalance() +  ex.acc2.getBalance()));
		
		
	}

}
