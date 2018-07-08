package subarray;

public class MiniumSubArrayToGivenTargetValue {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr =  {2,3,1,2,4,3};
		int target =7;
		findMinimum(arr, target);

	}
	
	public static void findMinimum(int[] arr , int target) {
		int start =0;
		int end =0;
		int sum=0;	
		int min = Integer.MAX_VALUE;
		while(end < arr.length) {
			if(sum<target) {
				sum += arr[end];
				end++;
			}
			else if(sum >= target) {
				min = Math.min(end-start, min);
				start++;
				sum -= arr[start];
			}
		}
		
		System.out.println(min + " " + sum);
		
	}

}
