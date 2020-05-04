import java.util.Scanner;

public class SerejaDima {
    public static void calculateScores(int totalCards, int[] cards) {
        int n = totalCards - 1;
        int ourZero = 0;
        boolean seraj = true;
        int serajTotal = 0;
        int DimaTotal = 0;
        while (n != ourZero) {
            if(cards[n] >= cards[ourZero]) {
                if(seraj)
                    serajTotal += cards[n];
                else
                    DimaTotal += cards[n];
                n--;
            } else {
                if(seraj)
                    serajTotal += cards[ourZero];
                else
                    DimaTotal += cards[ourZero];
                ourZero++;
            }
            seraj = !seraj;
        }
        if (seraj)
            serajTotal += cards[n];
        else
            DimaTotal += cards[n];
        System.out.println(serajTotal + " " + DimaTotal);

    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int totalCards = in.nextInt();
        int[] cards = new int[totalCards];
        for(int i = 0; i< totalCards; i++) {
            cards[i] = in.nextInt();
        }
        calculateScores(totalCards,cards);
    }
}
