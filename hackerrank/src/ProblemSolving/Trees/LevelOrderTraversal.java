package ProblemSolving.Trees;


import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTraversal {
    /**
     * @author: Samuel-Sorial
     * https://www.hackerrank.com/challenges/tree-level-order-traversal/problem
     */
    public void levelOrder(Node root) {
        Queue<Node> allData = new LinkedList<>();
        allData.add(root);
        while(!allData.isEmpty()){
            Node temp = allData.poll();
            System.out.print(temp.data);
            if(temp.left != null)
                allData.add(temp.left);
            if(temp.right != null)
                allData.add(temp.right);
        }
    }
}
