package longest.consecutive.sequence;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class LongestConsecutiveSequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] arr = {7,8,15,16,18,1,2,3,5,6, 100, 67, 45, 34,23};
		System.out.println("Method 1 : ");
		System.out.println(getLongestSequence1(arr));
		System.out.println("Method 2 : ");
		System.out.println(getLongestSequence2(arr));

	}
	
	public static int getLongestSequence1(Integer arr[]) {
		long start = System.currentTimeMillis();
		Set<Integer> set = new HashSet<>(Arrays.asList(arr));
		int max =0;
		for(Integer i : set) {
			int counter= 1;
			while(set.contains(i-1)) {
			//	System.out.println(i);
				counter++;
				i--;
			}
			if(max< counter) {
				max = counter;
			}
		}
		
		long end = System.currentTimeMillis();
		System.out.println("Time taken : " + (end - start));
		return max;
	}

	public static int getLongestSequence2(Integer arr[]) {
		long start = System.currentTimeMillis();
		Set<Integer> set = new TreeSet<>(Arrays.asList(arr));
		int max =0;
		int i=0;
		while(i<set.size()) {
			// System.out.println(i);
			int counter= 0;
			while(set.contains(i+1)) {
			//	System.out.println(i);
				counter++;
				 i++;
			}
			i++;
			if(max< counter) {
				max = counter;
			}
		}
		
		long end = System.currentTimeMillis();
		System.out.println("Time taken : " + (end - start));
		return max;
	}
}
