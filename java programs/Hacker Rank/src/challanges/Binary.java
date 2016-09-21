package challanges;
import java.io.*;
import java.util.*;

public class Binary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[] bin = new int[30];
	        Scanner scan = new Scanner(System.in);
	        int value = scan.nextInt();
	        int i=0;
	        while(value !=0)
	            {
	            bin[i] = value %2;
	            i++;
	            value = value /2; 
	        }
	        int counter =1;
	        for(int j =0;j<=(bin.length-1);j++)
	           {
	             if(bin[j] ==1 && bin[j+1] ==1)
	            {
	             counter ++;
	                
	             }
	            
	        }
	        System.out.print(counter);

	}

}
