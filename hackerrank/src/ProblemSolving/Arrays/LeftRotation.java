package ProblemSolving.Arrays;


import java.util.Scanner;

public class LeftRotation {
    /**
     * Left Rotation : https://www.hackerrank.com/challenges/array-left-rotation/problem
     * @author : Samuel-Sorial
     */
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String[] nd = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nd[0]);

        int d = Integer.parseInt(nd[1]);

        int[] a = new int[n];

        String[] aItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int aItem = Integer.parseInt(aItems[i]);
            a[i] = aItem;
        }
        int[] b = leftRotate(a,d);
        scanner.close();
    }

    private static int[] leftRotate(int[] a, int d) { //Rotating d to the left
        int[] b = new int[a.length];
        for(int i = 0; i<b.length; i++){
            b[i] = a[(i+d)%a.length];
        }
        return b;
    }
}
