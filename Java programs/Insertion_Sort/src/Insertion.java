
public class Insertion {
	
	public static void sort(int[] array)
	{
		int i,j,key;
		
		
		for(i=1 ; i < array.length ; i++)
		{
			j= i-1;   // 0 
			key=array[i];  //1
			while(j>=0 && array[j]>key)
			{
			   array[j+1] =array[j];	 // 1 = 0 , 2 =1 
			   j= j-1;
			}
			array[j+1] = key;   
					
		}
		for(int k=0; k< array.length; k++)
		{
			System.out.println(array[k]);
		}
			
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] array = new int[]{12,1,5,3,4};
		sort(array);
		
		
	}

}
