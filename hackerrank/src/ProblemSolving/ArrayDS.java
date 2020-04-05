package ProblemSolving;

/**
 * My solution to Array-DS problem : https://www.hackerrank.com/challenges/arrays-ds/problem
 * The solution is the required method only.
 * @author : Samuel-Sorial
 */
public class ArrayDS {
    static int[] reverseArray(int[] a) {
        int[] reversed = new int[a.length];
        for(int i = a.length-1; i>0; i--)
            reversed[a.length-i-1] = a[i];
        return reversed;
    }
}
