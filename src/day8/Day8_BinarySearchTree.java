package day8;

import java.util.ArrayList;
import java.util.List;



public class Day8_BinarySearchTree {
    List<Integer> list = new ArrayList<Integer>();

    public boolean isValidBST(TreeNode root) {
        inOrder(root);
        return isSortedArray();
    }

    private boolean isSortedArray() {
        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i) >= list.get(i + 1)) {
                return false;
            }
        }

        return true;
    }

    private void inOrder(TreeNode root) {
        if (root == null)
            return;
        inOrder(root.left);
        list.add(root.val);
        inOrder(root.right);
    }
}
