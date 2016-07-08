package leetcode;

public class RotateArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
   public void rotate(int[] nums, int k) {
	       int n = nums.length;
	       k = k % n;
	       if(k == 0 || n == 1)
	        return;
	           
	           reversal(nums, 0, n - k - 1);
	           reversal(nums, n -k, n - 1);
	           reversal(nums, 0, n - 1);
	  
	   
        
    }
   public  void reversal(int[] nums, int i, int j){
	   int t = 0;
	   while(i < j  && i >= 0){
	     t = nums[i];
	    nums[i] = nums[j];
	    nums[j] = t;
	    i++;
	    j--;
	   }
}

}
