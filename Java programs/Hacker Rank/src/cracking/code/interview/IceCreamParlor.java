/*Input Format

The first line contains an integer, , denoting the number of trips to the ice cream parlor. The  subsequent lines describe all of Sunny and Johnny's trips to the parlor; each trip is described as follows:

The first line contains .
The second line contains .
The third line contains  space-separated integers denoting the cost of each respective flavor. The  integer corresponds to the cost, , for the ice cream with ID number  (where ).

Sample Input

2
4
5
1 4 5 3 2
4
4
2 2 4 3
Sample Output

1 4
1 2
Explanation

Sunny and Johnny make the following two trips to the parlor:

The first time, they pool together  dollars. There are five flavors available that day and flavors  and  have a total cost of . Thus, we print 1 4 on a new line.
The second time, they pool together  dollars. There are four flavors available that day and flavors  and have a total cost of . Thus, we print 1 2 on a new line.


1
4
5
1 4 5 3 2
*/

package cracking.code.interview;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class IceCreamParlor {

	 // Complete the solve function below.
  

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            int money = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            int n = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            int[] arr = new int[n];

            String[] arrItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int i = 0; i < n; i++) {
                int arrItem = Integer.parseInt(arrItems[i]);
                arr[i] = arrItem;
            }

            solve(arr, money);
        }

        scanner.close();
    }
    
    
    // double loop
    static void solve(int[] arr, int money) {
    	Map<Integer,Integer> map = new HashMap<>();
    	for(int i =0 ; i< arr.length ; i++) {
    		map.put(arr[i], i);
    	}
    	System.out.println(map);
    	for(int i =0 ; i< arr.length ; i++) {
    		int leftAmount = money =  arr[i];
    		if(map.containsKey(leftAmount) && map.get(leftAmount)!=i) {
    			System.out.print(i + " " +map.get(leftAmount)); 
    		}
    		
    	}
    	

    }
    
    // single loop
    static void solve1(int[] arr, int money) {
    	Map<Integer,Integer> map = new HashMap<>();
    	for(int i =0 ; i< arr.length ; i++) {
    		int leftAmount = money =  arr[i];
    		if(map.containsKey(leftAmount)) {
    			System.out.print(map.get(leftAmount) + " " +i); 
    			break;
    		}
    		map.put(arr[i], i);
    	}
    
    	

    }
    
}
