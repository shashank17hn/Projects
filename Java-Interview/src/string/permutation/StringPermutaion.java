package string.permutation;

import java.util.ArrayList;
import java.util.List;

public class StringPermutaion {
	
	public static void main(String args[]) {
		List<String> list = new ArrayList<>();
		String input = "123";
		list = permutation(input);
		System.out.println(list);
	}
	
	public static List<String> permutation(String input) {
		List<String> list = new ArrayList<>();
		list = doPermutation("", input ,list);
		return list;
	} 
	                                                 // 1          //23
	                                                 //12          //3
	                                                 //123         // 
	// for(3)
	// 1 = 4 
	
	
	
	public static List<String> doPermutation(String per, String input , List<String> list) {
		
		if(!input.isEmpty()) {
			for(int i =0 ; i< input.length() ; i++) {
				 System.out.println(per + '+' + input.charAt(i)+","+ input.substring(0, i) +"+" + input.substring(i+1,input.length()));
				doPermutation(per+input.charAt(i), input.substring(0, i) + input.substring(i+1,input.length()), list);
			}
		}
		else {
			System.out.println("combo " + per);
			list.add(per);
		}
		return list;
	}

}


