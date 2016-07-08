package leetcode;

import java.util.Arrays;

public class SingleNumberII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,3,1,4,3,1,3};
		int res = singleNumberII(nums);
		System.out.println(res);
	}
	 public static int singleNumberII(int[] nums) {
		    Arrays.sort(nums);
	    	if(nums.length == 1)
	    		return nums[0];
	    	for(int i = 2 ; i< nums.length - 1 ;i= i+3){
	    		
	    		if(nums[i] == nums[i-1] && nums[i] == nums[i-2])
	    			continue;
	    		else
	    			return nums[i-2];
	    	}
	    	  return nums[nums.length - 1];
	    }

}
