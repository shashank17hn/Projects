package longest.consecutive.characters;

public class LongestConsecutiveCharacter {

	
	// Given a string, find the longest subsequence consisting of a single character.  Example: longest("ABAACDDDBBA") should return {'D': 3}.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s= "ABAACDDDBBA";
		System.out.println(getLongestConsecutiveChar(s));

	}

	public static String getLongestConsecutiveChar(String s) {
		
		char[] temp = s.toCharArray();
		int max =0;
		char maxChar = 'A';
		int counter =1;
		for(int i =0 ; i< temp.length-1 ; i++ ) {
			if(temp[i] == temp[i+1]) {
				counter++;
			}
			else if(temp[i] != temp[i+1]) {
				if(max < counter) {
					max = counter;
					maxChar = temp[i];
				}
				counter =1;
			}
		}
	

		return maxChar + " : " + Integer.toString(max);
	}
}
