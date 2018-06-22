package anagram2;

import java.util.Arrays;

public class test {

	public static void main(String[] args) {
		
		String given = "abababab";
		String given2 ="aaaabbbb";
		
		char[] a = given.replaceAll("//s","").toLowerCase().toCharArray();
		char[] b = given2.replaceAll("//s", "").toLowerCase().toCharArray();
		
		for(int i=0 ; i<a.length-1; i++)
		{
			for(int j =i+1 ; j<a.length ; j++ )   
				{
					if(a[i] > a[j])
					{
						char temp = a[i];
						a[i]= a[j];
						a[j]= temp;
					}
					
					if(b[i] > b[j])
					{
						char temp = b[i];
						b[i]= b[j];
						b[j]= temp;
					}
				}
		}
		
		
		for(char x : a)
		{
		System.out.println(x);
		}
		System.out.println("-----------------------");
		for(char x : b)
		{
		System.out.println(x);
		}
		
		if(Arrays.equals(a, b))
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("False");
		}

	}

}
