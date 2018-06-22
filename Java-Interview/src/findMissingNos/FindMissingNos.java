package findMissingNos;

import java.util.Arrays;
import java.util.BitSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class FindMissingNos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 // one missing number
        printMissingNumber(new int[]{1, 2, 3, 4, 6}, 6);
 
        // two missing number
        printMissingNumber(new int[]{1, 2, 3, 4, 6, 7, 9, 8, 10}, 10);
 
        // three missing number
        printMissingNumber(new int[]{1, 2, 3, 4, 6, 9, 8}, 10);
 
        // four missing number
        printMissingNumber(new int[]{1, 2, 3, 4, 9, 8}, 10);
 
        // Only one missing number in array
        //int[] iArray = new int[]{1, 2, 3, 5};
       // int missing = getMissingNumber(iArray, 5);
       // System.out.printf("Missing number in array %s is %d %n", 
         //                  Arrays.toString(iArray), missing);
        
/*        Map<Integer,String> map = new HashMap<>();
        map.put(1, "abd");
        map.put(2, "abe");
        map.put(3, "abr");
        map.put(4, "abt");
        
        map.entrySet().forEach(e -> {
        	System.out.println(e.getKey() + e.getValue());
        });
        
        Iterator<Integer> it = map.keySet().iterator();
        while(it.hasNext()) {
        	System.out.println(map.get(it.next()));
        }
        
        for(Integer i : map.keySet()) {
        	System.out.println(map.get(i));
        	
        }
        
        map.keySet().forEach(e -> {
        	System.out.println(map.get(e));
        });*/
        

	}
	
	 private static void printMissingNumber(int[] numbers, int count) {
	        int missingCount = count - numbers.length;
	        BitSet bitSet = new BitSet(count);
	        
	    
	 
	        for (int number : numbers) {
	            bitSet.set(number - 1);
	        }
	 
	        System.out.println(bitSet);
	        System.out.println(bitSet.get(1));
	        System.out.printf("Missing numbers in integer array %s, with total number %d is %n",Arrays.toString(numbers), count);
	        int lastMissingIndex = 0;
	        System.out.println(missingCount);
	        System.out.println(lastMissingIndex);
	        for (int i = 0; i < missingCount; i++) {
	            lastMissingIndex = bitSet.nextClearBit(lastMissingIndex);
	            System.out.println("check"+  ++lastMissingIndex);
	        }
	 
	    }

}
