package longest.common.subsequence;

public class LongestCommonSubSequence {
	
	private static int[][] mem = new int[4][5];


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "BATD";
		String b = "ABACD";
		System.out.println(getSubSequence(a.toCharArray(), b.toCharArray(), a.length()-1, b.length()-1));
	}
	
	public static int getSubSequence(char[] a, char[] b , int i , int j) {
	int result =1;
		if(mem[i][j] != 0) {
			return mem[i][j];
		
		}
		if(i==0 || j==0) {  // base condition
			//result = 0;
			return 0;
		}
		else if(a[i] == b[j]) {
			result = getSubSequence(a, b, i-1, j-1);
			return result;
		}
		else  {
			int temp1 = getSubSequence(a, b, i-1, j);
			int temp2 =getSubSequence(a, b, i, j-1);
			mem[i][j] = 1+ Math.max(temp1, temp2);
			return 1+ Math.max(temp1, temp2);
		}
	}

}
