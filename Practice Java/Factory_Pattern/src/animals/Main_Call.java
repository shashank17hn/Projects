package animals;

import java.util.Scanner;

public class Main_Call {

	
	
	public static void main(String[] args)
	{
	
		System.out.println("Enter one of the animal from cat, dog or fox : ");
	
	Scanner scan = new Scanner(System.in);
	String input = scan.nextLine();
	
	Animal_Interface anim = new Animal_Interface();
	
     Animal animal = anim.create_object(input);
     animal.eat();
     
	}
	
}
