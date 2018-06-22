package threading.test;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import jdk.jfr.internal.cmd.Execute;

public class Test4 {

	public static void main(String[] args) {
	
		
		CountDownLatch latch = new CountDownLatch(3);
		ExecutorService ex = Executors.newFixedThreadPool(3) ;
		for(int i =0 ;i<5 ; i++) {
			ex.submit(new Runner3(latch));
		}
		
		
	

	}

}



class Runner3 implements Runnable {
	
	private CountDownLatch latch;
	
	
	
	public Runner3(CountDownLatch latch) {
		super();
		this.latch = latch;
	}



	@Override
	public void run() {
		for(int i=0 ; i<10 ; i++)
		{
			System.out.println("Hello" + i);
		}
		latch.countDown();
	}
	
}
	