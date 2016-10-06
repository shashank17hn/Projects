package comparator_Impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class StringCompareValue implements Comparator<String>
{

	@Override
	public int compare(String s1, String s2) {

		/*int length = s1.length();
		int length2 = s2.length();
		
		if(length >length2)
		{
			return 1;
		}
		else if(length2> length)
		{
			
			return -1;
		}
		
		// TODO Auto-generated method stub
		return 0;*/
		
		return s1.compareTo(s2);
	}

		
	
}



public class ComparatorEX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> list = new  ArrayList<String>();
		
		list.add("bcgde");
		list.add("acgerwer");
		list.add("ecge");
		list.add("dcg");
		
		
		Collections.sort(list, new StringCompareValue());
		
		for(String str : list )
		{
			System.out.println(str);
			
		}
		

	}

}
