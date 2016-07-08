package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class SingleNumberIII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[] nums = {-1638685546,-2084083624,-307525016,-930251592,-1638685546,1354460680,623522045,-1370026032,-307525016,-2084083624,-930251592,472570145,-1370026032,1063150409,160988123,1122167217,1145305475,472570145,623522045,1122167217,1354460680,1145305475};
	     int[] nums = {0,1};
		int[] res = singleNumberIII(nums);
		for(int i = 0 ;i < res.length;i++)
		   System.out.println(res[i]);
		
	}
	 public static int[] singleNumberIII(int[] nums) {
		 Stack stack = new Stack();
		 int[] res = new int[2];
		 int k = 0;
		 Arrays.sort(nums);
		 for(int i = 0 ; i < nums.length; i++){
			 if(stack.isEmpty())
				 stack.push(nums[i]);
			 else{
				 int top = (int)stack.peek();
				 if(nums[i] != top){
					 res[k] = top;
					 k++;
					 stack.pop();
					 stack.push(nums[i]);
				 }else
					 stack.pop();
				
			 }
		 }
		 if(stack.isEmpty())
			 return res;
		 else{
			 res[k] = (int)stack.peek();
			 return res;
		 }
		 
	        
	 }

}
