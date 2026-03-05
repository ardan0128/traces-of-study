
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

    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> leafValues1 = new ArrayList<>();
        List<Integer> leafValues2 = new ArrayList<>();

        collectLeaf(root1, leafValues1);
        collectLeaf(root2, leafValues2);

        return leafValues1.equals(leafValues2);
    }

    private void collectLeaf(TreeNode root, List<Integer> leafValues) {
        if (root == null) {
            return;
        }

        if (root.left == null && root.right == null) {
            leafValues.add(root.val);
        }

        collectLeaf(root.left, leafValues);
        collectLeaf(root.right, leafValues);
    }
}
