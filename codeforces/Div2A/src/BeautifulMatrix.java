import java.util.Scanner;

public class BeautifulMatrix {
    /* https://codeforces.com/contest/263/problem/A */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int requiredSwaps = 0;
        int row = 0;
        int col = 0;
        for(int i = 0; i< 5; i++) {
            for(int j = 0; j< 5; j++) {
                int curr = in.nextInt();
                if(curr == 1) {
                    row = i;
                    col = j;
                    //break outerLoop; // Optimizing if it's allowed to not continue, but we cant do it at this example.
                }
            }
            in.nextLine();
        }
        requiredSwaps += Math.abs(row - 2);
        requiredSwaps += Math.abs(col -2);
        System.out.println(requiredSwaps);
    }
}
