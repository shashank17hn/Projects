
class Myclass extends Thread
{


	public void run() {
		int count =0;
		for(int i=1; i<=10 ;i++)
		{
			count++;

			System.out.println(Thread.currentThread().getId() + " : " + i);
		}
		
		System.out.println( "count" + count);
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	
}



public class Extended {
	
   
	public static void main(String[] args)
	{
		Myclass my = new Myclass();
		Myclass my1 = new Myclass();
		
		my.start();
		my1.start();
		
		
		
		
	}
	

}
