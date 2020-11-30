package leetcode;

public class Leetcode98 {
	 public class TreeNode {
	      int val;
	      TreeNode left;
	      TreeNode right;
	      TreeNode() {}
	      TreeNode(int val) { this.val = val; }
	      TreeNode(int val, TreeNode left, TreeNode right) {
	          this.val = val;
	          this.left = left;
	          this.right = right;
	      }
	 }
	 
	public boolean isValidBST(TreeNode root) {
        return helper(root, null, null);
    }
    
    public boolean helper(TreeNode node, Integer lower, Integer upper){
        if(node == null)
            return true;
        int curr = node.val;
        if(lower != null && curr <= lower)
            return false;
        if(upper != null && curr >= upper)
            return false;
        if(!helper(node.right, curr, upper))
            return false;
        if(!helper(node.left, lower, curr))
            return false;
        return true;
    }
}
