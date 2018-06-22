package facebook;

import java.util.ArrayList;
import java.util.List;

public class SubarrayWithGivenSum {

	
	public static void main(String args[]) {
		
		/*5 12
		1 2 3 7 5*/
		int k = 12;
		int arr[] = {1,2,3,7,5};
		calSubArray(k, arr);
		
	}
	
	public static void calSubArray(int k , int arr[]) {
		
		int counter = 0;
		
		
		for(int i=0; i<arr.length-1; i++) {
			List<Integer> list = new ArrayList<Integer>(); 
			counter = arr[i];
			list.add(i+1);
			for(int j=i+1; j<arr.length; j++) {
				
				if(counter < k) {
					System.out.println(counter + " " + arr[j]);
					 counter = counter + arr[j];
					 list.add(j+1);
						System.out.println(counter);
					 if (counter == k)
					System.out.println(list);
				}
				else
					break;
			}
			
		}
	
		
	}
}
