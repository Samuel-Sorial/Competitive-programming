import java.util.Scanner;

public class DieRoll {
    /* http://codeforces.com/contest/9/problem/A */
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        int Yakko = in.nextInt();
        int Wakko = in.nextInt();
        int chances = 1;
        if( Wakko > Yakko )
            chances += 6 - Wakko;
        else
            chances += 6 - Yakko;
        String print = "";
        switch (chances){
            case 1:
                print = "1/6";
                break;
            case 2:
                print = "1/3";
                break;
            case 3:
                print = "1/2";
                break;
            case 4:
                print = "2/3";
                break;
            case 5:
                print = "5/6";
                break;
            case 6:
                print = "1/1";
        }
        System.out.println(print);
    }
}
