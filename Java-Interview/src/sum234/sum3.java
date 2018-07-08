package sum234;

import java.util.Arrays;

public class sum3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] numbers= {2, 7, 11, 15};
		int target = 33;
		int counter =0;
		findSum3(numbers, target);
		

	}
	
	
	public static void findSum3(int[] numbers , int target) {
		
		Arrays.sort(numbers);
		for(int i = 0; i<numbers.length ; i++) {
			int j = i+1;
			int k = numbers.length-1;
			while(j<k) {
				if(numbers[i] + numbers[j] + numbers[k] == target) {
					System.out.println(numbers[i] + " " + numbers[j] + " " + numbers[k]);
					return;
				}
				else if(numbers[i] + numbers[j] + numbers[k] < target) {
					j++;
				}
				else if(numbers[i] + numbers[j] + numbers[k] > target) {
					k--;
				}
			}
		}
		
	}

}
