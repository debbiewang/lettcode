package leetcode;

public class MinimumPathSum {

	public static void main(String[] args) {
	

	}
	//f[i][j] = min[f[i-1][j],f[i][j-1]] +a[i][j]  动态规划
    public static int minPathSum(int[][] grid) {
    	int m = grid.length;
    	int n = grid[0].length;
    	int[][] res= new int[m][n];
    	//res[0][0] = grid[0][0];
    	for(int i=0;i<m;i++)
    		for(int j = 0;j<n;j++){
    			 if(i == 0 && j!=0){
    				 res[i][j] =res[i][j-1] + grid[i][j]; 
    			 }
    			 if(i != 0 && j == 0){
    				 res[i][j] = res[i-1][j] + grid[i][j];
     			 }
    			 if(i == 0 && j==0)
    				 res[i][j] = grid[i][j];
    			 if(i != 0 && j!=0)
    				 res[i][j] = Math.min(res[i-1][j], res[i][j-1]) +grid[i][j];
    			 
    			 
    				 
    		}
    	return res[m-1][n-1];
        
    }
    
    

}
