import java.util.*;

class Solution {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> res = new ArrayList<>();
        if (root == null) return res;
        
        helper(root, "", res);
        return res;
    }

    public void helper(TreeNode root, String path, List<String> res) {
        if (root == null) return;

        if (root.left == null && root.right == null) {
            res.add(path + root.val);
            return;
        }
        helper(root.left, path + root.val + "->", res);
        helper(root.right, path + root.val + "->", res);
    }
}
