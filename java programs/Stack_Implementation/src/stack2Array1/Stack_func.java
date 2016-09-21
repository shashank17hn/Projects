package stack2Array1;

public class Stack_func {
	
	private int[] Array;
	private int top1, top2;
	private int Maxsize;
	
	public Stack_func()
	{
		
		Maxsize =5;
		Array = new int[Maxsize];
		top2 = Maxsize;
		top1 =-1;
	}
	
	public void push1(int item)
	{
		if(top1<top2 -1)
		{
			Array[++top1] = item;
			
		}
		
		else
		{
			System.out.println("Stack 1 is full");
			
		}
	}
	
	public void push2(int item)
	{
		if(top1< top2-1)
		{
			Array[--top2] = item;
		}
		else
		{
			System.out.println("Stack 2 is full");
			
		}
		
	}
	
	public Integer pop1()
	{
		if(top1>=0)
		{
			int x= Array[top1];
			top1--;
			return x;
		}
		else
		{
			System.out.println("Stack 1 is empty");
			return null;
		}
	}
	
	public Integer pop2()
	{
		if(top2< Maxsize)
		{
			int x= Array[top2];
			top2++;
			return x;
		}
		else
		{
			System.out.println("Stack 2 is empty");
			return null;
		}
		
	}
	

}
