package ProblemSolving;

public class TreePreorderTraversal {
    /**
     * @author: Samuel-Sorial
     * https://www.hackerrank.com/challenges/tree-preorder-traversal/problem
     */
    class Node{
        int data;
        Node left;
        Node right;
    }
    public void preOrder(Node root) {
        if (root == null)
            return;
        else {
            System.out.print(root.data +" ");
            preOrder(root.left);
            preOrder(root.right);
        }
    }


}
