import java.util.Scanner;

public class Juicer {
    /* http://codeforces.com/contest/709/problem/A */

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int totalOranges = in.nextInt();
        int maximumSize = in.nextInt();
        int maximumWastes = in.nextInt();
        in.nextLine();
        int totalWastes = 0, currSize = 0, currWaste = 0;
        for(int i = 0; i< totalOranges; i++){
            int currOrange = in.nextInt();
            if(currOrange > maximumSize)
                // This orange can't fit in the juicer, it's bigger than the allowed!
                continue;
            if(currSize + currOrange <= maximumSize)
                // The juicer has space
                currSize += currOrange;
            if(currOrange + currWaste <= maximumWastes)
                // The wastes have space.
                currWaste += currOrange;
            else{
                // Empty the wastes, add the orange to the juicer.
                currSize = currOrange;
                currWaste = 0;
                totalWastes++;
            }
        }
        System.out.println(totalWastes);
    }
}
