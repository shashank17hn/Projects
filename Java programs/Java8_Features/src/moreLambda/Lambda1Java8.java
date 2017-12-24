package moreLambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Lambda1Java8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<People> people = Arrays.asList(
				new People("ghi" ,"GHI" , 3),
				new People("abc" ,"ABC" , 1),
				new People("jkl" ,"JKL" , 4),
				new People("def" ,"DEF" , 2)
				
				);
		
		System.out.println("Before Sorting");
		
		for(People list : people)
		{
			System.out.println(list.getFirstName() + " , " + list.getLastName() + " , " + list.getAge());
		}
		
		System.out.println("After Sorting");
		
		Collections.sort(people,(p1,p2) -> p1.getLastName().compareTo(p2.getLastName()));
			
		

		for(People list : people)
		{
			System.out.println(list.getFirstName() + " , " + list.getLastName() + " , " + list.getAge());
		}
		
		LastC(people, (p)-> true); // iif used true can be used to print whole list....
		
		//people.forEach(System.out.println(s.getFirstName() + " , " + list.getLastName() + " , " + list.getAge()));
		
		
		LastC(people, (p)-> p.getLastName().startsWith("D")); // lambda to print list with lastname D...
						
	}
	
	public static void LastC(List<People> people, Condition condition)
	{
		
		System.out.println("Testing for Specifically D");

		for(People list : people)
		{
			if(condition.testLast(list))
			{
				//System.out.println(condition.testLast(list));
			System.out.println(list.getFirstName() + " , " + list.getLastName() + " , " + list.getAge());
		}
	}
	

}
}

