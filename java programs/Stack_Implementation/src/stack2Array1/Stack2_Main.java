package stack2Array1;

public class Stack2_Main {
	
	public static void main(String[] args)
	{
		Stack_func sf = new Stack_func();
		sf.push1(1);
		sf.push1(2);
		sf.push1(3);
		sf.push2(4);
		sf.push2(5);
		
		
		System.out.println(sf.pop1());
		System.out.println(sf.pop1());
		System.out.println(sf.pop1());
		System.out.println(sf.pop2());
		System.out.println(sf.pop2());
	
	}

}