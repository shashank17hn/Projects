package test2;

import java.util.Arrays;
import java.util.Scanner;

public class Test22 {
	
	public static void main(String[] args)
	{
		int pos =0;
		int neg =0;
		Scanner scan = new Scanner(System.in);
		for(int i=0 ; i<1000 ; i++)
		{
			int a = scan.nextInt();
			if(a >= 0)
			{
				pos++;
				
			}
			
			else
			{
				neg++;
			}
			
		}
		
		System.out.println(pos);
		System.out.println(neg);
		System.out.println(pos+neg);
		
	}

}
