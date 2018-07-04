package subarray;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SubArrayAddsUpToNo {

	public static Set<List> globalSet = new HashSet<>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2,4,6,6,10};  //16
		int exSum = 16;
		
		List<Integer> list = new ArrayList<>();
		System.out.println(getSubArray(arr, exSum));
		System.out.println(getSubArray2(arr, exSum, arr.length-1 ,0,list));
		System.out.println(getSubArray2(arr, exSum, 0 ,0,list));
		System.out.println(globalSet);

	}
	
	public static Set<List> getSubArray(int[] arr ,int sum) {
		
		Set<List> set = new HashSet<>();
		for(int i=0 ; i< arr.length ; i++) {
			List<Integer> list = new ArrayList<>();
			list.add(arr[i]);
			int s= arr[i];
			//System.out.println(s);
			
			if(i != arr.length) {
				for(int j=i+1 ; j< arr.length ; j++) {
					if(s < sum) {
					//	System.out.println("j " + j);
						s = s + arr[j];
					//	System.out.println("s " + s);
						list.add(arr[j]);
						if(s == sum) {
						//	System.out.println("List--> " + list);
							set.add(list);
							//break inner;
						}
					}
				}
			}
		}
		return set;
	}
	
	public static int getSubArray2(int[] arr, int sum , int n , int tot, List<Integer> list) {
		
		if(tot > sum  || n<0) {
			return 0;
		}
		
		else if(sum == tot ) {
		
			globalSet.add(list);
			return tot;
		}
		else {
			
			//  list.add(arr[n]);
			return  tot = getSubArray2(arr, sum, n-1,tot, list) + getSubArray2(arr, sum, 1,tot, list) ;
		}
			
	}

}
