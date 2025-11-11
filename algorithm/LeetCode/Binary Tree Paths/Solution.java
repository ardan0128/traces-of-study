
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

    public List<String> binaryTreePaths(TreeNode root) {
        List<String> list = new ArrayList<>();

        if (root == null) {
            return list;
        }

        binaryTreePaths(root, list, "");

        return list;
    }

    public void binaryTreePaths(TreeNode root, List<String> list, String s) {
        if (root == null) {
            return;
        }

        s += root.val;

        if (root.left == null && root.right == null) {
            list.add(s);

            return;
        }

        binaryTreePaths(root.left, list, s + "->");
        binaryTreePaths(root.right, list, s + "->");
    }
}
