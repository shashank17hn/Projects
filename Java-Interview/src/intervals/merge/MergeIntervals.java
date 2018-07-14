package intervals.merge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.ListIterator;

public class MergeIntervals {
	
	static class Interval{
		int start;
		int end;
		
		public Interval(){};
		
		public Interval(int start , int end) {
			this.start = start;
			this.end = end;
		}
		
	}
	
/*	Given a collection of intervals, merge all overlapping intervals.

	For example,
	Given [1,3],[2,6],[8,10],[15,18],
	return [1,6],[8,10],[15,18].*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer[]> list = new ArrayList<>();
		Integer a[] = {1,3};
		Integer b[] = {2,6};
		Integer c[] = {8,10};
		Integer d[] = {15,18};
		list.add(a);
		list.add(b);
		list.add(c);
		list.add(d);
		//System.out.println(list);
		mergeIntervals(list);
		
		List<Interval> list2 = new ArrayList<>();
		list2.add(new Interval(1, 3));
		list2.add(new Interval(8, 10));
		list2.add(new Interval(2, 6));
		list2.add(new Interval(15, 18));
		mergeIntervalsUsingClass(list2);
	}

	public static void mergeIntervals(List<Integer[]> list) {
		
	
		
		List<Integer[]> temp = new ArrayList<>();
		for(int i =1 ; i< list.size() ; i++) {
			Integer[] arr1  = list.get(i-1);
			Integer[] arr2  = list.get(i);
			
			/*System.out.println("arr1 \n");
			Arrays.stream(arr1).forEach(s-> System.out.print(s + " "));
			System.out.println("arr2 \n");
			Arrays.stream(arr2).forEach(s-> System.out.print(s + " "));
			*/
			if(arr1[1] < arr2[1] && arr2[0] <= arr1[1]) {
				System.out.println("added : " + arr1[0] + " "+ arr2[1]);
				Integer[] arr = {arr1[0] , arr2[1]};
				temp.add(arr);
			}else 
				temp.add(arr2);
		}
		
		System.out.println("interval");
		temp.stream().forEach(s -> System.out.println(s[0] + " " + s[1]));
		
	}
		
	public static void mergeIntervalsUsingClass(List<Interval> list) {
		
		list.sort(new Comparator<Interval>() {

			@Override
			public int compare(Interval o1, Interval o2) {
				if(o1.start < o2.start) {
					return -1;
				}else return 1;
			}
		});
	
			List<Interval> temp = new ArrayList<>();
			for(int i =1 ; i< list.size() ; i++) {
				Interval arr1  = list.get(i-1);
				Interval arr2  = list.get(i);
		
				if(arr1.end < arr2.end && arr2.start <= arr1.end) {
					System.out.println("added : " + arr1.start + " "+ arr2.end);
					Interval arr = new Interval(arr1.start , arr2.end);
					temp.add(arr);
				}else 
					temp.add(arr2);
			}
			
			System.out.println("interval");
			temp.stream().forEach(s -> System.out.println(s.start + " " + s.end));
			
		}
	
}
