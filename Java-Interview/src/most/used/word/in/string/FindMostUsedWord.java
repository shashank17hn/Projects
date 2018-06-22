package most.used.word.in.string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/*You have been given a "text" and "excluded words list" which can include special characters like ', etc. 
so you have to find out most used word in that text and exclude "excluded words" from your calculation
*/

public class FindMostUsedWord {

	public static void main(String[] args) {
	
		List<String> excludedList = new ArrayList<>();
		excludedList.add("is");
		excludedList.add("a");
		excludedList.add("an");
		excludedList.add("the");
		
		String text = "He is a very good boy, he is a nice person too. Shashank's car is good.";
		System.out.println(getMostUsedWord(text , excludedList));

	}

	public static List<String> getMostUsedWord(String text , List<String> excludedList){
		
		String[] words = text.toLowerCase().replaceAll("[^a-zA-z0-9+//s]", " ").split(" ");
		// Arrays.stream(words).forEach(x -> System.out.println(x));
		
		Set<String> excluded = new HashSet<>(excludedList);
		Map<String, Integer> wordCount = new HashMap<>();
		List<String> result = new ArrayList<>();
		int max=0;
		
		for(int i=0 ; i<words.length ; i++) {
			String temp = words[i].trim();
			if(!excluded.contains(temp) && !temp.equals("")) {
				if(wordCount.containsKey(temp)) {
					wordCount.put(temp, wordCount.get(temp)+1);
					// to count max, using if inside this loop will reduce one loop which is commented below
					if(wordCount.get(temp) > max) {
						max = wordCount.get(temp);
					}
				}
				else {
					wordCount.put(temp, 1);
				}
			}
		}
		
	     // this loop can be avoided if we find max while constructing map above
		/*for(Map.Entry<String, Integer> e : wordCount.entrySet()) {
			if(e.getValue() > max) {
				max = e.getValue();
			}
		}*/	
		
	// 	System.out.println(max);
		for(Map.Entry<String, Integer> e : wordCount.entrySet()) {
			if(e.getValue() == max) {
				result.add(e.getKey());
			}
		}	
		
		
		return result;
	} 
}
