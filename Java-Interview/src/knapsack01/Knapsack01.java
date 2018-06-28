package knapsack01;

public class Knapsack01 {

	public static int[] val = {0,5,3,5,3,2};
	public static int[] wt  = {0,1,2,4,2,5};
	public static int[][] mem = new int[val.length+1][11]; 
	
	public static void main(String[] args) {
	 //    System.out.println(mem[1][1]);
		System.out.println(fillKnapsack(5, 10));

	}
	
	public static int fillKnapsack(int n, int w) {
		if(mem[n][w] != 0) {
			return mem[n][w];
		}
		if(n==0 || w==0) {
			return 0;
		}
		else if(wt[n]> w) {
			return fillKnapsack(n-1, w);
		}
		else {
			
			int temp1 = val[n]+ fillKnapsack(n-1, w-wt[n]); //1
			int temp2 = fillKnapsack(n-1, w);//0
			mem[n][w] = Math.max(temp1, temp2);
			return Math.max(temp1, temp2);
		}
	}

}
