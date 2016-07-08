package leetcode;

import java.util.ArrayList;
import java.util.List;

public class InsertInterval {

	////[1,2],[3,5],[6,7],[8,10],[12,16], insert [4,9]
	public static void main(String[] args) {
		Interval a = new Interval(1,2);
		Interval b = new Interval(3,5);
		Interval c = new Interval(6,7);
		Interval d = new Interval(8,10);
		Interval e = new Interval(12,16);
		Interval newInterval = new Interval(4,9);
		List<Interval> intervals  = new ArrayList<Interval>();
		intervals.add(a);
		intervals.add(b);
		intervals.add(c);
		intervals.add(d);
		intervals.add(e);
		List<Interval> resList  = insert(intervals, newInterval);
		for (Interval interval : resList) {
			interval.toString();
			
		}

	}
    public static List<Interval> insert(List<Interval> intervals, Interval newInterval) {
    	List<Interval> resList  = new ArrayList<Interval>();
    	//小的进栈
    	int i;
    	for(i=0; i < intervals.size();i++){
    		Interval interval = intervals.get(i);
    		if(interval.start < newInterval.start)
    			resList.add(interval);
    		else{
    			i--;
    			break;
    		}
    			
    			
    	}
    	//大的开始进行比较
    	for(;i<intervals.size();i++){
    		Interval interval = resList.get(i);
			if(interval.end >= newInterval.start){
				resList.remove(resList.size()-1);
			//	i--;
				resList.add(new Interval(interval.start,newInterval.end));
				
			}
			else
			      resList.add(newInterval);	
    	}
    	
    	return resList;
        
    }
}
 