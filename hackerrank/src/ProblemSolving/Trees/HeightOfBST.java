package ProblemSolving.Trees;

public class HeightOfBST {
    /**
     * @author : Samuel-Sorial
     * https://www.hackerrank.com/challenges/tree-height-of-a-binary-tree/problem
     */

    public int height(Node root){
        if(root == null)
            return -1;  // To get rid of the root element count on our height.
        int leftSum = 1 + height(root.left);
        int rightSum = 1 +height(root.right);
        if(leftSum>rightSum)
            return leftSum-1;
        else
            return rightSum-1;
    }

}
