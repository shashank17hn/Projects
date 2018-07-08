package medianOfTwoSortedArrays;

public class MedianOfTwoSortedArrays {

	public static double findMedian(int arr1[], int n ,int arr2[], int m ) {
		
		int start =0;
		int end = n;
		int xpart = 0; 
		int ypart = 0; 
		double median =0;
		while(start<=end) {
			xpart = (start+end)/2;
			ypart = ((n+m+1)/2)-xpart;
			if(xpart<n && arr2[ypart-1] > arr1[xpart] && ypart >0){
				xpart++;
			}
			else if(ypart<m && arr2[ypart] < arr1[xpart-1] && xpart >0)
				ypart--;
			else {
				if(((n+m)/2) % 2!=0) {
					if(xpart==0) {
					 	return median = arr2[ypart-1];
					}
					else if(ypart==0) {
						return	median = arr1[xpart-1];
					}
					else {
						return	median = Math.max(arr2[ypart-1], arr1[xpart-1]);
					}
					
				}
				else {
					if(xpart==0) {
					 	return median = (arr2[ypart]+arr2[ypart-1])/2;
					}
					else if(ypart==0) {
						return median = (arr1[xpart-1]+arr1[xpart])/2;
					}
					else {
						return	median = (Math.max(arr2[ypart-1], arr1[xpart-1]) + Math.min(arr2[ypart], arr1[xpart]))/2;
					}
				}
			}
		}
		return median;
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	int arr1[] = {-5, 3, 6, 12, 15};
     //   int arr2[] = {-12, -10, -6, -3, 4, 10};
        

        int arr1[] = new int[]{900};
        int arr2[]  = new int[]{10, 13, 14};
        
        int n = arr1.length;
        int m = arr2.length;
        if(n<=m) {
        	System.out.println(findMedian(arr1, n, arr2, m));
        }
        else {
        	System.out.println(findMedian(arr2, m, arr1, n));
        }
		

	}

}
