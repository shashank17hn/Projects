package zeroToEndArray;



public class Test {

	
	public static void main(String[] args)
	{
		int[] input = {14,0,5,8,0,3,0};
		int counter =0;
		
		for(int i =0 ; i<input.length ; i++)
		{
			if(input[i] != 0)
			{	
				System.out.println("now i" + counter + "and i+1 " +  input[i]);	
			   input[counter] = input[i];
				counter++;
			}
		}

		for(int i=counter+1; i<input.length; i++)
		{
			input[i] =0;
		}
		
		
		for(int i : input)
		{
			System.out.println(i);
		}
		
		
	}
}
