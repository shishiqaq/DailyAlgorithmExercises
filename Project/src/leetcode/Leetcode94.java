package leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;


public class Leetcode94 {
	
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

	public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode tree = root;
        while(tree != null || ! stack.isEmpty()){
            if(tree != null){
                stack.push(tree);
                tree = tree.left;
            } else{ //tree == null && !stack.isEmpty()
                tree = stack.pop();
                list.add(tree.val);
                tree = tree.right;
            }
            
        }
        return list;
    }
}
