import java.util.*;

class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        post(root, res);
        return res;
    }

    public void post(TreeNode root, List<Integer> res) {
        if (root == null) return;

        post(root.left, res);   // Left
        post(root.right, res);  // Right
        res.add(root.val);      // Root
    }
}
