package repeatingString;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class RepeatingString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  Scanner in = new Scanner(System.in);
	        String s = in.next();
	        long n = in.nextLong();
	        char[] input = s.toCharArray();
	        int length = input.length;
	        int extra=0;
	        long div=0;
	        long total =0;
	        boolean status = true;
	        int Acount=0;
	        HashMap<Integer,Character> map = new HashMap<Integer,Character>();
	        
	        for(int i =0; i<input.length;i++)
	        {
	        	if(input[i]=='a')
	        	{
        			map.put(i, input[i]);
        			Acount++;
	        	}
	        }
	        
	       // System.out.println(map);
	        
	        while(status)
	        {
	        	if(n%length !=0)
	        	{
	        		n--;
	        		extra++;  //1
	        		
	        	}
	        	if(n%length ==0)
	        	{
	        		div = n / length;
	        		status= false;
	        	}
	        	
	        }
	        
	        Iterator<Integer> it = map.keySet().iterator();
	        if(extra >0)
		        {
		        while(it.hasNext())
		        {
		        	int key = it.next();
		        	if(key < extra)
		        	{
		        		total++;
		        	}
		        	
		        }
	        }
	        
	        System.out.println(total+(div*Acount));
	        
	        //241753848483

	}

}
