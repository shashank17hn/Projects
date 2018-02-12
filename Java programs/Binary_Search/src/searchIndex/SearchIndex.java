package searchIndex;

public class SearchIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = new int[]{5,6,8,3,0,7,9,10};
		searchIndex(A,9);
	
	}
	
	public static void searchIndex(int a[] , int x){
		
		int mid = a.length/2;  
		int low =0;
		int high = a.length-1;
		int result =0;
		//System.out.println(mid);
		
		while(low<=high)
		{
			if(a[mid] == x){
				
			
			}
			if(a[mid] < x)
				{
				low = mid+1;
				mid = low + (low + high)/2; // 3 + 6 = 9/2 =4.5
				}
			else if(a[mid] > x) 
			{
				high = mid-1;
				mid = low + (low + high)/2;
				
			}
				
		}
		System.out.println(x);
		
	}

}
