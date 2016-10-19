package cutTheSticks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class CutTheSticks {

	

	private static int limit ;
	private static int[] sticks ;
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
	    
		limit = scan.nextInt();
	    sticks = new int[limit];

	    System.out.println(limit);
		for(int i=0 ; i< limit; i++)
		{
			sticks[i] = scan.nextInt();
			
		}
		
		cut();
		 int counter = status();
		 if(counter > 0)
		    {
		    System.out.println(counter);
		    }
			
		
		while(counter!=0)
		{
			cut();
		    counter = status();
		    if(counter > 0)
		    {
		    System.out.println(counter);
		    }
			
		}
		

	}
	
	
	public static void cut()
	{
		int cut = findCut();
		for(int i=0 ; i< limit; i++)
		{
			
			if(sticks[i] >= cut)
			{
			  sticks[i] = Math.abs(sticks[i] - cut);	
			}
			
		}
		
	}
	
	public static int status()
	{
		int counter =0;
		for(int i=0 ; i< limit; i++)
		{
			if(sticks[i] > 0)
			{
				counter++;
			}
		}
		
		return counter;
	}
	
	public static int findCut()
	{
		StringBuilder sb = new StringBuilder();
		Arrays.sort(sticks);
		ArrayList<Integer> al = new ArrayList<Integer>();
		for(int i=0 ; i< limit; i++)
		{
			if(sticks[i] > 0)
			{
				al.add(sticks[i]);
			}
		}
		
		int cut = al.get(0);
		return cut;
		
		
	}

}
