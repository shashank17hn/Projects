package Lesson_input;

import java.util.Scanner;

public class MyClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan = new Scanner(System.in);
System.out.println("Enter no");
int a = scan.nextInt();
System.out.println("entered no is");
System.out.print(a);


Scanner scan1 = new Scanner(System.in);
System.out.println("Enter char");
String b = scan1.nextLine();
System.out.println("entered text is" + b);
//System.out.print(b);

switch(a)

{
case 10:
	System.out.println("Smart");
	break;
case 20:
case 30:
	System.out.println("good book for both");
	break;
	
}
	}

}
