package cracking.code.interview;

import java.util.Collections;
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

Algorithm
1) take two heaps one is MIN and another is MAX 
2) In MIN heap add the higher number so that when at the top smallest number will be thr.
3) Similarly in MAX heap add the lower number so that at the top thr will be the highest number.
4) try to balance both the heaps. if(MIN.size - MAX.size >=2) or vice-versa  is thr then rebalance it
5) taking out the median. If both the size are equal then take first value from both the heap and take avg (this is even condition).
6) Otherwise take which ever size is greater by one. (this is odd condition.

*
*/

public class FindTheRunningMedianUsingHeap {
	
    public static PriorityQueue<Integer> minHeap = new PriorityQueue<>();
    public static PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

	public static void main(String[] args) {
		 Scanner in = new Scanner(System.in);
	        int n = in.nextInt();
	        int[] a = new int[n];
	        for(int a_i=0; a_i < n; a_i++){
	            a[a_i] = in.nextInt();
	            

	        }
	        
	        for(int i = 0 ; i<n ; i++) {
	        	addElementToHeap(a[i]);
		        balanceHeap();
		        System.out.println(getMedian());
	        }
	        
	       // System.out.println(minHeap);
	      //  System.out.println(maxHeap);
	          

	}
	  public static void addElementToHeap(int i){
      	
      	if(minHeap.size() ==0 || i > minHeap.peek()){
      		minHeap.offer(i);
      		// System.out.println("minHeap " +  minHeap);
      	}
      	else if(i < minHeap.peek()) {
      		maxHeap.offer(i);
      		//  System.out.println("maxHeap" + maxHeap);
      	} 	
      	
      }
	  
	  public static void balanceHeap() {
		  if(maxHeap.size() - minHeap.size() >= 2) {
			  minHeap.offer(maxHeap.poll());
			 // System.out.println("Balanaced minHeap " +  minHeap);
		  }
		  else if(minHeap.size()- maxHeap.size() >=2) {
			  maxHeap.offer(minHeap.poll());
			// System.out.println("Balanaced maxHeap " +  maxHeap);
		  }
	  }
	  
	  public static double getMedian() {
		  if(maxHeap.size() == minHeap.size()) {
			 // System.out.println("heap equal minHeap maxHeap " + minHeap + maxHeap);
			 // System.out.println("heap equal minHeap maxHeap " + minHeap.peek() + maxHeap.peek());
			  return (maxHeap.peek() + minHeap.peek())/2d;
			  
			  
		  }
		  else {
			  if(maxHeap.size() > minHeap.size()) {
				//  System.out.println("heap minHeap < maxHeap " + minHeap + maxHeap);
				  return maxHeap.peek();
			  }
			  else {
				 // System.out.println("heap minHeap > maxHeap " + minHeap + maxHeap);
				  return minHeap.peek();
			  }
		  }
	  }
	 

}
