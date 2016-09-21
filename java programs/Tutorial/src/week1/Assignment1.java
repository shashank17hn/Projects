package week1;
import java.util.*;

public class Assignment1 {

	public static void main(String[] args) {
		int no[] = new int[30];
		int n,counter=0;
		float avg=0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Number of Integers for average");
		n =scan.nextInt();
		System.out.println("Enter the Integers");
		for(int i=0;i<=n-1;i++)
		{
			no[i]= scan.nextInt();
			counter = counter + no[i];
		}
		avg = counter/n;
		
		System.out.println("Average of given " + n + " numbers is : " + avg);

	}

}
