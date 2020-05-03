package ProblemSolving.Trees;

public class isBST {
    /* https://www.hackerrank.com/challenges/is-binary-search-tree/problem */

    boolean checkBST(Node root) {
        return checkBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE); // Just a values to start the method.
    }
    private boolean checkBST(Node root, int low, int high) {
        if(root == null)
            return true;
        if(root.data < low || root.data > high )
            return false;
        return checkBST(root.left, low, root.data) && checkBST(root.right , root.data, high); // Set new limits!
    }
}
