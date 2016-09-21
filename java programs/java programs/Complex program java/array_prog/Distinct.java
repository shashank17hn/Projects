package array_prog;

public class Distinct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {2,1,1,2,3,1};
		int un =a[0];
		
		//for(int i=0;i<= (a.length-1);i++)
		//{
			for(int j=1;j<=(a.length-2);j++)
			{
				if(un!= a[j])
				{
				  un = a[j];
				 // System.out.println(un);
				}
			}
		//}
		System.out.println(un);
		

	}

}
