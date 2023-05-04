package day6;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Day6_binaryTreeTraversal {
    static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(){};
        TreeNode(int val){this.val = val;}
        TreeNode(int val, TreeNode left, TreeNode right){
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public List<List<Integer>> levelOrder(TreeNode root){
        Queue<TreeNode> q = new LinkedList<>();
        List<List<Integer>> output = new ArrayList<List<Integer>>();
        if(root==null){
            return output;
        }

        q.add(root);
        while(!q.isEmpty()){
            int firstLevelLen = q.size();
            List<Integer> subLevels = new ArrayList<>();
            for(int i =0; i<firstLevelLen; i++){
                if(q.peek().left != null){
                    q.add(q.peek().left);
                }
                if(q.peek().right != null){
                    q.add(q.peek().right);
                }
                subLevels.add(q.remove().val);

            }
            output.add(subLevels);
        }
        return output;
    }
}
