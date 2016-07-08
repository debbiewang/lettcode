package leetcode;

public class MaximalSquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		char[][] matrix  = {
//				{'1','0','1','0','0'},
//				{'1','0','1','1','1'},
//				{'1','1','1','1','1'},
//				{'1','0','0','1','0'}
//		};
		char[][] matrix = {{'1'}};
		int res = maximalSquare(matrix);
		System.out.println(res);
		

	}
    public static int maximalSquare(char[][] matrix) {
    	
        int n = matrix.length;
        if(n == 0)
        	return 0;
        int m = matrix[0].length;
        if( m == 0)
        	return 0;
        int max = 0;
        int[][] dp = new int[n][m];
        for(int i = 0; i < n;i++)
        	for(int j = 0;j < m;j++){
        		if((i==0 || j==0) &&matrix[i][j] == '1' ){
        			dp[i][j] = 1;
        			max = Math.max(max, dp[i][j]);
        		}
        			
        		else{
        			if(matrix[i][j] == '1'){
        				dp[i][j] = Math.min(dp[i-1][j-1], Math.min(dp[i-1][j], dp[i][j-1]))+1;
        				max = Math.max(max, dp[i][j]);
        			}
        			    
        			else
        				dp[i][j] = 0;
        		}
        			
        			
        	}
        return max*max;
    }

}
