package producerConsumer;

import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;


public class BlockingQueueEX {
	
	
	private static BlockingQueue<Integer> bq = new ArrayBlockingQueue<Integer>(10);
	
	public static void producer() throws InterruptedException
	{
		Random random = new Random();
		while(true)
		{
		
			 Integer value = random.nextInt(100);
			bq.put(value);
			System.out.println("Value Added : " + value +",  size : " + bq.size());
		
		}
		
	}
	
	public static void consumer() throws InterruptedException
	{

		Random random = new Random();
		while(true)
		{
		
			if(random.nextInt(10) == 0)
			{
				Integer value = bq.take();
				
				System.out.println("Value taken : " + value + " size : " + bq.size());
				Thread.sleep(2000);
			}
			
		}
		
	}
	
	

	public static void main(String[] args) throws InterruptedException {
		

		Thread t1 = new Thread(new Runnable(){

			@Override
			public void run() {
				// TODO Auto-generated method stub
				
				try {
					producer();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
			
		});
		
		Thread t2 = new Thread(new Runnable(){

			@Override
			public void run() {
				// TODO Auto-generated method stub
				
				try {
					consumer();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
			
		});
		
		t1.start();
		t2.start();


	}

}
