package ProblemSolving.Trees;

public class PreOrderTraversal {
    /**
     * @author: Samuel-Sorial
     * https://www.hackerrank.com/challenges/tree-preorder-traversal/problem
     */
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
