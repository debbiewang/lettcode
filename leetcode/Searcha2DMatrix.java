package leetcode;

public class Searcha2DMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int[][] matrix = {{1,2,3,4},
        		             {5,6,7,8}};
         int high = matrix.length -1;
         int target= 6;
        boolean flag =  searchMatrix(matrix,target);
         System.out.println(flag);
         
        
	}
    public static boolean searchMatrix(int[][] matrix, int target) {
    	  int rowLen = matrix.length;
          int columnLen = matrix[0].length;
          int row = rowLen - 1, column = 0;
          while (row >= 0 && column < columnLen) {
              if (matrix[row][column] == target) {
                  return true;
              }
              if (matrix[row][column] > target) {
                  if (column != 0) {
                      return false;
                  }
                  row--;
              } else {
                  column++;
              }

          }
          return false;
        
    }

}
