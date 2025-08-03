class TreeNode {
    int val;
    TreeNode left, right;

    TreeNode(int val) {
        this.val = val;
    }
}

public class Solution2 {

    static class Count {
        int val = 0;
    }

    public static boolean isUnival(TreeNode node, Count count) {
        if (node == null)
            return true;

        boolean leftUnival = isUnival(node.left, count);
        boolean rightUnival = isUnival(node.right, count);

        if (!leftUnival || !rightUnival)
            return false;

        if (node.left != null && node.left.val != node.val)
            return false;
        if (node.right != null && node.right.val != node.val)
            return false;

        count.val++;
        return true;
    }

    public static int countUnivalSubtrees(TreeNode root) {
        Count count = new Count();
        isUnival(root, count);
        return count.val;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(1);
        root.right = new TreeNode(5);
        root.left.left = new TreeNode(5);
        root.left.right = new TreeNode(5);
        root.right.right = new TreeNode(5);

        System.out.println(countUnivalSubtrees(root));
    }
}
