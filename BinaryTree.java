package com.sample;

public class BinaryTree {


	
	public TreeNode createNewNode(int val) {
		TreeNode node = new TreeNode(val);
		return node;
	}
	
	public TreeNode insert(TreeNode node, int data) {
		if(node == null) {
			return createNewNode(data);
		}
		if(data<node.data) {
			node.left = insert(node.left, data);
		} else {
			node.right = insert(node.right, data);
		}
		return node;
	}
	public void display(TreeNode root) {
		if(root != null) {
			System.out.print(root.data+" ");
			display(root.left);
			display(root.right);
		}
	}
	public static void main(String args[]) {
		TreeNode root = null;
		BinaryTree bt = new BinaryTree();
		root = bt.insert(root, 7);
		root = bt.insert(root, 3);
		root = bt.insert(root, 9);
		//root.left = new TreeNode(3);
		//root.right = new TreeNode(9);
		bt.display(root);
		MirrorBinaryTree mbTree = new MirrorBinaryTree();
		root = mbTree.mirrorBinaryTree(root);
		bt.display(root);
	}

}
