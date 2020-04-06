package ProblemSolving;

public class TreePostorderTraversal {
    /**
     * @author: Samuel-Sorial
     * https://www.hackerrank.com/challenges/tree-postorder-traversal/problem
     */
    class Node{
        int data;
        TreePreorderTraversal.Node left;
        TreePreorderTraversal.Node right;
    }
    public void postOrder(TreePreorderTraversal.Node root) {
        if (root == null)
            return;
        else {
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.data +" ");
        }
    }
}
