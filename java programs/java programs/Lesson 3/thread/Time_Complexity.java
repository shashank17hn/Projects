package thread;

import java.util.Arrays;

public class Time_Complexity {

	public static void main(String[] args) {
		
		int right= 0;
		int left =0;
	
		int[] store = {3,1,2,4,3};
		int[] current = new int[40];
		
		for(int i=0; i<= (store.length -1);i++)
		{
			right = right+  store[i];
		}
		
		int min = Arrays.stream(store).max().getAsInt();
		
		for(int i=0; i<= (store.length -1);i++)
		{
			right -= store[i];
			left += store[i];
			current[i]= Math.abs(right-left);
			System.out.println(current[i]);
			
			if(min > Math.abs(right-left) )
			{
				min = Math.abs(right-left);
				
			}
			
			
		}
		System.out.println("minimum value :" + min);
	
		
			
	}

}
