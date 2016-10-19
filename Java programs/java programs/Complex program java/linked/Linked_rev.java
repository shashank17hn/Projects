package linked;

import java.util.*;

public class Linked_rev {

	public static void main(String[] args) {
		
		String[] arr = {"abc", "def","efg", "hig"};
		List<String> list1 = new LinkedList<String>();
		for (String x: arr)
		{
			list1.add(x);
		}
		
		String[] arr2 = {"bnbn", "hjhj","jkjk","hjk"};
		List<String> list2 = new LinkedList<String>();
		for (String x: arr2)
		{
			list2.add(x);
			
		}
		list1.addAll(list2);
		for (String x: list1 )
		{
		System.out.printf("%s",x);
		
		}
		System.out.println();
		
		list1.subList(3, 5).clear();
		for (String x: list1 )
		{
		System.out.printf("%s",x);
		
		}
		System.out.println();
		ListIterator<String> rev =  list1.listIterator(list1.size());
		while(rev.hasPrevious())
		{
			System.out.printf(rev.previous());
		}
		}
		
	}
		


