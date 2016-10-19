package interruptingThreadInExecutor;

import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class InterruptingThreadEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ExecutorService ex = Executors.newCachedThreadPool();
		
		Future<?> fue = ex.submit(new Callable<Void>()
				
				{

					@Override
					public Void call() throws Exception {
						
						System.out.println("Started ....");
						Random ran = new Random();
						
						for(int i=0; i<1E8; i++)
						{
							
							Math.sin(ran.nextDouble());
							if(Thread.currentThread().isInterrupted())
							{
								System.out.println("Interrupted !!!");
								break;
							}
						}
						
						
						return null;
					}
			
				}); 
		
		  ex.shutdown();
		  
		  try {
			  Thread.sleep(500);
			  
			//  fue.cancel(true);  method 1
			  ex.shutdownNow();   // method 2
			  
			ex.awaitTermination(1, TimeUnit.DAYS);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		  
		  System.out.println("Finished");
		
	}

}
