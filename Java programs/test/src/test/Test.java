package test;

import java.util.ArrayList;
import java.util.*;
import java.util.Scanner;

public class Test {

	 public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        int n = in.nextInt();
	        int c[] = new int[n];
	        boolean status0 = false;
	        boolean status1 = false;
	        int jumps=0;
	        for(int c_i=0; c_i < n; c_i++){
	            c[c_i] = in.nextInt();
	        }
	        
	        for(int i=0; i<c.length ; i++)
	        {
	        	if(i+1< c.length)
	        	{
		        		if(c[i]==0 && c[i+1]==0 && status0 ==false)
		        		{
		        			status0=true;
		        		}
		        		else if(c[i]==0 && c[i+1]==0 && status0 ==true)
		        		{
		        			jumps++;
		        			status0 = false;
		        		}
		        		else if(c[i]==0 && c[i+1]==1 && status1 == false)
		        		{
		        			status1= true;
		        		}
		        		else if(c[i]==1 && c[i+1]==0 && status1 == true)
		        		{
		        			jumps++;
		        			status1= false;
		        		}
	        		
	    
	        	}
	        	else
	        	{
	        		jumps++;
	        	}
	        }
	        
	        System.out.println(jumps);
	 }
		

}
