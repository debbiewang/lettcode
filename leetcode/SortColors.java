package leetcode;

public class SortColors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int[] nums = {2,1,0,1,2,0};
       sortColors(nums);
       for(int i = 0 ;i < nums.length;i++)
    	   System.out.println(nums[i]);
       
	}
    public static void sortColors(int[] nums) {
    	 int i = 0;
         int j = 0;
         int k = 0;
         int n = nums.length;
         for(int p = 0; p < n; p ++)
         {
             if(nums[p] == 0)
             {
                 i ++;
             }
             else if(nums[p] == 1)
             {
                 j ++;
             }
             else
                 k ++;
         }

         for(int p = 0; p < n; p ++)
         {
             if(p < i)
            	 nums[p] = 0;
             else if(p >= i && p < i + j)
            	 nums[p] = 1;
             else
            	 nums[p] = 2;
         }
    }

}
