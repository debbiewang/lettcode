package leetcode;

import java.util.Arrays;

public class SingleNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,3,1,-1,3};
		int res = singleNumber(nums);
		System.out.println(res);
		

	}
    public static int singleNumber(int[] nums) {
    	Arrays.sort(nums);
    	if(nums.length == 1)
    		return nums[0];
    	for(int i = 1 ; i< nums.length - 1 ;i= i+2){
    		
    		if(nums[i] == nums[i-1])
    			continue;
    		else
    			return nums[i-1];
    	}
    	  return nums[nums.length - 1];
        
    }

}
