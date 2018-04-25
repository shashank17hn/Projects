			/*Sample input
			5 4
			1 2 3 4 5
			
			sample output
			5 1 2 3 4
			
			
			Sample input
			20 10
			41 73 89 7 10 1 59 58 84 77 77 97 58 1 86 58 26 10 86 51
			
			sample output
			77 97 58 1 86 58 26 10 86 51 41 73 89 7 10 1 59 58 84 77
			*/

package cracking.code.interview;
import java.util.Scanner;

public class ArraysLeftRotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	     Scanner in = new Scanner(System.in);
	        int n = in.nextInt();
	        int k = in.nextInt();
	        int a[] = new int[n];
	        int temp =0;
	       
	        for(int a_i=0; a_i < n; a_i++){
	            a[a_i] = in.nextInt();

	        }
	        
	        // Method 1 --> looping using single original array  
	       // To rotate by one, store arr[0] in a temporary variable temp, move arr[1] to arr[0], arr[2] to arr[1] …and finally temp to arr[n-1]
	     while(k != 0)
	     {
	    	 temp = a[0];   // store first value 
	    	 for(int i =0 ; i < a.length-1 ;i++) {
	    	   a[i] = a[i+1];
	    	}
	    	a[a.length-1] = temp;   // at the end of loop make it last
	       // System.out.println("phase" + Arrays.toString(a));
	    	 k--;
	    	 if(k ==0)
	    		 break;
	    	} 
	     	     
	     for(int i : a) {
	    	 System.out.print(i + " ");
	     }
	     
	     // Method 2 --> using a temp array 
	    /*     Input arr[] = [1, 2, 3, 4, 5, 6, 7], d = 2, n =7
	    		 1) Store d elements in a temp array
	    		    temp[] = [1, 2]
	    		 2) Shift rest of the arr[]
	    		    arr[] = [3, 4, 5, 6, 7, 6, 7]
	    		 3) Store back the d elements
	    		    arr[] = [3, 4, 5, 6, 7, 1, 2]
	    		    Its in my javascript project
	    		    */
	     
	     
	}

}



