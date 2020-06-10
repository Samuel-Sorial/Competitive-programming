import java.util.Scanner;

public class LinelandMail {
    /* http://codeforces.com/contest/567/problem/A */

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int totalCities = in.nextInt();
        int[] citiesCoordinates = new int[totalCities];
        for(int i = 0; i < totalCities; i++){
            citiesCoordinates[i] = in.nextInt();
        }
        for(int i = 0; i < totalCities; i++){
            findMinAndMax(i, citiesCoordinates);
        }
    }

    private static void findMinAndMax(int i, int[] citiesCoordinates) {
        int min = 0;
        int max = 0;
        if(i == 0){
            min = citiesCoordinates[1] - citiesCoordinates[0];
            max = citiesCoordinates[citiesCoordinates.length -1] - citiesCoordinates[0];
        }
        else if ( i == citiesCoordinates.length -1) {
            min = citiesCoordinates[i] - citiesCoordinates[i-1];
            max = citiesCoordinates[i] - citiesCoordinates[0];
        }
        else{
            min = Math.min(citiesCoordinates[i + 1] - citiesCoordinates[i], citiesCoordinates[i] - citiesCoordinates[i - 1]);
            max = Math.max(citiesCoordinates[citiesCoordinates.length-1] - citiesCoordinates[i], citiesCoordinates[i] - citiesCoordinates[0]);
        }
        System.out.println(min + " " + max);
    }
}
