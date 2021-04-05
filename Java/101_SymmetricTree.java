/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {	//	0 ms	36.4 MB
	public boolean isSymmetric(TreeNode root) {
		return check(root.left,root.right);
	}

	public boolean check(TreeNode p,TreeNode q){
		if(p == null && q == null) return true;
		if(p == null || q == null) return false;
		return ((p.val == q.val)&&(check(p.left,q.right))&&(check(p.right,q.left)));
	}
}