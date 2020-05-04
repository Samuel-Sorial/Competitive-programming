import java.util.Scanner;

public class PoliceRecruits {

    /* https://codeforces.com/contest/427/problem/A */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int totalEvents = in.nextInt();
        in.nextLine();
        int currRecruits = 0;
        int untreatedEvents = 0;
        while(totalEvents > 0){
            int currEvent = in.nextInt();
            if(currEvent > 0)
                currRecruits += currEvent;
            else {
                if(currRecruits == 0)
                    untreatedEvents++;
                else
                    currRecruits--;
            }
            totalEvents--;
        }
        System.out.println(untreatedEvents);
    }
}
