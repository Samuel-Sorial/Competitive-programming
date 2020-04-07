package ProblemSolving.Trees;

public class PostOrderTraversal {
    /**
     * @author: Samuel-Sorial
     * https://www.hackerrank.com/challenges/tree-postorder-traversal/problem
     */

    public void postOrder(Node root) {
        if (root == null)
            return;
        else {
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.data +" ");
        }
    }
}
