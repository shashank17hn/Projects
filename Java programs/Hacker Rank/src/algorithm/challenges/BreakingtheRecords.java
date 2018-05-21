package algorithm.challenges;

import java.io.IOException;
import java.util.Scanner;

public class BreakingtheRecords {

	 // Complete the breakingRecords function below.
    static int[] breakingRecords(int[] score) {
      
    	int max =score[0];
    	int min =score[0];
    	int maxCounter =0;
    	int minCounter =0;
    	
    	for(int i =0 ; i< score.length ; i++) {
    		if(max < score[i]) {
    			max= score[i];
    			maxCounter++;
    		}
    		if(min > score[i]) {
    			min = score[i];
    			minCounter++;
    		}
    	}
    	
    	int[] result = {maxCounter , minCounter};
    	//System.out.println(maxCounter +  " : "  + minCounter);
    	return result;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
       // int[] a = {10, 5, 20, 20, 4 ,5 ,2 ,25, 1};
        int [] a = {3 ,4 ,21 ,36 ,10, 28, 35, 5, 24, 42};
      //  System.out.println();
        breakingRecords(a);
    }

}
