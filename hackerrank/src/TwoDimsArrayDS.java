import org.junit.Test;

import java.util.Arrays;

public class TwoDimsArrayDS {
    /**
     * My solution to 2DArray-DS problem : hhttps://www.hackerrank.com/challenges/2d-array/problem?h_r=next-challenge&h_v=zen
     * The solution is the required method only.
     * @author : Samuel-Sorial
     */

    public static int hourglassSum(int[][] arr){
        int[] sums = new int[16]; /* New array for the sums */
        int hourglassNumber = 0; /* The index of the current sum */
        for(int i = 0; i<arr.length; i++) { /* Loop at each row */
            for(int j= 0; j<arr[i].length; j++){ /* Loop at each column */
                if (j >= 1 && j <= arr.length - 2 && i <= arr.length - 3) { /* If a hourgalss occurs at this cell */
                    sums[hourglassNumber] = findHourGlassAndSum(i,j,arr); /* Sum the hourglass and add it to the array */
                    hourglassNumber++;
                }
            }
        }
        int biggest = Arrays.stream(sums).max().getAsInt(); /* Find the biggest integer in the array */
        return biggest;
    }

    /**
     * sum the hourglass around this index
     * @param i
     * @param j
     * @param arr
     * @return
     */
     static int findHourGlassAndSum(int i, int j, int[][] arr) {
        int sum = 0;
        sum += arr[i][j] + arr[i][j+1] + arr[i][j-1] + arr[i+1][j] + arr[i+2][j] + arr[i+2][j+1] + arr[i+2][j-1];
        return sum;
    }

    @Test
    public  void test(){
        int[][] test = new int[6][6];
        int current = 0;
        for(int i = 0; i<test.length; i++) {
            for (int j = 0; j < test[i].length; j++){
                test[i][j] = current;
                current++;
            }
        }
        int max = hourglassSum(test);
    }
}
