package ExecuterService_Impl;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;


class Processor implements Runnable
{

	@Override
	public void run() {
		
		
		System.out.println("Process Started by : " + Thread.currentThread().getId());
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Process Stoped by : " + Thread.currentThread().getId());
		
	}
	
}






public class ExecuterServiceEX {
	

	public static void main(String[] args) {

		
		
		ExecutorService ex = Executors.newFixedThreadPool(4);  // as no of threads increases it takes less time.
		
		for(int i=0 ; i<5; i++)
		{
			ex.submit(new Processor());
		}
		
		System.out.println("All task submitted");
		ex.shutdown();
		
		long start = System.currentTimeMillis();
		
	
		
		try {
			ex.awaitTermination(1, TimeUnit.HOURS);  // this block is similar to join . 
		} catch (InterruptedException e) {           // if want to execute next lines after thread execution
			// TODO Auto-generated catch block       // then include this.
			e.printStackTrace();
		}
		
		System.out.println("All task Completed");
		
		long stop = System.currentTimeMillis();
		
		System.out.println("Time taken : " + (stop-start));
		
		
	}

}
