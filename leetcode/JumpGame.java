package leetcode;

public class JumpGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] matrix = {2,0,0};
		boolean flag = canJump(matrix);
		System.out.println(flag);

	}
   public static boolean canJump(int[] nums) {
	   boolean flag = false;
	   int n = nums.length;
	   if(n ==0 ||n==1) return true;
	 
	   int max = nums[0];
	   for(int i = 1; i < n; i++){
		   if(max ==  0)
			   return false;
		   max--;
		   if(max < nums[i])
			   max = nums[i];
		   if(max + i >= n-1)
			   return true;
		  
		   
	   }
         return flag;
        
    }

}
