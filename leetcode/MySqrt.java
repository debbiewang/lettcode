package leetcode;

public class MySqrt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 2147395599;
		int res = mySqrt(n);
		System.out.println(res);

	}
     public static int mySqrt(int x) {
    	    int low = 1, high = x;
    	    while(low < high) {
    	        int mid = low + (high - low) / 2 + 1;
    	        if(mid > x / mid) {
    	        	high = mid - 1;
    	        } else {
    	        	low = mid;
    	        }
    	    }
    	    return high;
    }

}
