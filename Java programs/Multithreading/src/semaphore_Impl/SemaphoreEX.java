package semaphore_Impl;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class SemaphoreEX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ExecutorService ex =  Executors.newCachedThreadPool();
		Connection con = new Connection();
		
		for(int i=0; i<200 ; i++)
		{
			ex.submit(new Runnable()
					{

						@Override
						public void run() {
							// TODO Auto-generated method stub
							
							con.connect();
						}
				
					});
			
		}
		ex.shutdown();
		try {
			ex.awaitTermination(1, TimeUnit.HOURS);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
