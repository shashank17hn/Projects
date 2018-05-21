/*Sample Input 0

4 1
3 10 2 9
12
Sample Output 0

5
Explanation 0 
Anna didn't eat item , but she shared the rest of the items with Brian. The total cost of the shared items is  and, split in half, the cost per person is . Brian charged her  for her portion of the bill. We print the amount Anna was overcharged, , on a new line.

Sample Input 1

4 1
3 10 2 9
7
Sample Output 1

Bon Appetit
Explanation 1 
Anna didn't eat item , but she shared the rest of the items with Brian. The total cost of the shared items is 14 and, split in half, the cost per person is 7. Because 7=7 , we print Bon Appetit on a new line.

*/


package algorithm.challanges;

import java.util.Scanner;

public class BonAppetit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		int arrLength = scan.nextInt();
		int rmItem = scan.nextInt();
		int arr[] = new int[arrLength];
		for(int i =0 ; i<arrLength ; i++)
		{
			arr[i] = scan.nextInt();
		}
		int amtGiven = scan.nextInt();
		scan.close();
		
		bonAppetite(amtGiven, rmItem, arr);
	}
	
	public static void bonAppetite(int amt, int rmItem , int arr[])
	{
		int total=0;
		for(int i =0 ; i<arr.length ; i++ ) {
			if(i !=  rmItem) {
			total =total + arr[i];	
			}
		}
		
		if(total/2 == amt)
			System.out.println("Bon Appetit");
		else
			System.out.println(amt - total/2);
	}

}
