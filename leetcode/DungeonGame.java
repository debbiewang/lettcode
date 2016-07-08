package leetcode;

import javax.sql.rowset.CachedRowSet;

public class DungeonGame {

	public static void main(String[] args) {
		int[][] matrix = {
				 {-200}
				
				 
		 };
		int res = calculateMinimumHP(matrix);
		System.out.println(res);

	}
	
   public static int calculateMinimumHP(int[][] dungeon) {
        int m = dungeon.length;
        int n = dungeon[0].length;
        int[][] res = new int[m][n];
        for(int i = m-1; i >= 0; i --)
        {
            for(int j = n-1; j >= 0; j --)
            {
                if(i == m-1 && j == n-1)
                	res[i][j] = Math.max(1, 1-dungeon[i][j]);
                else if(i == m-1)
                	res[i][j] = Math.max(1, res[i][j+1]-dungeon[i][j]);
                else if(j == n-1)
                	res[i][j] = Math.max(1, res[i+1][j]-dungeon[i][j]);
                else 
                	res[i][j] = Math.max(1, Math.min(res[i+1][j]-dungeon[i][j], res[i][j+1]-dungeon[i][j]));
            }
        }
        return res[0][0];
       
    }

}
