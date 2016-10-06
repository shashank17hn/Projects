package reEntrantLock;

import java.util.Scanner;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ReEntrantLockEx {
	
	
	private static int counter =0;
	
	private static Lock lock = new ReentrantLock();
	Condition cond = lock.newCondition();
	
	public void increment()
	{
		for(int i=0 ; i<1000; i++)
		{
			counter ++;
		}
		
	}
	
	public void method1() throws InterruptedException
	{
		lock.lock();
		System.out.println("Thread : "+Thread.currentThread().getId());
		System.out.println("waiting....");
		cond.await();             // it just works like wait
		try{
			increment();
			System.out.println("Increment from : "+Thread.currentThread().getId() + ", Counter value : " + counter);
		}
		finally{
			lock.unlock();
		}
		
	}
	
	public  void method2() throws InterruptedException
	{
		
		Thread.sleep(1000);
		lock.lock();
		System.out.println("Thread : "+Thread.currentThread().getId());
		System.out.println("To signal awaited lock");
		new Scanner(System.in).nextLine();
		cond.signal();           // it just work like notify
		
		try{
			increment();
			System.out.println("Increment from : "+Thread.currentThread().getId() + ", Counter value : " + counter);
		}
		finally{
			lock.unlock();
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ReEntrantLockEx ex = new ReEntrantLockEx();
		
		Thread t1 = new Thread(new Runnable()
				{

					@Override
					public void run() {
						// TODO Auto-generated method stub
						
						try {
							ex.method1();
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						
					}
			
				});

		Thread t2 = new Thread(new Runnable()
		{

			@Override
			public void run() {
				// TODO Auto-generated method stub
				
				try {
					ex.method2();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
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
		
		
		System.out.println("counter : " + counter );
		
		
	}

}
