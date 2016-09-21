
public class Max_heap {
	
	private int capacity;
	private int[] heap;
	private int pos;
	
	public Max_heap()
	{
		pos= 1;
		capacity =10;
		heap = new int[capacity];
		
		
	}
	
	public void insert(int value)
	{
		if(pos == capacity)
		{
			System.out.println("heap is full");
		}
		else{
			heap[pos++] = value;
		    
			int child = pos-1;
			int parent = child/2;
			
			while((heap[parent] < heap[child]) && parent >0)
			{
				int temp = heap[parent];
				heap[parent] = heap[child];
				heap[child]= temp;
				
				child = parent;
				parent = child/2;
			}
			
		}
			
	 }
		
		public void print()
		{
			for(int i=1; i< pos; i++ )
			{
				System.out.print(heap[i] + "  ");
			}
		}
		
		
	}


