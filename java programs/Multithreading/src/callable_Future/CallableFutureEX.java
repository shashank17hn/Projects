package callable_Future;

import java.io.IOException;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class CallableFutureEX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ExecutorService ex = Executors.newCachedThreadPool();
		
		//Future<?> fue = ex.submit(new Callable<Void>()   for returning nothing
		
		Future<Integer> fue = ex.submit(new Callable<Integer>(){

			@Override
			public Integer call() throws Exception {
				
				System.out.println("Thread Started ...");
				
				Random random = new Random();
				int duration = random.nextInt(1000);
				
				if(duration > 500)
				{
					throw new IOException("Sleeping time is too long");
				}
				
			
				
				
				Thread.sleep(duration);
				
				System.out.println("Thread Stopped");
				
				return null;
			}
			
		});
		
		ex.shutdown();
		
		
		
		try {
			ex.awaitTermination(1, TimeUnit.DAYS);
			System.out.println("Future Value : " + fue.get());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ExecutionException e) {
			IOException ex1 = (IOException)e.getCause();
			System.out.println(ex1.getMessage());
		}
		
	}

}
