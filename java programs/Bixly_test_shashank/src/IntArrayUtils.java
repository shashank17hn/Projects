import java.util.*;
public class IntArrayUtils extends ArrayUtils {
	
	int Array_size;
	int[] Int_array = new int [50];
	int[] con = new int[20];

  
	void GenerateArray()
    {
    	
    	System.out.print("Enter the size of the array :");
        Scanner Scan1 = new Scanner(System.in);
        Array_size = Scan1.nextInt();
        System.out.println("Please Enter the array");
        for(int i = 0; i < Array_size;i++)
        {
        	Int_array[i]= Scan1.nextInt();
        }
        Scan1.close();
    }
    
	void DisplayArray()
	{
		for(int i = 0; i < Array_size;i++)
        {
        	System.out.print(Int_array[i] +" \t");
        }
		System.out.println();
	}
	void RemoveDuplicate()
	{
		int pos=0;
		Int_array[pos] = Int_array[0];
		for(int i = 0; i < Int_array.length;i++)
        {
        	if(Int_array[pos] != Int_array[i])
        	{
        		pos++;
        		Int_array[pos]= Int_array[i];
        	}
        }
		
		System.out.println("*** After removing duplicates ***");
		for(int i=0;i<= pos-1;i++)
		{ Array_size = pos-1;
			System.out.print(Int_array[i] + "\t");
		}
	}
	void consicutive()
	{ int i=0;
		for(int j = 0; j < Array_size ;j++)
		{
			
			if((Int_array[j]+1) != Int_array[j+1])
			{
				//System.out.print("*** not concecutive ***");
			}
			else
			{
				
				
				 con[i]= Int_array[j];
				 i++;
				 
				
			}
		}
		System.out.println("*** concecutive ***");
			for(int k=0; k<=i;k++)
			{
				
				System.out.print(con[k]);
			}
			
			
		}
		
	
	
	void Sorting()
	{
		
		for(int i = 0; i < Array_size ;i++)
		{
			
			for(int j = i; j < Array_size ;j++)
			{
				
			if(Int_array[i] > Int_array[j])
			{
				int temp = Int_array[i];
				Int_array[i]=Int_array[j];
				Int_array[j]= temp;
			}
			}
		}
	//	Arrays.sort(Int_array[]);
	
		System.out.println("*** After Sorting ***"); 
		
		for(int i = 0; i < Array_size;i++)
        {
        	System.out.print(Int_array[i] +" \t");
        }
	}
	

}
