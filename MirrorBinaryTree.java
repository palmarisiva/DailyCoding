package com.sample;

public class MirrorBinaryTree {
	
	public TreeNode mirrorBinaryTree(TreeNode root) {
		if(root!= null ) {
			
			TreeNode tmp = root.left;
			root.left = root.right;
			root.right = tmp;
			
			mirrorBinaryTree(root.left);
			mirrorBinaryTree(root.right);
		}
		return root;
	}

}
