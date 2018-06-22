package amazon;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class HypotenuseAlgo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {3, 1, 4, 6, 5};
		int arr2[] = {10, 4, 6, 12, 5};
		//System.out.println(  getHypotenues(arr));
		//System.out.println(  getHypotenues(arr2));
		
		System.out.println(  getHypotenues2(arr));
		//System.out.println(  getHypotenues2(arr2));

	}
	
	public static boolean getHypotenues(int arr[]) {
		
		int sqArr[] = new int[arr.length];
		Set<Integer>  sqSet = new TreeSet<>();
		boolean isHypotenues = false;
		for(int i=0 ; i<sqArr.length ; i++) {
			sqSet.add(Integer.valueOf((int)Math.pow(arr[i], 2)));
		}
		System.out.println(sqSet);
	
		Iterator<Integer> it = sqSet.iterator(); 
		while(it.hasNext())
		{
			Integer a =  it.next();
		//	System.out.println("first"  + it.next());
			if(it.hasNext()) {
				// System.out.println("second"  + it.next());
				Iterator<Integer> it2 = sqSet.iterator();
				while(it2.hasNext()) {
					it2.next();
					if(it2.hasNext()) {
						Integer b =  it2.next();	
						if(sqSet.contains(a+b))
						{
							System.out.println(a + "  " + b);
							isHypotenues = true;
						}
					}
				}
				
		
				
			}
			
		}
		
		return isHypotenues;
		
		
	}
	
	
public static boolean getHypotenues2(int arr[]) {
		
		int sqArr[] = new int[arr.length];
		boolean isHypotenues = false;
		for(int i=0 ; i<sqArr.length ; i++) {
		   sqArr[i] =	(int)Math.pow(arr[i], 2);
		}
	
		
		for (int k=sqArr.length-1 ; k>=0 ; k--) {
			
			for(int i=sqArr.length-1 ; i>=0 ; i--) {
				
				for(int j=sqArr.length-2 ; j>=0 ; j--) {
					
					if(sqArr[k] == sqArr[i] + sqArr[j]) {
						System.out.println(sqArr[k] + " " + sqArr[i] + " " + sqArr[j]);
						System.out.println(sqArr[i] + sqArr[j]);
						isHypotenues = true;
						return isHypotenues;
					}
					
				}
			
					
			}
		
		}

		return isHypotenues;
		
		
	}


}
