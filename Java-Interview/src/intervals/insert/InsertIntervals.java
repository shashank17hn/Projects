package intervals.insert;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;




/*Given a set of non-overlapping & sorted intervals, insert a new interval into the intervals (merge if necessary).

Example 1:
Given intervals [1,3],[6,9], insert and merge [2,5] in as [1,5],[6,9].

Example 2:
Given [1,2],[3,5],[6,7],[8,10],[12,16], insert and merge [4,9] in as [1,2],[3,10],[12,16].

This is because the new interval [4,9] overlaps with [3,5],[6,7],[8,10].*/

public class InsertIntervals {
	
	static class Interval{
		int start;
		int end;
		
		public Interval(){};
		
		public Interval(int start , int end) {
			this.start = start;
			this.end = end;
		}
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Interval> list2 = new ArrayList<>();
		list2.add(new Interval(1, 3));
		list2.add(new Interval(6, 9));

		Interval newInterval = new Interval(2, 5);
		//mergeIntervalsUsingClass(list2, newInterval);
		mergeIntervalsUsingClassWithoutSorted(list2, newInterval);
	}
	
	
		
	public static void mergeIntervalsUsingClass(List<Interval> list , Interval newInterval) {
			
		list.add(newInterval);
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
		
	
	
	public static void mergeIntervalsUsingClassWithoutSorted(List<Interval> list , Interval newInterval) {
			
		
		//[1,3],[6,9], insert and merge [2,5] in as [1,5],[6,9].
				List<Interval> temp = new ArrayList<>();
				for(int i =0 ; i< list.size() ; i++) {
					Interval arr1  = list.get(i);
			        if(arr1.end < newInterval.start) {
			        	temp.add(arr1);
			        }
			        else if(arr1.start > newInterval.end) {
						temp.add(newInterval);
						newInterval = arr1;
					}else if (arr1.end >= newInterval.start || arr1.start <= newInterval.end) {
						newInterval = new Interval(Math.min(arr1.start, newInterval.start), Math.max(arr1.end, newInterval.end));
					}
				}
				temp.add(newInterval);
				
				System.out.println("interval");
				temp.stream().forEach(s -> System.out.println(s.start + " " + s.end));
				
			}
		

}
