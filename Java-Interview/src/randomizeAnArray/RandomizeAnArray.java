package randomizeAnArray;

import java.util.Random;

public class RandomizeAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int [] arr = {1,0,5,4,3};
		randomizeArray(arr);

	}
	
	public static void randomizeArray(int[] arr) {
		
		int ranLimit = arr.length;
		Random ran = new Random();
		for(int i=0 ; i<= arr.length/2 ; i++) {
			int j = ran.nextInt(ranLimit);
			int temp = arr[j];
			arr[j] = arr[i];
			arr[i]= temp;
			ranLimit--;
		}
		
		for(Integer i : arr) {
			System.out.print(i + " ");
		}
		
	}

}
