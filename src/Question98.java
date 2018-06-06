import share.TreeNode;

public class Question98 {
    public boolean isValidBST(TreeNode root) {
        return isValidBST(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    public boolean isValidBST(TreeNode root, long minVal, long maxVal) {
        if (root == null)
            return true;
        return root.val > minVal && root.val < maxVal && isValidBST(root.left, minVal, root.val) && isValidBST(root.right, root.val, maxVal);
    }
}
