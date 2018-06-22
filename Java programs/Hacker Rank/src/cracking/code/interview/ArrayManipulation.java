package cracking.code.interview;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ArrayManipulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4};
		int [] arr2 = {0,1,2,0,3,0};
		//int[] output =shift(2,arr);
		int[] output =checkForZero(arr2);
		System.out.println("output");
		for(int x : output) {
		System.out.println(x);
		}

	}
	
	public static int[] checkForZero(int[] input) {
		int temp[] = new int[input.length];
		int counter = 0;
		int z=0;
		for(int i = 0 ; i<input.length ; i++) {
		  if(input[i]!=0) {
			  temp[z] = input[i];
			  z++;
		  }
		  else {
			  counter++;
			  temp[input.length - counter] = 0;
		  }
		}
	/*	for(int i =0 ; i<counter ;i++) {
			temp[z] = 0;
		}*/
		return temp;
	}

	public static int[] shift(int n , int[] input) {
		int temp[] = new int[input.length];
		int z =0;
		for(int i =n; i<input.length ; i++) {
			temp[z] = input[i];
			z++;
			
		}
		
		for(int i = 0 ; i < n; i++ ) {
			temp[z] = input[i];
			z++;
		}
		
		//Arrays.stream(input).forEach(x-> System.out.println(x););
		//IntStream.concat(Arrays.stream(input), Arrays.stream(temp));
		return temp;
	}
	
}
