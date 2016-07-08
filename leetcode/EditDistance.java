package leetcode;

public class EditDistance {
  public static void main(String[] args) {
	  String word1 = "a";
	  String word2 = "a";
	  int res =  minDistance(word1, word2);
	  System.out.println(res);
}
	public static int minDistance(String word1, String word2) {
		 if (word1.length() == 0) {
	            return word2.length();
	        }
	        if (word2.length() == 0) {
	            return word1.length();
	        }
	        int l1 = word1.length();
	        int l2 = word2.length();
	        int[][] minDist = new int[l1 + 1][l2 + 1];
	        for (int i = 0; i <= l1; i++) {
	            minDist[i][0] = i;
	        }
	        for (int j = 0; j <= l2; j++) {
	            minDist[0][j] = j;
	        }

	        char[] chs1 = word1.toCharArray();
	        char[] chs2 = word2.toCharArray();
	        for (int i = 1; i <= l1; i++) {
	            for (int j = 1; j <= l2; j++) {
	                if (chs1[i - 1] == chs2[j - 1]) {
	                    minDist[i][j] = minDist[i - 1][j - 1];
	                } else {
	                    minDist[i][j] =  Math.min(minDist[i - 1][j - 1], Math.min(minDist[i - 1][j], minDist[i][j - 1])) + 1;
	                }
	            }
	        }
	        return minDist[l1][l2];
    }
}
