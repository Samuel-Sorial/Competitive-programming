package ProblemSolving.Trees;

public class BSTInsertion {
     /**
     * @author : Samuel-Sorial
     * https://www.hackerrank.com/challenges/binary-search-tree-insertion/problem
     */

     public Node insert(Node root, int data){
         if(root == null) // If at the bottom, create new node and return it
             return new Node(data);
         else if(data > root.data)
             root.right =  insert(root.right,data); // If biggest, continue and append it at the right
         else
             root.left =  insert(root.left,data); // If less, continue and append it to left
         return root;
     }
}
