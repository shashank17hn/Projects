package sib_iib;

public class SibIib {

	static 
	{
		System.out.println("From SIB - Static Initialization Block");  // will execute only once to be in memory
	}
	
	static 
	{
		System.out.println("From SIB 2 - Static Initialization Block");  // will execute only once to be in memory
	}
	
	{
		System.out.println("From IIB - Instance Initialization Block");  // will execute when the object is created. no of object = no of execution 
		
	}
	
	{
		System.out.println("From IIB 2 - Instance Initialization Block");  // will execute when the object is created. no of object = no of execution 
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// without object only SIB and SIB 2 will execute
		
		SibIib si = new SibIib();
		SibIib si2 = new SibIib();
		 // now IIB and IIb2 will also execute
	}

}
