package amazon;

import java.util.HashSet;
import java.util.Set;

public class PrimeBits {
	
/*	Given two integers ‘L’ and ‘R’, write a program that finds the count of numbers having prime number of set bits in their binary representation in the range [L, R].

	Input:
	The first line consists of an integer T i.e number of test cases. The first and only line of each test case consists of two integers L and R. 

	Output:
	Print the required output.

	Example:
	Input:
	2
	6 10
	10 15 

	Output:
	4
	5*/

	private static Set<Integer> memo = new HashSet<>();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		///System.out.println(Integer.toBinaryString(5));
		System.out.println(findPrime(6, 10));
		//System.out.println(findPrimeUtils(11));
	}
	
	
	public static int findPrime(int from , int to) {
		int counter =0;
		for(int i =from ; i<=to ; i++) {
			
			String val = Integer.toBinaryString(i);
		    int noOfOne = val.replaceAll("0", "").length();
		    if(findPrimeUtils(noOfOne)) {
		    	counter++;
		    }
			
		}
		return counter;
	}
	
	public static boolean findPrimeUtils(int num) {
		if(memo.contains(num)) {
			return true;
		}
		else if(num == 2 || num == 3) {
			return true;
		}
		else if(num ==1 || num ==0) {
			return false;
		}
		else {
				for(int i=2 ; i<num/2 ; i++) {
				if(num%i ==0) {
					return false;
				}
			}
		}
		memo.add(num);
		return true;
	}

	
	
}
