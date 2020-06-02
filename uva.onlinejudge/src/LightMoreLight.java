
import java.util.Scanner;

public class LightMoreLight {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int currLast = 1;
        while(true){
            currLast = in.nextInt();
            if(currLast == 0)
                break;
            if(lightOn(currLast)){
                System.out.println("yes");
            }else{
                System.out.println("no");
            }
        }
    }

    private static boolean lightOn(int currLast) {
        if(currLast <=1)
            return true;
        for( int i = 2; i< Math.sqrt(currLast) +1; i++){
            if(currLast%i == 0){
                return true;
            }
        }
        return false;
    }
}
