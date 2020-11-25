import java.util.Scanner;

public class CarrotCakes {

    /* http://codeforces.com/contest/799/problem/A */
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int totalCakes = in.nextInt();
        int timePerBake = in.nextInt();
        int oneOvenCapacity = in.nextInt();
        int buildingSecondOven = in.nextInt();
        int requiredBakes = (int) Math.ceil((double) totalCakes / (double) oneOvenCapacity);
        int bakedDuringBuilding = (buildingSecondOven / timePerBake ) * oneOvenCapacity;
        int requiredBakesAfterSecond = requiredBakes - bakedDuringBuilding / oneOvenCapacity;
        if(requiredBakesAfterSecond == 1){
            System.out.println("NO");
            return;
        }
        if( buildingSecondOven + timePerBake * requiredBakesAfterSecond /2 < requiredBakes* timePerBake)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
