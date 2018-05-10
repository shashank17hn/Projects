package cracking.code.interview;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

/*Sample Input

6
12
4
5
3
8
7
Sample Output

12.0 --> 12                      //0       
8.0  --> 4+12 / 2                //1
5.0  --> 4,5,12 --> 5            //2
4.5  --> 3,4,5,12 --> 4+5/2      //3
5.0  --> 3,4,5,8,12 --> 5        //4
6.0  --> 3,4,5,7,8,12 --> 5+7/2  //5
*/

public class FindTheRunningMedian {
	
	

	public static void main(String[] args) {
		 Scanner in = new Scanner(System.in);
	        int n = in.nextInt();
	        int[] a = new int[n];
	        for(int a_i=0; a_i < n; a_i++){
	            a[a_i] = in.nextInt();

	        }
	        
	
	        
	        calculateMedian(a);   
	}
	
	public static void calculateMedian(int a[]) {
		
		 List<Integer> list = new ArrayList<>();
	        for(int i=0; i< a.length ; i++) {
	        	if(i==0) {
	        		list.add(a[i]);
	        		float z = a[i];
	        		//System.out.print(i +"list -->" + list);
	        		System.out.println(z);
	        	}
	        	if(i%2 !=0 && i!=0 ) {
	        		list.add(a[i]);
	        		Collections.sort(list);
	        		int x = list.get(list.size()/2);
	        		int y = list.get(list.size()/2-1);
	        		//System.out.print(i+ "list -->" + list);
	        		float z= (x+y)/2f;
	        		System.out.println(z);
	        	}
	        	if(i%2==0 && i!=0) {
	        		list.add(a[i]);
	        		Collections.sort(list);
	        		float z = list.get(list.size()/2);
	        		//System.out.print(i +"list -->" + list);
	        		System.out.println(z);
	        	}
	        }
		
	}
	

}
