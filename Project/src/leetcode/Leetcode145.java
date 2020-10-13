package leetcode;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class Leetcode145 {
	
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
	
	public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> l = new LinkedList<>();
        Stack<TreeNode> stack = new Stack<>();
        if(root == null)
            return l;
        TreeNode curr = root;
        while(curr != null || !stack.isEmpty()){
            if(curr != null){
                l.add(curr.val);
                stack.push(curr);
                curr = curr.right;
            } else{
                curr = stack.pop();
                curr = curr.left;
            }
        }
        Collections.reverse(l);
        
        return l;
    }
	
	public List<Integer> postorderTraversal2(TreeNode root) {
        List<Integer> l = new LinkedList<>();
        postorder(root, l);
        return l;
    }
    
    public void postorder(TreeNode root, List<Integer> l){
        if(root == null)
            return;
        TreeNode p = root;
        postorder(p.left, l);
        postorder(p.right, l);
        l.add(p.val);
    }
}
