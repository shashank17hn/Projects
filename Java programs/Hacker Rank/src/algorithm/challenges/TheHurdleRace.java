package algorithm.challenges;

import java.io.IOException;
import java.util.Arrays;

public class TheHurdleRace {

	   // Complete the hurdleRace function below.
    static int hurdleRace(int k, int[] height) {

    	Arrays.sort(height);
    	if(height[height.length-1] > k)
    		return height[height.length-1] - k;
    	else
    		return 0;
    	

    }

	
    public static void main(String[] args) throws IOException {
   
    	//int[] a = {2, 5, 4 ,5 ,2};
    	//int k =7;
    	
    	int[] a ={1, 6, 3, 5, 2};
    	int k = 4;
    	System.out.println(hurdleRace(k, a));
    	
    }
}
