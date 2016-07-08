package leetcode;

import java.util.Arrays;

public class MissingNumber {

	public static void main(String[] args) {
		int[] nums = {1,0};
		int res = missingNumber(nums);
		System.out.println(res);
		
	}
    public static int missingNumber(int[] nums) {
        Arrays.sort(nums);
        for(int i = 0 ; i < nums.length;i++){
        	if(nums[i] != i)
        		return i;
        	else 
        		continue;
        }
        
        return nums[nums.length - 1] + 1;
    }

}
