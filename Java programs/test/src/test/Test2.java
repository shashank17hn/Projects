package test;
import java.util.*;

public class Test2 {

	 public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        String s = in.next();
	        long n = in.nextLong();
	        char[] input = s.toCharArray();
	        HashMap<Character,Integer> map = new HashMap<Character,Integer>();
	       // int i=0, j=0;
	        int counta =0;
	        
	        for(int i=0 ; i< input.length ; i++)
	        {
	        	if (input[i] =='a')
	        	{
	        		counta++;
	        	}
	        }
	        
	        
	        
	       /* while(i!= n)
	        {
	        	if(j>2)
	        	{
	        		j=0;
	        	}
	        	if(j< input.length)
	        	{
		        	if(map.containsKey(input[j]))
	        		{
	        			map.put(input[j], map.get(input[j])+1);
	        		}
	        		else
	        		{
	        			map.put(input[j], 1);
	        		}
		        	j++;
	        	}
	        	i++;
	        }
	        
	       System.out.println(map);
	        
	        Iterator<Character> it = map.keySet().iterator();
	        while(it.hasNext())
	        {
	        	char key = it.next();
	        	int value = map.get(key);
	        	if(key == 'a')
	        	{
	        		System.out.println(value);
	        	}
	        }*/
	        
	    }

}
