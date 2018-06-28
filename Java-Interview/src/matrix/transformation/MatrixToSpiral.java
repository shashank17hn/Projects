package matrix.transformation;

import java.util.HashSet;
import java.util.Set;

public class MatrixToSpiral {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  int[][] matrix = {
				   {1,  2,  3,  4,  5},
				   {6,  7,  8,  9,  10},
				   {11, 12, 13, 14, 15},
				   {16, 17, 18, 19, 20},
				   {21, 22, 23, 24, 25}
				  };
		  // 1 2 3 4 5 10 15 20 25 24 23 22 21 16 11 6 7 8 9 14 19 18 17 12 13 
		  int[][] matrix2 = { 
				      {1, 2, 3 },
				      {4, 5, 6 },
				      {7, 8, 9 }
							};
		  
		// 1 2 3 6 9 8 7 4 5
		  
		  System.out.println(matrix.length * matrix[0].length);
		  
		  convertSpiral(matrix2);
	}

	public static int[] convertSpiral(int[][] matrix) {
		
		int counter = 0;
		int rowStart =0;
		int colStart =0;
		int rowEnd= matrix.length-1;
		int colEnd =matrix[1].length-1;
		Set<String> set = new HashSet<>();
		int arr[] = new int[matrix.length * matrix[0].length]; 
		while(counter <= (matrix.length * matrix[0].length)-1) {
			
			//System.out.println(rowStart + " " + rowEnd + " " + colStart + " " + colEnd);
			for(int j = colStart; j<=colEnd ; j++) {
					arr[counter] = matrix[rowStart][j];
					System.out.println(matrix[rowStart][j] +" " + counter);
					counter++;	
			}
			
			
			for(int i =rowStart+1; i<=rowEnd ; i++ ) {
					arr[counter] = matrix[i][colEnd];
					System.out.println(matrix[i][colEnd]+" " + counter);
					counter++;
			}
			
	
			for(int j=colEnd-1 ; j>=colStart; j-- ) {
					arr[counter] = matrix[rowEnd][j];
					System.out.println(matrix[rowEnd][j]+" " + counter);
					counter++;
			
				
			}
		
			for(int i =rowEnd-1; i>rowStart; i-- ) {
					arr[counter] = matrix[i][colStart];
					System.out.println(matrix[i][colStart]+" " + counter);
					counter++;
			}
			
		   rowStart++;
		   colStart++;
		   rowEnd--;
		   colEnd--;
		
	/*	   {1,  2,  3,  4,  5},
		   {6,  7,  8,  9,  10},
		   {11, 12, 13, 14, 15},
		   {16, 17, 18, 19, 20},
		   {21, 22, 23, 24, 25}*/
			
		}
		
		return arr;
	}

}
