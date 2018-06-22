package sumEqualPairOfElement;

import java.util.stream.IntStream;

public class Test {

	public static void main(String[] args)
	{
	   int a[] ={4, 5, 7, 11, 9, 13, 8, 12};
	   int sum = 20; //IntStream.of(a).sum();
	   System.out.println(sum);
	   for(int i=0; i<a.length-1 ;i++)
	   {
		   for(int j= i+1 ; j<a.length; j++)
		   {
			   if(a[i] +a[j] == sum)
			   {
				   System.out.println(a[i] + " , " +a[j] );
			   }
		   }
		   
	   }
	   
	}
}
