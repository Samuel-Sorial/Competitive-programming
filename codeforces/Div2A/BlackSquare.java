import java.util.Scanner;

public class BlackSquare {
    /* https://codeforces.com/contest/431/problem/A */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] caloriesPerStripe = new int[4];
        int totalCalories = 0;
        for(int i = 0; i < 4; i++) {
            caloriesPerStripe[i] = in.nextInt();
        }
        in.nextLine();
        String totalSquares = in.next();
        for(int i = 0; i < totalSquares.length(); i++) {
            char currStripe = totalSquares.charAt(i);
            switch (currStripe) {
                case '1':
                    totalCalories += caloriesPerStripe[0];
                    break;
                case '2':
                    totalCalories += caloriesPerStripe[1];
                    break;
                case '3':
                    totalCalories += caloriesPerStripe[2];
                    break;
                case '4':
                    totalCalories += caloriesPerStripe[3];
                    break;
            }
        }
        System.out.println(totalCalories);
    }
}
