package waitNotify;

import java.util.Scanner;

public class WaitNotifyEX {
	
	
	public  void producer() throws InterruptedException
	{
		synchronized(this)
		{
			System.out.println("In producer --> ");
			wait();
			
			System.out.println("Resume ----->");
		}
		
	}

	public  void consumer() throws InterruptedException
	{
		synchronized(this)
		{
			System.out.println("In Consumer <-- ");
			System.out.println("Press enter to notify");
			Scanner scan = new Scanner(System.in);
			scan.nextLine();
			notify();
			Thread.sleep(5000);
			
			
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WaitNotifyEX ex = new WaitNotifyEX();

		
		Thread t1 = new Thread(new Runnable()
				{

					@Override
					public void run() {
						// TODO Auto-generated method stub
						try {
							ex.producer();
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						
					}
			
				}
				
				);
		
		
		Thread t2 = new Thread(new Runnable()
		{

			@Override
			public void run() {
				// TODO Auto-generated method stub
				try {
					ex.consumer();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
	
		}
		
		);
		
		t1.start();
		t2.start();
		
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
