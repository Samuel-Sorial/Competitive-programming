import java.util.Scanner;

public class BuyShovel {

    /* https://codeforces.com/contest/732/problem/A */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int pricePerShovel = in.nextInt();
        int rBurles = in.nextInt();
        int n = 1;
        while (true) {
            int totalPrice = pricePerShovel * n;
            if(totalPrice % 10 == 0 || (totalPrice - rBurles ) % 10 == 0) {
                break;
            }
            else
                n++;
        }
        System.out.println(n);
    }
}
