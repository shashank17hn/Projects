package sum234;

import java.util.Arrays;

public class sum4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] numbers= {1, 0, -1 ,0, -2 ,2};
		int target = 0;
		int counter =0;
		findSum4(numbers, target);
	}

	private static void findSum4(int[] numbers, int target) {
		// TODO Auto-generated method stub
		
		Arrays.sort(numbers);
		for(int i = 0; i<numbers.length-1 ; i++) {
			
			for(int j=i+1 ; j<numbers.length ; j++) {
				int k = j+1;
				int l = numbers.length-1;
				while(j<k) {
					if(numbers[i] + numbers[j] + numbers[k] + numbers[l] == target) {
						System.out.println(numbers[i] + " " + numbers[j] + " " + numbers[k] + " " + numbers[l]);
						return;
					}
					else if(numbers[i] + numbers[j] + numbers[k] + numbers[l] < target) {
						k++;
					}
					else if(numbers[i] + numbers[j] + numbers[k] + numbers[l] > target) {
						l--;
					}
				}
				
			}
			
		}
		
	}

}
