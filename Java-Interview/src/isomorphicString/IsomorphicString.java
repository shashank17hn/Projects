package isomorphicString;

import java.util.HashMap;
import java.util.Map;

/*Given two strings s and t, determine if they are isomorphic. Two strings are isomorphic if the characters in s can be replaced to get t.

For example,"egg" and "add" are isomorphic, "foo" and "bar" are not.*/

public class IsomorphicString {

	
	public static void main(String[] args) {
		
		String a = "egg";
		String b = "add";
		
		
		String c = "foo";
		String d = "bar";
		
		System.out.println(evaluate(a, b));
		System.out.println(evaluate(c, d));
		
	}
	
	public static boolean evaluate(String a , String b) {
		if(a.length() ==  b.length()) {
			return createKeyMap(a, b);
		}
		else 
			return false;
	} 
	
	public static boolean createKeyMap(String a , String b) {

		Map<Character, Character> map = new HashMap<>();
		for(int i =0 ; i<a.length() ; i++) {
			if(map.containsKey(a.charAt(i))){
				if(!map.get(a.charAt(i)).equals(b.charAt(i))) {
					return false;
				}
			}
			else {
				map.put(a.charAt(i), b.charAt(i));
			}
		}
		return true;
	}
}
