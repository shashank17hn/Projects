package thread;

class Myclass1 implements Runnable
{

	@Override
	public void run() {
		for (int a=0; a<=10;a++)
		{
			System.out.println(Thread.currentThread().getId() + "value" + a  );
		}
		
	}
	}

public class Chap2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread th =new Thread(new Myclass1());
		Thread th1 =new Thread(new Myclass1());
		
	
		th.start();
		th1.start();

	}

}
