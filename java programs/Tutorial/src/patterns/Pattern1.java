package patterns;

public class Pattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int pat [][] = new int[3][];
		pat[0]= new int [1];
		pat[1]= new int [2];
		pat[2]= new int [3];

		
		for(int i=0; i<3;i++)
		{
			for(int j=0;j<i+1;j++ )
			{
				pat[i][j] = 1;
			}
		}
		for(int i=0; i<3;i++)
		{
			for(int j=0;j<i+1;j++ )
			{
				System.out.println(pat[i][j]);
			}
		}
	}

}
