package interruptingThread;

import java.util.Random;

public class InterruptingThreadEX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Thread t1 = new Thread(new Runnable()
				{

					@Override
					public void run() {
						// TODO Auto-generated method stub
						
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
						
					}
			
				});
		
			t1.start();
			try {
				t1.sleep(500);
			
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		
			t1.interrupt();
			
			try {
				t1.join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			System.out.println("Finished... ");

	}

}
