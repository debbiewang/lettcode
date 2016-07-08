package leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MergeIntervals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Interval a = new Interval(1,4);
		Interval b = new Interval(2,3);
		List<Interval> intervals = new ArrayList<Interval>();
		intervals.add(a);
		intervals.add(b);
		List<Interval> resList = merge(intervals);
		for(Interval item :resList)
			System.out.println(item);
		
		
	}
    public static List<Interval> merge(List<Interval> intervals) {
    	List<Interval> resList = new ArrayList<Interval>();
    	if(intervals.size() <= 1)
    		return intervals;
    	//step1 :排序
    	Collections.sort(intervals, new Comparator<Interval>() {

			@Override
			public int compare(Interval a, Interval b) {
				return Integer.compare(a.start, b.start);
			}
    		
		});;
		resList.add(intervals.get(0));
		//step2:比较合并
		for(int i = 1 ; i < intervals.size();i++){
			Interval first = resList.get(resList.size()-1);
			Interval second = intervals.get(i);
			//case 1:[1,3][2,4] -> [1,4]
			//case 2:[1,4][2,3]
			//case 3 ：[1,2][3,4]
			if(first.end >= second.start && first.end <= second.end){
				resList.remove(resList.size()-1);
				resList.add(new Interval(first.start,second.end));
				
			}else if(first.end <second.start){
				resList.add(second);
			}
		}
		
    	return resList;
        
    }

}
 class Interval {
	      int start;
	      int end;
	      Interval() { start = 0; end = 0; }
	      Interval(int s, int e) { start = s; end = e; }
		@Override
		public String toString() {
			return "Interval [start=" + start + ", end=" + end + "]";
		}
	      
	     }