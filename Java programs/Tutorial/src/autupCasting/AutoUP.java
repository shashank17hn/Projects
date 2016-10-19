package autupCasting;

class A
{

	int i =10;
	
	void print()
	{
		System.out.println("From Class A");
	}
}

class B extends A
{

	int j =20;

	void print()
	{
		System.out.println("From Class B");
	}
}

class C extends B
{
	
	int k = 30;

	void print()
	{
		System.out.println("From Class c");
	}
}

public class AutoUP {

	public static void main(String[] args) {
		
		
		
		
		//System.out.println(null);
		C c = new C();
		B b = c;
		A a = c;                               // Autoup casting (its asafe)
		
		b.print();              
		a.print();
		
		//********************************************//
		
		A a1 = new A();
	//	B b1 = (B)a1;                          // Down casting (its not safe)
	//	C c1 = (C)a1;
		
	//	c1.print();
	//	b1.print();
		A o1 = new C( ); 
		B o2 = (B) o1;
		
		
		
		

	}

}
