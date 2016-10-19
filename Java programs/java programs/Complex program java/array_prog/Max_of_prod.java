package array_prog;

import java.util.Arrays;

public class Max_of_prod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int A[] = {5,4,3,1,2};
		
	Arrays.sort(A);
	int len= A.length;
	int prod = A[len-1]*A[len-2]*A[len-3];
	
	System.out.println(prod);
	
	

	}

}
