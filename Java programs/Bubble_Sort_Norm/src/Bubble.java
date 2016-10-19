
public class Bubble {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] A = new int[]{10,39,29,46,5,6,3,6,9};
		int size = A.length;;
		for(int i=0;i< size;i++)
		{
			for(int j=0; j < size-1; j++)
			{
				if(A[j] > A[j+1])
			     {
					int temp = A[j];
					A[j] = A[j+1];
					A[j+1] = temp;
			     }
			}
				
		}
		
		for(int i=0;i< A.length;i++)
		{
			System.out.println(A[i]);
		}
		
		
	}

}
