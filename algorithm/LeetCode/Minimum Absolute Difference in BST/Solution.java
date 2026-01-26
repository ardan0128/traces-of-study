
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
class Solution {

    TreeNode pre = null;
    int ans = Integer.MAX_VALUE;

    private void inorder(TreeNode root) {
        if (root == null) {
            return;
        }

        inorder(root.left);

        if (pre != null) {
            ans = Math.min(ans, root.val - pre.val);
        }

        pre = root;
        inorder(root.right);

        return;
    }

    public int getMinimumDifference(TreeNode root) {
        inorder(root);

        return ans;
    }
}
