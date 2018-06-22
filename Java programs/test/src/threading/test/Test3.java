package threading.test;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ExecutorService ex = Executors.newFixedThreadPool(2);
		for(int i =0 ;i<5 ; i++) {
			ex.submit(new Runner2());
		}

		
		ex.shutdown();
		try {
			ex.awaitTermination(1,TimeUnit.DAYS);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}


class Runner2 implements Runnable {

	@Override
	public void run() {
		for(int i=0 ; i<10 ; i++)
		{
			System.out.println("Hello" + i);
		}
		
	}
	
}