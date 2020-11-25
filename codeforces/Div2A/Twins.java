import java.util.Arrays;
import java.util.Scanner;

public class Twins {


    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        int totalCoins = in.nextInt();
        int[] coins = new int[totalCoins];
        int sumOfAll = 0;
        for(int i = 0; i < totalCoins; i++){
            coins[i] = in.nextInt();
            sumOfAll += coins[i];
        }
        Arrays.sort(coins);
        int rightSum = 0;
        for(int i = totalCoins-1; i >=0; i--){
            rightSum += coins[i];
            if(rightSum > sumOfAll / 2){
                System.out.println(totalCoins - i);
                break;
            }
        }
    }
}
