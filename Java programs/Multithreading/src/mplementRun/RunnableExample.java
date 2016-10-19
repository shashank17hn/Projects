package mplementRun;

class Myclass implements Runnable 
{
	int count =0;

	public synchronized void countme()
	{
		int count =0;
		for(int i=1; i<=10 ;i++)
		{
			count++;

			System.out.println(Thread.currentThread().getId() + " : " + i);
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		System.out.println( "count" + count);
		try {
			Thread.sleep(100);
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		
		
		countme();
		notify();
		
	}
	
	
}



public class RunnableExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Thread t1 = new Thread(new Myclass());
		Thread t2 = new Thread(new Myclass());

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
