package multipleLocks;

import java.util.List;
import java.util.Random;
import java.util.ArrayList;

public class LocksEX {

	
	private List<Integer> list1 = new ArrayList<Integer>();
	private List<Integer> list2 = new ArrayList<Integer>();
	
	Random random = new Random();
	
	
	public synchronized void  Add1()
	{
		try {
			Thread.sleep(1);
			list1.add(random.nextInt(100));
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public synchronized void Add2()
	{
		try {
			Thread.sleep(1);
			list2.add(random.nextInt(100));
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public void processes()
	{
		for(int i=1; i<=1000 ; i++)
		
			{
			Add1();
			Add2();
			}
		
		System.out.println("List1 Size : " + list1.size());
		System.out.println("List2 Size : " + list2.size());
	}
	
	
	//----------------------------------  Lock Mechanism -------------------------------
	
	private Object lock1 = new Object();
	private Object lock2 = new Object();
	
	public void  AddL1()
	{
		
		synchronized(lock1)
		{
			try {
				Thread.sleep(1);
				list1.add(random.nextInt(100));
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public void AddL2()
	{
		synchronized(lock2)
		{
			try {
				Thread.sleep(1);
				list2.add(random.nextInt(100));
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	
	public void processesL()
	{
		for(int i=1; i<=1000 ; i++)
		
			{
			AddL1();
			AddL2();
			}
		
		System.out.println("List1 Size : " + list1.size());
		System.out.println("List2 Size : " + list2.size());
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LocksEX l1 = new LocksEX();
		LocksEX l2 = new LocksEX();
		LocksEX l3 = new LocksEX();
		
		System.out.println("Processes Begins ...");
		long start = System.currentTimeMillis();
		
		l1.processes();
		
		long stop = System.currentTimeMillis();
		
		System.out.println("Time taken : " + (stop-start));
		
		//--------------------------- using threads -----------------------------------
		
		
		Thread t1 = new Thread(new Runnable()
				{

					@Override
					public void run() {
						l2.processes();
						
					} 
			
				});
		
		Thread t2 = new Thread(new Runnable()
		{

			@Override
			public void run() {
				l2.processes();
				
			} 
	
		});
		
		System.out.println(" Thread Processes Begins ...");
		long start1 = System.currentTimeMillis();
		
		t1.start();
		t2.start();
		
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	
		
		long stop1 = System.currentTimeMillis();
		
		System.out.println("Time taken : " + (stop1-start1));
		
		//---------------------------------------- threads using lock --------------------
		
		Thread t3 = new Thread(new Runnable()
		{

			@Override
			public void run() {
				l3.processesL();
				
			} 
	
		});

	   Thread t4 = new Thread(new Runnable()
				{
				
					@Override
					public void run() {
						l3.processesL();
						
					} 
				
				});
				
				System.out.println(" Thread Processes Begins ...");
				long start2 = System.currentTimeMillis();
				
				t3.start();
				t4.start();
				
				try {
					t3.join();
					t4.join();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				
				
				long stop2 = System.currentTimeMillis();
				
				System.out.println("Time taken : " + (stop2-start2));
		
		
		
		
				
		
		
	}

}
