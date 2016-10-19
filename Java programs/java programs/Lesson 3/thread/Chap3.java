package thread;

public class Chap3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Thread th = new Thread(new Runnable(){

	@Override
	public void run() {
		for (int a=0; a<=10;a++)
		{
			System.out.println(Thread.currentThread().getId() + "value" + a  );
		}
		
		
	}
	  
  }); 
  
  th.start();
	}

}
