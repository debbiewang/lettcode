package leetcode;

import java.util.Arrays;
import java.util.Stack;

public class LargestRectangleinHistogram {

	public static void main(String[] args) {
		int[] heights = {2,1,2};
		int res = largestRectangleArea(heights);
		System.out.println(res);

	}
    public static int largestRectangleArea(int[] heights) {
    	int area = 0;
    	Stack staHeight = new Stack();
    	Stack staIndex = new Stack();
    	int height = 0;
    	int index = 0;
    	if(heights.length == 0)
    		return 0;
    	for(int i = 0 ; i < heights.length;i++){
    		if(staHeight.isEmpty() || heights[i] > (int)staHeight.peek()){
    			staHeight.push(heights[i]);
    			staIndex.push(i);
    		}else if(heights[i] < (int)staHeight.peek()){
    			while(!staHeight.isEmpty() && heights[i] <= (int)staHeight.peek()){
    				 height = (int)staHeight.peek();
        			 index = (int)staIndex.peek();
        			staHeight.pop();
        			staIndex.pop();
        			area = Math.max(area, height*(i - index));
    			} //end of while
    		    staHeight.push(heights[i]);
    		    staIndex.push(index);
    			
    		}
    	}
    	
    	while(!staHeight.isEmpty()){
    		 height = (int)staHeight.peek();
			 index = (int)staIndex.peek();
			staHeight.pop();
			staIndex.pop();
			area = Math.max(area, height*(heights.length- index));
    	}
    	return area;
    	
        
    }

}
