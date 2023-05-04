package day8;

public class Day8_LCDBST {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        int small = Math.min(p.val, q.val);
        int large = Math.max(p.val, q.val);

        while(root!=null){
            if(root.val > large){
                root = root.left;
            }else if(root.val < small){
                root = root.right;
            }else{
                return root;
            }
        }

        return null;

    }
}
