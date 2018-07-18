package amazon;

import java.util.Arrays;
import java.util.Scanner;

public class ClosestPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		
		Scanner scan = new Scanner(System.in);
		int n= scan.nextInt();
		for(int i=0; i<n ; i++) {
			
			// System.out.println(findPalindrome(scan.nextInt()));
			System.out.println(FindcheckPalindrome(scan.nextInt()));
			
		}
		
		
		
	}
	
	public static int findPalindrome(int no) {
		if(checkPalindrome(no))
			return no;
		else {
			int temp1 =no , temp2 = no;
			while(temp1 != 0) {
				if(checkPalindrome(--temp1))
					return temp1;
				if(checkPalindrome(++temp2))
					return temp2;
				
			}
		}
		return -1;
	}
	
	public static boolean checkPalindrome(int num) {
		 String data = Integer.toString(num);
		int left = 0;
		int right = data.length()-1;
		while(left < right) {
			if(data.charAt(left)!= data.charAt(right))
				return false;
			else {
				left++;
				right--;
			}
		}
		return true;
	}

	public static int FindcheckPalindrome(int num) {
		 String data = Integer.toString(num);
		 char[] temp1 = data.toCharArray();
		 char[] temp2 = data.toCharArray();
		int left = 0;
		int right = data.length()-1;
		while(left < right) {
			if(data.charAt(left)!= data.charAt(right)) {
				temp1[left] = temp1[right];
			    temp2[right] = temp2[left];
			    left++;
			    right--;}
			else {
				left++;
				right--;
			}
		}
		 int a = Math.abs(num - Integer.parseInt(new String(temp1)));
		 int b = Math.abs(num -  Integer.parseInt(new String(temp2)));
		 if(a < b)
			 return Integer.parseInt(new String(temp1));
		 else return Integer.parseInt(new String(temp2));
	}
}
