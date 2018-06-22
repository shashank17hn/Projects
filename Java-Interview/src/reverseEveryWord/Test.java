package reverseEveryWord;

public class Test {
	
	
	public static void main(String[] args) {
		
		String given = "Java Concept Of The Day";
		String[] words = given.split(" ");
	
		String sentence ="";
		
		for(int i=0; i<words.length ; i++)
		{
			
			
			
			char[] letter = words[i].toCharArray();
			
			String rWord="";
			for(int j =words[i].length()-1 ;j>=0 ; j--)
			{
				
				
				rWord= rWord+letter[j];
			}
			sentence = sentence  +rWord + " ";
		}
		
		System.out.println(sentence);
	
	}
}
