/*Sample Input

cde
abc
Sample Output

4
Explanation

We delete the following characters from our two strings to turn them into anagrams of each other:

Remove d and e from cde to get c.
Remove a and b from abc to get c.
We must delete  characters to make both strings anagrams, so we print  on a new line.

Sample Input

fcrxzwscanmligyxyvym
jxwtrhvujlmrpdoqbisbwhmgpmeoke
Sample Output

30
Explanation


*/


package cracking.code.interview;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class MakingAnagrams {

	public static int numberNeeded(String first, String second) {
	    List<Integer> list = new ArrayList<>();
	 
	    
	    Map<Character, Integer> map1 = createMap(first);
	    Map<Character, Integer> map2 = createMap(second);
	    
	    map1.keySet().forEach(x-> {
	      if(map2.containsKey(x))
	      {
	    	  int count = Math.min(map1.get(x), map2.get(x));
	    	 for(int i=0 ; i< count ; i++)
	    		 list.add(1);
	      }});
	    list.stream().forEach(x->System.out.print(x + " "));
	    System.out.println();
	 
	    return (first.length()-list.size()) + (second.length()-list.size());
		
    }
	
	public static  Map<Character, Integer> createMap(String inputString)
	{ 
		Map<Character, Integer> map = new HashMap<>();
		   for(int i =0  ; i< inputString.length() ; i++ ) {
		    	if(map.containsKey(inputString.charAt(i))) {
		    		map.put(inputString.charAt(i), map.get(inputString.charAt(i)) +1 );
		    	}
		    	else
		    		map.put(inputString.charAt(i), 1);
		    }
		   return map;
	}
  
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.next();
        String b = in.next();
        System.out.println(numberNeeded(a, b));
    }

}
