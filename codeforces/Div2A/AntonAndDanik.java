import java.util.Scanner;

public class AntonAndDanik {
    /* https://codeforces.com/contest/734/problem/A */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int totalGames = in.nextInt();
        String allGames = in.next();
        int Anton = 0;
        int Danik = 0;
        for(int i = 0; i< totalGames; i++) {
            if(allGames.charAt(i) == 'A') {
                Anton++;
            } else {
                Danik++;
            }
        }
        if(Anton > Danik) {
            System.out.println("Anton");
        } else if( Danik > Anton) {
            System.out.println("Danik");
        } else {
            System.out.println("Friendship");
        }
    }
}
