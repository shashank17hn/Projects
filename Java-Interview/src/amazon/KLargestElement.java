package amazon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/*Question: Write an efficient program for printing k largest elements in an array. Elements in array can be in any order.

For example, if given array is [1, 23, 12, 9, 30, 2, 50] and you are asked for the largest 3 elements i.e., k = 3 then your program should print 50, 30 and 23*/

public class KLargestElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	   int[] arr = {1, 23, 12, 9, 30, 2, 50};
	   int k =3;
	   method1(k, arr);
	   method2(k, arr);
	   method3(k, Arrays.stream(arr).boxed().toArray(Integer[] :: new));
	  

	}
	
	public static void method1(int k , int arr[]){
		 int max =0;
		   ArrayList<Integer> list = new ArrayList<>();
		   
		   for(int i=0 ; i<arr.length ; i++) {
			   
			   if(arr[i] > max) {
				   max= arr[i];
				   list.add(arr[i]);
			   }
			   
		   }
		   
		   System.out.println("method1");
		   for(int i =list.size()-1 ; i >= list.size()-k ; i-- ) {
			   System.out.println(list.get(i));
		   }
		
	}
	
	public static void method2(int k , int arr[]){
		   
		   for(int i=0 ; i<arr.length ; i++) {
			   
			   for(int j=0 ; j< arr.length ; j++) {
				  
				   if(arr[i]> arr[j]) {
					   int temp = arr[j];
					   arr[j] = arr[i];
					   arr[i] = temp;
				   }
			   }
			   
			 
			   
		   }
		   System.out.println("method2");
		  for(int i=0 ; i<k ; i++)
		  {
			  System.out.println(arr[i]);
		  }
		
	}
	
	public static void method3(int k , Integer arr[]){
		   
		 Arrays.sort(arr, Collections.reverseOrder());
			   
		   System.out.println("method3");
		  for(int i=0 ; i<k ; i++)
		  {
			  System.out.println(arr[i]);
		  }
		
	}

}
