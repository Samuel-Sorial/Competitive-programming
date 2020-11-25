import java.util.Arrays;
import java.util.Scanner;

public class GravityFlip {
    /* https://codeforces.com/contest/405/problem/A */
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int totalCols = in.nextInt();
        int[] colsDetails = new int[totalCols];
        for(int i = 0; i< totalCols; i++) {
            colsDetails[i] = in.nextInt();
        }
        //flipGravity(colsDetails); // Potential solution
        // Easier solution is to sort it!
        Arrays.sort(colsDetails);
        for(int i : colsDetails) {
            System.out.print(i + " ");
        }
    }

    /*
    private static void flipGravity(int[] colsDetails) {
        for(int i = colsDetails.length-1; i >= 0; i--) {
            for(int j = i - 1; j >= 0; j--) {
                int diff = colsDetails[j] - colsDetails[i];
                if(diff > 0) {
                    colsDetails[i] += diff;
                    colsDetails[j] -= diff;
                }
            }
        }
        for(int i : colsDetails) {
            System.out.print(i + " ");
        }
    }*/
}
