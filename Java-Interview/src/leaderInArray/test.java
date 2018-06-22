package leaderInArray;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] =  {14, 9, 11, 7, 8, 5, 3};
		
		for(int i=0; i<a.length-1; i++)
		{
			if(a[i]> a[i+1])
			{
				for(int j=i+1; j<a.length; j++)
				{ 
					//System.out.println("i " + a[i] + " j " + a[j]);
					if(a[i]>a[j] && (j==a.length-1))
					{
					
						
							System.out.println(a[i]);
						
					}
				
				}
			}
			
		   if(i==a.length-2)
			{
				System.out.println(a[i+1]);
			}
			
		}

	}

}
