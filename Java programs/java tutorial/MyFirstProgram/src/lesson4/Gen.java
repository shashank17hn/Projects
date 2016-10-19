package lesson4;
import java.util.*;

public class Gen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer[] a1 = {1,2,3,4};
		Character[] a2 = {'b','c','d','e'};
		
		printMe(a1);
		printMe(a2);
		
		
	}

/*
public static void printMe(Integer[] i)
{
	for(Integer x: i)
	{
		System.out.printf("%s", x);
	}
		
}

public static void printMe(Character[] i)
{
	for(Character x: i)
	{
		System.out.printf("%s", x);
	}
	
} */
	
	public static <T> void printMe(T[] i)
	{
		for(T x:i)
			System.out.printf("%s",x);
	}
}
