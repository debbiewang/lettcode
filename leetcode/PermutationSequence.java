package leetcode;

import java.util.ArrayList;

public class PermutationSequence {

	public static void main(String[] args) {
		int n = 4;
		int k = 4;
		String res = getPermutation(n, k);
		System.out.println(res);
 
	}
	 public static String getPermutation(int n, int k) {
		    StringBuilder res = new StringBuilder();
	        ArrayList<Integer> nums = new ArrayList<Integer>();
	        int remain = n;
	        int[] fac = new int[n];
	        //for循环的目的是求各个数字的阶乘
	        for (int i = 0; i < n; i++) {
	            if (i == 0) {
	                fac[i] = 1;
	            } else {
	                fac[i] = fac[i - 1] * (i + 1);
	            }
	            nums.add(i + 1);
	        }
	        k--;
	        while (k > 0) {
	            int index = k / fac[remain - 2];
	            res.append(nums.get(index));
	            nums.remove(index);
	            k = k % fac[remain - 2];
	            remain--;
	        }

	        for (int i = 0; i < nums.size(); i ++) {
	            res.append(nums.get(i));
	        }
	        return res.toString();
	   }

}
