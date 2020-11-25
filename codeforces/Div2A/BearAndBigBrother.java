import java.util.Scanner;

public class BearAndBigBrother {
    /* https://codeforces.com/contest/791/problem/A */
    private static double customLog(double logNumber) {
        return Math.log(logNumber) / Math.log(2.0/3);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double Limak = in.nextDouble();
        double Bob = in.nextDouble();
        double totalYears = customLog(Limak/Bob) +.001;
        int intTotalYears = (int) totalYears + 1;
        System.out.println(intTotalYears);
    }
}
