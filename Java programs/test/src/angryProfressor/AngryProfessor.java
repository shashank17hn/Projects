package angryProfressor;

import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class AngryProfessor {
	 static Scanner scan = new Scanner(System.in);
	 static String[] result;
	 static int count =0 ;
	 static int[] count1;

	public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
       
        int testNo = scan.nextInt();
        result = new String[testNo];
        count1 = new int[testNo];
        for(int i=0; i<testNo; i++)
            {
            test();
        }
        
        for(int i=0; i<testNo; i++)
        {
       System.out.println(result[i] + " : " + count1[i]);
    }
        
    }
    
    public static void test()
        {
    	
        
        int total = scan.nextInt();
        int limit = scan.nextInt();
        int counter =0;
        int student = 0;
        for(int i=0 ; i<total ; i++)
            {
            student = scan.nextInt();
            if(student <= 0)
                {
                counter++;
            }
        }
        if(counter >= limit)
        {
        	result[count] = "NO";
        	count1[count] = counter;
        }
        else
        {
        	result[count] = "YES";
        	count1[count] = counter;
        }
        count++;
    }
}
