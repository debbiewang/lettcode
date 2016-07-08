package leetcode;

public class UniquePaths {

	public static void main(String[] args) {
		int m = 3;
		int n = 3;
		int res = uniquePaths(m, n);
		//System.out.println(res);

	}
	
	 public static int uniquePaths(int m, int n) {
		 int number = 0;
		 int[][] matrix = new int[m][n];
		 for(int i = 0;i<m;i++)
			 for(int j = 0 ;j<n;j++){
				 if(i == 0 || j==0)
					 matrix[i][j] =1;
				 else
					 matrix[i][j] = matrix[i-1][j]+matrix[i][j-1];
					 
			 }
		 
		 for(int i = 0 ; i < m ; i++){
			 for(int j =0; j < n ; j++){
				 System.out.print(matrix[i][j]);
			 }
				
		         System.out.println();
		 }
			
		 
		 return matrix[m-1][n-1];
	        
	    }

}
