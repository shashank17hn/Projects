package thread;

class Myclass extends Thread 

{
	public void run()
	{
		for(int a=0; a<=10;a++)
		{
			System.out.println(Thread.currentThread().getId() + "Value" +a);
		}
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	}

public class Chap1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Myclass my = new Myclass();
		my.start();
		Myclass my1 = new Myclass();
		my1.start();

	}

}
