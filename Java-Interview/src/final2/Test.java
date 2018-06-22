package final2;

import java.util.Arrays;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//int A[] ={1,5,8,3,7};
		solution();
		
		
		
	}

	
	public static boolean solution() {

		  int[] A = {1, 5, 3, 3, 7};
	        int temp;
	        int swapCount = 0;
	        int length = A.length;
	        boolean status = false;
	        for (int i = 0; i < A.length; i++) {
	            if (i == length - 1) {
	                break;
	            }
	            if (A[i] > A[i + 1]) {
	                if (((i + 2) < length) && A[i + 1] == A[i + 2]) {
	                    temp = A[i];
	                    A[i] = A[i + 2];
	                    A[i + 2] = temp;
	                    ++swapCount;

	                } else {
	                    temp = A[i];
	                    A[i] = A[i + 1];
	                    A[i + 1] = temp;
	                    ++swapCount;
	                }
	            }

	            if (swapCount > 1) {
	            	status = false;
	            	System.out.println(status);
	                return status;
	            }
	        }
	        status = true;
	        System.out.println(status);
	        return status;
		
	}
		
    
}
