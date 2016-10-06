package countdownLatches_impl;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Processor implements Runnable
{
	private CountDownLatch latch;
	
	Processor(CountDownLatch latch)
	{
		this.latch = latch;
	}

	@Override
	public void run() {
	
		System.out.println("Process started by : " + Thread.currentThread().getId());
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		latch.countDown();
		System.out.println("CountDown by : " + Thread.currentThread().getId());
		
		
		
	}
	
}

public class LatchEX {
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CountDownLatch latch = new CountDownLatch(3);
		
		ExecutorService ex = Executors.newFixedThreadPool(2);
		
		for(int i= 0 ; i<3; i++)
		{
			ex.submit(new Processor(latch));
		}
		
		try {
			latch.await();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("All task Completed");

	}

}
