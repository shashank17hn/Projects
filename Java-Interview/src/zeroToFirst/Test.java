package zeroToFirst;

public class Test {
	
	
	public static void main(String[] args)
	{
		
		int[] input = {14,0,5,8,0,3,0};
		int counter =input.length-1;
		
		for(int i = input.length-1; i>=0 ;i--)
		{
			if(input[i] !=0)
			{
				System.out.println("now i" + counter + "and i+1 " +  input[i]);	
				input[counter] = input[i];
				counter--;
			}
		}
		for(int i= counter; i>=0; i-- )
		{
			input[i]= 0;
		}
		
		for(int i : input)
		{
			System.out.println(i);
		}
	}

}
