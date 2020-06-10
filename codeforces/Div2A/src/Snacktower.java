import java.util.Scanner;

public class Snacktower {

    /* https://codeforces.com/problemset/problem/767/A */

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int totalSnacks = in.nextInt();
        boolean[] hasSnack = new boolean[totalSnacks + 1];
        int next = totalSnacks;
        for(int i = 0; i < totalSnacks; i++){
            int snackSize = in.nextInt();
            hasSnack[snackSize] = true;
            while (hasSnack[next]){
                System.out.print(next + " ");
                next--;
            }
            System.out.println();
        }

    }
}
