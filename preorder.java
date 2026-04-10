import java.util.*;

class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        preorder(root, res);
        return res;
    }

    public void preorder(TreeNode root, List<Integer> res) {
        if (root == null) return;

        res.add(root.val);        // Root
        preorder(root.left, res); // Left
        preorder(root.right, res);// Right
    }
}
