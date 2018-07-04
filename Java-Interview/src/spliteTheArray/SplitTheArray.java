package spliteTheArray;

public class SplitTheArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int[] arr = {};
       splitArray(arr);
       
	}
	
	public static void splitArray(int[] arr) {
		int i=0;
		while(i < arr.length-1) {
			
		 int sum1 =0;
		 int sum2 =0;
			for(int k=0; k<=i ;k++ ) {
				sum1 = sum1 + arr[k];
				System.out.println("sum1 " + sum1);
			}
			for(int j=i+1 ; j<arr.length ; j++) {
				sum2 = sum2 + arr[j];
			}
		
			
			if(sum1 == sum2) {
				System.out.println("sum1 " + sum1 + " : " + "sum2 " + sum2 + "at :" +  i);
				return;
			}
			i++;
		}
		System.out.println("cant split");
	}

}
