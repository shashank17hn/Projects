public class Search {

	
	public static boolean binary(int[] A, int value)
	{
		int low=0;
		int high = A.length-1;
		while(low<=high)
		{
			int mid=(low+high)/2;
			if(A[mid] == value)
				return true;
			else if(A[mid]> value)
			{
				high=mid-1;
			}
			else
			{
				low = mid+1;
			}
		}return false;
				
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] A = new int[]{5,6,8,3,7,9};
		int value = 7;
		System.out.println(binary(A,value));
		
	}

}
