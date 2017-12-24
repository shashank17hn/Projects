
public class Stack {

	private int[] object;
	private int MaxSize;
	private int top;
	
	Stack()
	{
		MaxSize =1;
		object = new int[MaxSize];
		top= -1;
	}
	
	public void push(int item)
	{
		if(top>= MaxSize -1 )
		{
			resize();
		}
		System.out.println("Item Pushed : " + item);
			object[++top] = item;
		
	}
	
	public Integer pop()
	{
		if(top<0)
		{
			System.out.println("Stack is empty");
			return null;
		}
		else
		{
			System.out.println("Item Popped");
			return object[top--];
			
		}
	}
	
	public void print()
	{
		for(int i=0;i<=top;i++)
		{
			System.out.println("Stack Element" + i + " : " + object[i]);
		}
	}
	
	public void resize()
	{
		int[] temp = object;
		
		MaxSize = MaxSize *2;
		object = new int[MaxSize];
		for(int i=0;i<=top;i++)
		{
			object[i] = temp[i];
		}
		
	}
	
}