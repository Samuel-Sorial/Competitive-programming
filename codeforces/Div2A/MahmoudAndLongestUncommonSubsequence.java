import java.util.Scanner;

public class MahmoudAndLongestUncommonSubsequence {

    /* https://codeforces.com/contest/766/problem/A */
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String firstString = in.nextLine();
        String secondString = in.nextLine();
        if(firstString.length() == secondString.length()){
            if(firstString.equals(secondString))
                System.out.println(-1);
            else
                System.out.println(firstString.length());
        }else{
            System.out.println(Math.max(firstString.length(), secondString.length()));
        }
    }

}
