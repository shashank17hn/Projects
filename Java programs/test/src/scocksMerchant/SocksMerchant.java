package scocksMerchant;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class SocksMerchant {

	private static int total =0;
	public static void main(String[] args) {
		
		Map<Integer, Integer> map = new HashMap<Integer,Integer>();
		int value=1;
        Scanner in = new Scanner(System.in);
        
        int n = in.nextInt();
        int c[] = new int[n];
        for(int c_i=0; c_i < n; c_i++){
            c[c_i] = in.nextInt();
            
            if(map.containsKey(c[c_i]))
     	   {
     		   map.put(c[c_i], map.get(c[c_i])+1);
     		   
     	   }
     	   else
     	   {
     		   map.put(c[c_i], value);
     	   }
        }
        
       
      
       
      // System.out.println(map);
       
       Iterator<Integer> it = map.keySet().iterator();
    		   while(it.hasNext())
    		   {
    			   int sockKey = it.next();
    			   int socks = map.get(sockKey);
    			   if(socks > 1 )
    			   {
    				   getPair(socks); 
    			   }
    			   
    		   }
        
    		   	System.out.println(total);
       
    }
	
	public static void getPair(int socks)
	{
		int counter=0;
		
		while(socks!=0)
		{
			if(socks>1)
			{
				if(socks%2 == 0)
				{
					counter++;
					socks = socks-2;
					
				}
				else
				{
					socks = socks-1; 
				}
			}
		}
		total = total + counter;
		//System.out.println(counter);
	}

}
