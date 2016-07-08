package leetcode;

public class BalancedBinaryTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
    public boolean isBalanced(TreeNode root) {
    	if(root == null)
    		return true;
    	else   
        	return Math.abs(depth(root.left) - depth(root.right)) <= 1 && isBalanced(root.left) && isBalanced(root.right);
    	
    	
    }
    public int depth(TreeNode root){
    	
    	if(root == null)
    		return 0;
    	return Math.max(depth(root.left), depth(root.right)) + 1;
    }

}
