package leetcode;

public class Leetcode236 {
	
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
	    TreeNode(int x) { val = x; }
	}
	
	public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        dfs(root, p, q);
        return ans;
    }
    
    private TreeNode ans;
    
    public boolean dfs(TreeNode curr, TreeNode p, TreeNode q){
        if(curr == null)
            return false;
        int left = dfs(curr.left, p, q) ? 1 : 0;
        int right = dfs(curr.right, p, q) ? 1 : 0;
        int mid = (curr == p || curr == q) ? 1 : 0;
        if(mid + left + right >= 2)
            this.ans = curr;
        return (mid + left + right) > 0;
    }
}
