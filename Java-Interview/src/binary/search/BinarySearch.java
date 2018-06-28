package binary.search;

import java.util.Arrays;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {2,4,6,7,8,9};
		int key = 7;
		System.out.println(search(arr, key));
		System.out.println(searchRecursion(arr, 0, arr.length-1, key));

	}

	public static int search(int[] arr , int key) {
		
		int start = 0;
		int end = arr.length-1;
		int mid = (end+start)/2;
		
		
		while(start <= end) {
			if(arr[mid]< key) {
				start = mid;
			}
			else if(arr[mid] > key){
				end = mid;
			
			}
			else if(arr[mid]== key) {
				return mid;
			}
			
			mid = (end + start)/2;
		}
		
		return -1;
	}
	
	
	public static int searchRecursion(int[] arr , int start , int end , int key) {
		
		int mid = (start+end)/2;
		if(arr[mid] ==key) {
			return mid;
		}
		else if(arr[mid] > key) {
			return searchRecursion(arr, start, mid, key);
		}
		else if(arr[mid]<key)
			return searchRecursion(arr, mid, end, key);
		else return -1;
	}
	
}
