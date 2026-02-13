
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

    public int findSecondMinimumValue(TreeNode root) {
        if (root.left == null) {
            return -1;
        }

        Queue<TreeNode> queue = new LinkedList<>();

        queue.add(root);

        int result = Integer.MAX_VALUE;
        int min = root.val;
        boolean flag = false;

        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();

            if (node.left != null) {
                queue.add(node.left);
                queue.add(node.right);

                if (node.left.val > min) {
                    result = Math.min(result, node.left.val);
                    flag = true;
                }

                if (node.right.val > min) {
                    result = Math.min(result, node.right.val);
                    flag = true;
                }
            }
        }

        return flag ? result : -1;
    }
}
