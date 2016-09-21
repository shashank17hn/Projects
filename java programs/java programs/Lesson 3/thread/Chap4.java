package thread;

public class Chap4 {
public static int count=0;

public static synchronized void countval()
{ count ++;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread th = new Thread (new Runnable(){

			@Override
			public void run() {
				for (int a=0; a<=1000;a++)
				{
					countval();
				}
				
			}
			
		}
				
				);
		Thread th2 = new Thread (new Runnable(){

			@Override
			public void run() {
				for (int a=0; a<=1000;a++)
				{
					countval();
				}
				
			}
			
		}
				
				);
		th.start();
		th2.start();
try {
	th.join();
	th2.join();
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
System.out.println(count);

	}

}
