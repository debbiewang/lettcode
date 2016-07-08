package leetcode;

public class ClimbingStairs {

	public static void main(String[] args) {
		int n = 3;
		int res = climbStairs(n);
		System.out.println(res);

	}
	 public static int climbStairs(int n) {
		 int[] steps = new int[n];
		 if(n <= 2)
			 return n;
		 else{
			 steps[0] = 1;
			 steps[1] = 2;
			 for(int i = 2 ;i < n;i++){
				
				 steps[i] = steps[i-1] + steps[i-2];
			 }
		 }
		 
		 return steps[n-1];
	        
	 }

}
