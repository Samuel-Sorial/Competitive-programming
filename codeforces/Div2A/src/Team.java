import java.util.Scanner;

public class Team {
    /* https://codeforces.com/contest/231/problem/A */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int totalProblems = in.nextInt();
        int canAnswer = 0;
        while(totalProblems > 0) {
            int firstFriend = in.nextInt();
            int secondFriend = in.nextInt();
            int thirdFriend = in.nextInt();
            if(firstFriend + secondFriend + thirdFriend >= 2) {
                canAnswer++;
            }
            in.nextLine();
            totalProblems--;
        }
        System.out.println(canAnswer);
    }
}
