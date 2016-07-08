package leetcode;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrixII {

	public static void main(String[] args) {
		int[][] matrix  = generateMatrix(3);
		for(int i = 0 ; i < 3; i++){
			for(int j = 0; j < 3;j++)
				System.out.println(matrix[i][j]);
		}
	}
	 public static int[][] generateMatrix(int n) {
		int[][] matrix = new int[n][n];
		int number = 1;
	    int mEnd = n; //ÐÐ  i
	    int nEnd = n;//ÁÐ j
	    int i = 0;
	    int j = 0;
	    int mStart = 0;
	    int nStart = 0;
	    while(mStart < mEnd && nStart < nEnd){
	    	   while(j<nEnd){
	    		   matrix[i][j++] = number;
	    		   number++;
	    	   }
	    	    
	    	   i++;
		       j--;
		       mStart++;
		       
		       while(i<mEnd){
		    	  matrix[i++][j] = number;
		    	  number++;
		       }
		       i--;
		       j--;
		       nEnd--;
		       if(mStart < mEnd && nStart < nEnd){
		    	   while(j>= nStart){
		    		   matrix[i][j--] = number;
		    		   number++;
		    	   }
		    	   j++;
		    	   i--;
		    	   mEnd--;
		    	   while(i>=mStart){
		    		   matrix[i--][j] = number;
		    		   number++;
		    	   }
		    	   nStart++;
		    	   i++;
		    	   j++;
		       }
	       }
	    
		return matrix;
	    }

}
