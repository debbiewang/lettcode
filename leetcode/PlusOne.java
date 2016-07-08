package leetcode;

import java.util.Arrays;

public class PlusOne {

	public static void main(String[] args) {
		int[] nums = {9,0,0};
		int[] res = plusOne2(nums);
		for(int i = 0;i < res.length;i++)
			System.out.println(res[i]);

	}
    
    
    public static int[] plusOne2(int[] digits) {
        for (int i = digits.length-1; i >= 0; i--) {
        if (0 == i && digits[i] == 9) {
            int[] digits2 = new int[digits.length + 1];
            digits2[0] = 1;
            return digits2;
        }
        if (digits[i] == 9) {
            digits[i] = 0;
            continue;
        }
        digits[i] ++;
        break;
    }
     return digits;
    }

}
