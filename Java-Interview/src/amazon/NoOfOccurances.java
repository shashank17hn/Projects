package amazon;

/*Given an integer X within the range of 0 to 9, and given two positive integers as upper and lower bounds respectively, find the number of times X occurs as a digit in an integer within the range, excluding the bounds. Print the frequency of occurrence as output.
 * 
 * 3 in 
100 250
o/p 35
*/
public class NoOfOccurances {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       System.out.println(occurances(100 , 250, "3"));
       System.out.println("--------------------");
     //  System.out.println(occurancesNaive(100 , 250, "3"));
		
	//	System.out.println("dsfsgd".indexOf('e'));
	//	System.out.println("dsfsdf".contains("s"));
	}
	
	
	public static int occurances(int start , int end , CharSequence k) {
		//CharSequence k = textView.setText(new String(new char[] {c} ));
		int counter =0;
		while(start <= end) {
			String temp = Integer.toString(start);
			if(temp.contains(k)) {
				counter++;
				System.out.println(start + " " + counter);
				if(Integer.toString(start/10).contains(k)) {
					counter = counter + 9;
					counter++;
				}
				if(start +10 <= end)
				start = start +10;
				else {
					start++;
				}
			}
			else if(!temp.contains(k)) {
				start = start+1;
			}
			
		}
		
		return counter;
	}

	
	public static int occurancesNaive(int start , int end , CharSequence k) {
		//CharSequence k = textView.setText(new String(new char[] {c} ));
		int counter =0;
		while(start <= end) {
			String temp = Integer.toString(start);
			if(temp.contains(k)) {
				counter++;
				System.out.println(start + " " + counter);
			}
			start++;
		}
		
		return counter;
	}
}
