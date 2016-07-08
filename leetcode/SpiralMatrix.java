package leetcode;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {

	public static void main(String[] args) {
		 int[][] matrix = {
				 {1,2,3},
				 {4,5,6},
				 {7,8,9}
		 };
		
		 
		 List<Integer> resList = spiralOrder(matrix);
		 for (Integer i : resList) {
			System.out.println(i);
		}
			 
	}
	 public static List<Integer> spiralOrder(int[][] matrix) {
		 List<Integer> res = new ArrayList<Integer>();
	        if (matrix == null || matrix.length == 0){
	            return res;
	        }
	        int mEnd = matrix.length; //ÐÐ  i
	        int nEnd = matrix[0].length;//ÁÐ j
	        int i = 0;
	        int j = 0;
	        int mStart = 0;
	        int nStart = 0;
	       while(mStart < mEnd && nStart < nEnd){
	    	   while(j<nEnd){
	    		   res.add(matrix[i][j++]);
	    	   }
	    	    
	    	   i++;
		       j--;
		       mStart++;
		       
		       while(i<mEnd){
		    	   res.add(matrix[i++][j]);
		       }
		       i--;
		       j--;
		       nEnd--;
		       if(mStart < mEnd && nStart < nEnd){
		    	   while(j>= nStart){
		    		   res.add(matrix[i][j--]);
		    	   }
		    	   j++;
		    	   i--;
		    	   mEnd--;
		    	   while(i>=mStart){
		    		   res.add(matrix[i--][j]);
		    	   }
		    	   nStart++;
		    	   i++;
		    	   j++;
		       }
	       }
	        return res;
	    }

}
