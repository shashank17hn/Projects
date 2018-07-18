package amazon;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ContiguousIntegersWithDuplicates {

/*	Given an array of n integers(duplicates allowed). Print “Yes” if it is a set of contiguous integers else print “No”.
	INPUT: The first line consists of an integer T i.e. the number of test cases. First line of each test case consists of an integer n, denoting the size of array. Next line consists of n spaced integers, denoting      elements of array.
	OUTPUT:  Print “Yes” if it is a set of contiguous integers else print “No”.

	CONSTRAINTS:
	1<=T<=100
	1<=n<100000
	a[i]<=105
	 Example:
	2
	8
	5  2  3  6  4  4  6  6
	7
	10  14  10  12  12  13  15
	Output :
	 Yes
	 No*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer[] arr = {5,2,3,6,4,4,6,6};
	//	Integer[] arr1 = {10,14,10,12,12,13,15};
	/*	Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		for(int i =0 ; i<n ; i++) {
			int k = scan.nextInt();
			Integer[] arr = new Integer[k];
			for(int j =0 ; j<k ; j++) {
				Integer num = new Integer(scan.nextInt());
				 arr[j] = Integer.valueOf(num);
				Arrays.stream(arr).forEach(s-> System.out.println("--" + s));
				System.out.println(findContinious(arr));
			}
		}*/
	
		
		System.out.println(findContinious(arr));
		
	}

	
	public static boolean findContinious(Integer[] arr) {
		Set<Integer> set =  new HashSet<>(Arrays.asList(arr)); 
	  for(Integer i : set) {
		  if(!set.contains(i-1) && !set.contains(i+1))
			  return false;
	  }
	  return true;
	}
}
