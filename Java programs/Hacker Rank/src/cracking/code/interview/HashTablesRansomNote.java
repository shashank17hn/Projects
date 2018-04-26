package cracking.code.interview;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*Output Format

Print Yes if he can use the magazine to create an untraceable replica of his ransom note; otherwise, print No.

Sample Input 0

6 4
give me one grand today night   
give one grand today       
Sample Output 0

Yes
Sample Input 1

6 5
two times three is not four
two times two is four
Sample Output 1

No


6 4
give me one grand today night   // magazine
give one grand today       // ransom
*
*
*
*/

public class HashTablesRansomNote {

	 public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        int m = in.nextInt();
	        int n = in.nextInt();
	        String magazine[] = new String[m];
	        int counter =0;
	        for(int magazine_i=0; magazine_i < m; magazine_i++){
	            magazine[magazine_i] = in.next();
	        }
	        String ransom[] = new String[n];
	        for(int ransom_i=0; ransom_i < n; ransom_i++){
	            ransom[ransom_i] = in.next();
	        }
	        
	        Map<String, Integer> magazineMap = createMap(magazine);
	        Map<String, Integer> ransomMap = createMap(ransom);  
	        
	        for(String e : ransomMap.keySet()) {
	        	if(magazineMap.containsKey(e))
	        	{
	        		if(!(ransomMap.get(e) <= magazineMap.get(e)))
	        		{
	        			counter++;
	        		}
	        		
	        	}
	        }
	        if(counter > 0) {
	        	System.out.println("No");
	        }else {
	        	System.out.println("Yes");
	        }
	        
	    }
	 
	 public static  Map<String, Integer> createMap(String[] inputString)
		{ 
			Map<String, Integer> map = new HashMap<>();
			   for(int i =0  ; i< inputString.length ; i++ ) {
			    	if(map.containsKey(inputString[i])){
			    		map.put(inputString[i], map.get(inputString[i]) +1 );
			    	}
			    	else
			    		map.put(inputString[i], 1);
			    }
			   return map;
		}
	 
	 

}
