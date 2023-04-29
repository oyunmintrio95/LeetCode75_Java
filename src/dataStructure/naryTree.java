package dataStructure;

/* Cases to handle during traversal: Two cases have been taken
care of in this iterative Preorder Traversal Algorithm
1. Pop the top node from the stack
    - Top from the stack and insert it into the visited list of nodes
2. Push all of the child nodes of Top into the stack
    from right to left as the traversal from the stack
    will be carried out in reverse order .As a result,
    correct preorder traversal is achieved
*
* */

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Stack;

public class naryTree {
    //Node Structure of N-ary Tree
    static class Node {
        int key;

        //All children are stored in a list
        ArrayList<Node> child;

        Node(int val)
        {
            key = val;
            child = new ArrayList<>();
        }
    };

    //Utility function to print the
    //preorder of the given N-Ary Tree
    static void preorderTraversal(Node root)
    {
        Stack<Node> stack = new Stack<>();

        //'Preorder' -> contains all the visited nodes
        ArrayList<Integer> Preorder = new ArrayList<>();

        stack.push(root);

        while (!stack.isEmpty()){
            Node temp = stack.peek();
            stack.pop();
            //store the key in preorder vector(vistied list)
            Preorder.add(temp.key);
            //Push all of the child nodes of temp into
            //the stack from right to left.
            for (int i=temp.child.size()-1; i>=0; i--){
                stack.push(temp.child.get(i));
            }
        }

        for(Integer i : Preorder){
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args)
    {
        // input nodes
        /*
                1
              /  |  \
            /   |   \
            2    3    4
          / \      / | \
          /   \    7  8  9
        5     6
        /    / | \
      10   11 12 13
        */

        Node root = new Node(1);
        root.child.add(new Node(2));
        root.child.add(new Node(3));
        root.child.add(new Node(4));

        root.child.get(0).child.add(new Node(5));
        root.child.get(0).child.get(0).child.add(
                new Node(10));
        root.child.get(0).child.add(new Node(6));
        root.child.get(0).child.get(1).child.add(
                new Node(11));
        root.child.get(0).child.get(1).child.add(
                new Node(12));
        root.child.get(0).child.get(1).child.add(
                new Node(13));
        root.child.get(2).child.add(new Node(7));
        root.child.get(2).child.add(new Node(8));
        root.child.get(2).child.add(new Node(9));

        preorderTraversal(root);
    }
}
// This code is contributed by karandeep1234


    // Driver Code
