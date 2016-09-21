import java.util.InputMismatchException;
import java.util.Scanner;

/*#1 Print the number of integers in an array that are above the given input and the number that are below, e.g. for the array [1, 5, 2, 1, 10] with input 6, print “above: 1, below: 4”.
#2 Rotate the characters in a string by a given input and have the overflow appear at the beginning, e.g. “MyString” rotated by 2 is “ngMyStri”.
#3 If you could change 1 thing about your favorite framework/language/platform (pick one), what would it be?


Ans #3 -> I would modify my favorite language Java. I will modify system class and would add a class to it to simplify the method of taking system input because by using this several lines 
of code will be reduced. 
*/



public class ArrayAboveBelow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	inputList();
				
	}
	
	public static void inputList()
	{
		try{
			System.out.println("How many no.s you wish to enter : ");
		
			Scanner scan = new Scanner(System.in);
			int limit = scan.nextInt();
			int list[] = new int[limit];
			
			
			System.out.println("Enter the Numbers: ");
			
			
			for(int i = 0; i< limit; i++)
			{
				list[i] = scan.nextInt();
			}
			
			System.out.println("List is : ");
			for(int i = 0; i< limit; i++)
			{
				System.out.println(list[i]);
			}
			
			System.out.println("Enter the pivot: ");
			int pivot = scan.nextInt();
			computeAboveBelow(list,pivot);
		}
		catch(InputMismatchException ex)
		{
			System.out.println("Numbers please, try again");
			inputList();
		}
	}
	public static void computeAboveBelow(int list[], int pivot)
	{
		int above =0, below =0;
		
		for(int i = 0; i< list.length; i++)
		{
			if(list[i] > pivot)
			{
				above++;
			}
			
			else
			{
				below++;
			}
		}
		
		System.out.println("Above : " + above);
		System.out.println("below : " + below);
	}

}
