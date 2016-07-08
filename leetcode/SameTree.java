package leetcode;

public class SameTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	 public boolean isSameTree(TreeNode p, TreeNode q) {
		 return p == null && q == null || p != null && q != null && p.val == q.val && isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
	    }

}

  class TreeNode {
	      int val;
	      TreeNode left;
	     TreeNode right;
	      TreeNode(int x) { val = x; }
	 }
