import java.util.Scanner;

public class GamesNumber {
    /* https://codeforces.com/contest/268/problem/A */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int totalTests = in.nextInt();
        Team[] teams = new Team[totalTests];
        for(int i = 0; i < totalTests; i++){
            int home = in.nextInt();
            int away = in.nextInt();
            teams[i] = new Team(home,away);
            in.nextLine();
        }
        int totalMatches = 0;
        for(int i = 0; i < totalTests; i++){
            for(int j = 0; j < totalTests; j++) {
                if(j == i)
                    continue;
                if(teams[i].home == teams[j].away)
                    totalMatches++;
            }
        }
        System.out.println(totalMatches);
    }

    private static class Team{
        int home;
        int away;
        public Team(int x, int y) {
            home =x;
            away = y;
        }
    }
}
