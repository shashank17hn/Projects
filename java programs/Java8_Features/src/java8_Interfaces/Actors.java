package java8_Interfaces;

public interface Actors {

	void act();
	
	default void dialog()
	{
		System.out.println("Actor speaks dialog");
	}
	
	static void fight()
	{
		System.out.println("Actor fights");
	}
}

/* use of default and static method in Java8 - >>>>>

*   Before this feature. It was difficult to add methods to interface which have been implemented
*   now after this any method can be added 
*   so that if class implementing interface wont have error if they wont have new methods.
*   Its not important to implement default / static methods of an Interface.
*
*/
