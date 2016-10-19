package patterns;

public class Pangram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String S = "Freight to me sixty dozen quart jars and twelve ";
		int length =0;
		length= S.length();
		if(length < 26)
		{
			System.out.println("False");
		}
	
			for(char c = 'A'; c<='Z'; c++)
			{
			   if((S.indexOf(c)<0) && (S.indexOf((char)(c + 32)) < 0))
			   {
				   System.out.println("False");
			   }
			}
			System.out.println("True");
		
              

	}

}
