package deadLock;

import java.util.Random;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Processor {

	Account acc1 = new Account();
	Account acc2 = new Account();
	private Lock lock1 = new ReentrantLock();
	private Lock lock2 = new ReentrantLock();
	
	public void aquireLock(Lock firstLock , Lock secondLock)
	{
		boolean getfirstLock = false;
		boolean getsecondLock = false;
		
		while(true)
		{
			try{
				getfirstLock = firstLock.tryLock();
				getsecondLock = secondLock.tryLock();
			}
			finally
			{
				if(getfirstLock && getsecondLock)
				{
					return;
				}
				
				else if(getfirstLock)
				{
					firstLock.unlock();
				}
				else if(getsecondLock)
				{
					secondLock.unlock();
				}
					
			}
		}
		
		
	}
	
	
	public void firstThread()
	{
		

		
		

			Random random = new Random();
			
			for(int i=0; i<100 ; i++)
			{
				
				try{
					
					//lock1.lock();  // 1st mthd to avoid deadlock ... locks in serial order in both methods
					//lock2.lock();
					
				aquireLock(lock1, lock2); // 2nd mthd to make a aquire lock function then serialization is not important 
			
				acc1.transfer(acc1, acc2, random.nextInt(100));
			
				}
				finally{
					lock1.unlock();
					lock2.unlock();
				
				}
			
		   }
		
		
	
		
		
	}
	
	public void secondThread()
	{
	
		
		
			Random random = new Random();
			for(int i=0; i<100 ; i++)
			{
				try{
					

					// lock1.lock(); // Dead lock occurs when --lock2.lock();
					// lock2.lock(); // lock is reversed      --lock1.lock();  [both thread lock for each other lock]
				     
				aquireLock(lock2, lock1); // method 2
				acc2.transfer(acc2, acc1, random.nextInt(100));
				}
				finally{
					lock1.unlock(); // Dead lock occurs when --lock2.lock();
					lock2.unlock(); // lock is reversed      --lock1.lock();  [both thread lock for each other lock]
				}
			
			}
		    
	
	
		
		
		
	}
	
	
	
}
