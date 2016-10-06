package lowLevelSynchronization;

import java.util.LinkedList;

public class LowLevelLocks {
	
	private LinkedList<Integer> list = new LinkedList<Integer>() ;
	final int limit =10;
	private int value=0;
	private Object lock = new Object();
	
	
	public void producer() throws InterruptedException
	{
		synchronized(lock)
		{
			while(true)
			{
				if(list.size() == limit)
				{
					lock.wait();
				}
				else
				{
					System.out.println("Value added : " +list.add(value++));
					lock.notify();
				}
			}
		}
	}
	
	public void consumer() throws InterruptedException
	{
		synchronized(lock)
		{
			while(true)
			{
				
				if(list.isEmpty())
				{
					lock.wait();
				}
				else
				{
				
					System.out.println("First value removed : " +list.removeFirst());
					Thread.sleep(2000);
					lock.notify();
				}
			}
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LowLevelLocks level = new LowLevelLocks();
		
		Thread t1 = new Thread(new Runnable()
				{

					@Override
					public void run() {
						// TODO Auto-generated method stub
						
						try {
							level.producer();
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
					level.consumer();
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
	

	}

}
