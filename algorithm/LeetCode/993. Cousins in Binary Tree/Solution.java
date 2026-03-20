
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

    public boolean isCousins(TreeNode root, int x, int y) {
        TreeNode xNode = findNode(root, x);
        TreeNode yNode = findNode(root, y);

        return (findLevel(root, xNode, 0) == findLevel(root, yNode, 0))
                && !isSibling(root, xNode, yNode);
    }

    private TreeNode findNode(TreeNode node, int val) {
        if (node == null) {
            return null;
        }

        if (node.val == val) {
            return node;
        }

        TreeNode n = findNode(node.left, val);

        if (n != null) {
            return n;
        }

        return findNode(node.right, val);
    }

    private int findLevel(TreeNode root, TreeNode node, int level) {
        if (root == null) {
            return 0;
        }

        if (root == node) {
            return level;
        }

        int l = findLevel(root.left, node, level + 1);

        if (l != 0) {
            return l;
        }

        return findLevel(root.right, node, level + 1);
    }

    private boolean isSibling(TreeNode node, TreeNode x, TreeNode y) {
        if (node == null) {
            return false;
        }

        return ((node.left == x && node.right == y)
                || (node.left == y && node.right == x)
                || isSibling(node.left, x, y)
                || isSibling(node.right, x, y));
    }
}
