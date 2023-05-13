package day6;

import java.util.ArrayList;
import java.util.List;

class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
public class Day6_nthChild {
    //Preorder traversal is a type of depth-first search(DFS)
    //Children are processed from left to right.

    //A new default argument for the function to hold our answer array
    //create a list for output
    List<Integer> output = new ArrayList<>();
    public List<Integer> preorder(Node root) {
        // If the given root is null, then the output would be null
        if(root == null) return output;
        output.add(root.val);

        for(Node child: root.children){
            preorder(child);
        }

        return output;

    }
}
