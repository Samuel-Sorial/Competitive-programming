package ProblemSolving.Trees;

import java.util.Scanner;

public class TopView {
    /**
     * @author : Samuel-Sorial
     * https://www.hackerrank.com/challenges/tree-top-view/problem
     */

    public static void topView(Node root){
        if(root == null)
            return;
        else{
            printOnlyLeft(root.left);
            System.out.print(root.data + " ");
            printOnlyRight(root.right);
        }
    }

    private static void printOnlyRight(Node right) {
        if(right == null)
            return;
        else{
            System.out.print(right.data + " ");
            printOnlyRight(right.right);
        }
    }

    private static void printOnlyLeft(Node left) {
        if(left == null)
            return;
        else{
            System.out.print(left.data + " ");
            printOnlyRight(left.left);
        }
    }

    public static Node insert(Node root, int data) {
        if(root == null) {
            return new Node(data);
        } else {
            Node cur;
            if(data <= root.data) {
                cur = insert(root.left, data);
                root.left = cur;
            } else {
                cur = insert(root.right, data);
                root.right = cur;
            }
            return root;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        Node root = null;
        while(t-- > 0) {
            int data = scan.nextInt();
            root = insert(root, data);
        }
        scan.close();
        topView(root);
    }
}
