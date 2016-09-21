package array_prog;

public class Frog_Jump {

	public static void main(String[] args) {
		int X = 10, Y = 85 ,D = 30,counter=0;
		
		while(X<=Y)
		{
			X= X + D;
			counter++;
		}
		System.out.println(X);
		
		System.out.println(counter);
	}

}
