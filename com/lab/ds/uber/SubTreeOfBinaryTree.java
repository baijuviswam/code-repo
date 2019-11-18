package com.lab.ds.uber;

class TreeNode {
	int val;
	TreeNode left, right;
	public TreeNode(int x){
		this.val = x;
	}
}

public class SubTreeOfBinaryTree {
	TreeNode root = null;
	public static void main(String[] args) {
		SubTreeOfBinaryTree mainTree = new SubTreeOfBinaryTree();
		mainTree.root = new TreeNode(26);
		mainTree.root.left = new TreeNode(10);
		mainTree.root.right = new TreeNode(3);
		mainTree.root.left.left = new TreeNode(4);
		mainTree.root.left.right = new TreeNode(6);
		mainTree.root.left.left.right = new TreeNode(30);

		SubTreeOfBinaryTree subTree = new SubTreeOfBinaryTree();
		subTree.root = new TreeNode(10);
		subTree.root.left = new TreeNode(4);
		subTree.root.right = new TreeNode(6);
		subTree.root.left.right = new TreeNode(30);
		
		System.out.println("Is SubTree "+new SubTreeOfBinaryTree().isSubTree(mainTree.root, subTree.root));
	}
	public boolean isSubTree(TreeNode T, TreeNode S){
		/* base cases */
		if(S==null){
			return true;
		}
		if(T==null){
			return false;
		}
		/* Check the tree with root as current node */
		if(areIdentical(T,S)){
			return true;
		}
		/* If the tree with root as current node doesn't match then 
           try left and right subtrees one by one */
		return isSubTree(T.left, S) || isSubTree(T.right, S);
	}

	/* A utility function to check whether trees with roots as root1 and 
       root2 are identical or not */

      public boolean areIdentical(TreeNode root1, TreeNode root2){
      	/* base cases */
      	if(root1 == null && root2 == null) return true;

      	if(root1 == null || root2 == null) return false;
      	/* Check if the data of both roots is same and data of left and right 
           subtrees are also same */
        return (root1.val == root2.val && areIdentical(root1.left, root2.left) && areIdentical(root1.right, root2.right));
      }

}