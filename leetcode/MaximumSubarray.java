package leetcode;

public class MaximumSubarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
		int result = maxSubArray(nums);
		System.out.print(result);

	}
	
	 public static int maxSubArray(int[] nums) {
		 int sum = nums[0], highest = nums[0];
	        for(int i = 1; i < nums.length; i++){
	            sum = sum < 0 ? nums[i] : sum + nums[i];
	            highest = Math.max(highest, sum);
	        }
	        return highest;
	        
	 }

}
