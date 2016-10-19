package MaximumTriangleParameter;


import java.util.*;


public class Maximum_Triangle_Parameter {


	private static int max = 0;
	private static int par =0;
	private static int index=0;
	private static int maxcounter=0;
	private static int  result1, result2 , result3; 
	private static int  result1max, result2max , result3max; 
	 public static void main(String[] args) {
	        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
	        Scanner scan = new Scanner(System.in);
			int num = scan.nextInt();
	        int[] a = new int[num];
	
	        
	        for(int i= 0; i<a.length;i++)
	            {
	            a[i]= scan.nextInt();
	        
	        }
	        Arrays.sort(a);

	      
	       
	        for(int i=0 ; i< a.length-1; i++)
	        {
	        	getmax(a);
	        	 parameter(a);
	        	 
	        	 if(result1max < result1 && result2max < result2 && result3max < result3)
	        	 {
	        		 result1max = result1;
	        		 result2max = result2;
	        		 result3max = result3;
	        	 }
	        }
	       if(result1max!=0 && result2max !=0 && result3max !=0)
	       {
	   	 System.out.println(result1max + " "+ result2max+ " "+result3max);
	       }
	       else
	       {
	    	   System.out.println(-1);
	       }
	       
	      
	            
	    }
	 
	 public static void getmax(int a[])
	 {
		 
		 maxcounter++;
		  
	   max= a[a.length-maxcounter];
	   index = a.length-maxcounter;
	  
          
     }
	 public static void parameter(int a[])
	 {
		
		 for(int i= 0; i<a.length;i++)
         {
         for(int j= i+1; j<a.length;j++)
             {
             if(i!=j)
                 {
            	 if(a[i] <= max && a[j] <= max)
            	 {
	                 if((a[i]+a[j]) > max && i!=index && j!=index)
	                     {
	                   
	                     if(par <  a[i]+a[j]+max);
	                     {
	                    	 par = a[i]+a[j]+max; 
	                      result1= a[i];
	                      result2 =a[j];
	                      result3=max;
	                     }
	                     
	                 }
            	 }
            	 else 
            	 {
            		 break;
            	 }
                 
             }
            
         }
     }
	 }
	 }
	 

