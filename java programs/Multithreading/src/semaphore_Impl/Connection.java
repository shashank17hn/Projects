package semaphore_Impl;

import java.util.concurrent.Semaphore;

public class Connection {
	
	private int connected=0;
	
	Semaphore sema = new Semaphore(10,true); // true is for enabling the thread to do process in ORDER the aquired lock
	
	
	public void connect()
	{
		  try {
				sema.acquire();
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		  
		  try{
			  DoConnect();
		  }
		  
		  finally{

				sema.release();
		  }
	}
	
	public void DoConnect()
	{
		
		
		synchronized(this)
		{
          
			connected++;
			System.out.println("Thread Connected : " +  Thread.currentThread().getId() +  " Connection Number :  " +connected );
			
			
		}
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		synchronized(this)
		{
			connected--;
			
		}
	}

}
