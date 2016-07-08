package leetcode;

public class UniquePathsII {

	public static void main(String[] args) {
		
		int[][] matrix = new int[3][3];
		matrix[0] = new int[]{0,0,0};
		matrix[1] = new int[]{0,1,0};
		matrix[2] = new int[]{0,0,0};
		int res = uniquePathsWithObstacles(matrix);
		System.out.println(res);

	}
	//遇到障碍的时候为0；
	//case1 ：如果第一个就是障碍的话则根被不能完成
	//case 2:如果遇到整行或者 z
	 public static int uniquePathsWithObstacles(int[][] obstacleGrid) {
		 int m = obstacleGrid.length;
		 int n = obstacleGrid[0].length;
		 if(obstacleGrid[0][0] == 1)
			 return 0;
		 
		 int[][] dp = new int[m][n];
		    dp[0][0]=1;
		    for(int i=1;i<m;i++){
		        if(obstacleGrid[i][0]!=1) dp[i][0]=dp[i-1][0];
		    }
		    for(int j=1;j<n;j++){
		        if(obstacleGrid[0][j]!=1) dp[0][j]=dp[0][j-1];
		    }
		    for(int i=1;i<m;i++){
		        for(int j=1;j<n;j++){
		            if(obstacleGrid[i][j]!=1) dp[i][j]=dp[i-1][j]+dp[i][j-1];
		        }
		    }
		    return dp[m-1][n-1];
	        
	    }

}
