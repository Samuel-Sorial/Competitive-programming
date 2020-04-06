package ProblemSolving;

public class TreeInorderTraversal {
    /**
     * @author: Samuel-Sorial
     * https://www.hackerrank.com/challenges/tree-inorder-traversal/problem
     */
    class Node{
        int data;
        Node left;
        Node right;
    }
    public void inOrder(Node root){
        if(root == null)
            return;
        else{
            inOrder(root.left);
            System.out.print(root.data + " ");
            inOrder(root.right);
        }
    }
}
