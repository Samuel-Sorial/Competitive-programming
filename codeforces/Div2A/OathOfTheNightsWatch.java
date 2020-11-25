import java.util.Arrays;
import java.util.Scanner;

public class OathOfTheNightsWatch {

    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        int totalStewards = in.nextInt();
        int[] stewards = new int[totalStewards];
        int willFeed = 0;
        for(int i = 0; i < totalStewards; i++){
            stewards[i] = in.nextInt();
        }
        int maxStrength = findMaximuStrength(stewards);
        int minStrength = findMinimumStrength(stewards);
        for(int i = 0; i < totalStewards; i++){
            if(stewards[i] > minStrength && stewards[i] < maxStrength)
                willFeed++;
        }
        System.out.println(willFeed);
    }

    private static int findMinimumStrength(int[] stewards) {
        int min = Integer.MAX_VALUE;
        for(int i : stewards){
            if(i < min)
                min = i;
        }
        return min;
    }

    private static int findMaximuStrength(int[] stewards) {
        int max = 0;
        for(int i : stewards){
            if(i > max)
                max = i;
        }
        return max;
    }

}
