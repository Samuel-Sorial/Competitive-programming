package ProblemSolving;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class DynamicArray {
    /**
     * Dynamic array problem : https://www.hackerrank.com/challenges/dynamic-array/problem
     * @author : Samuel-Sorial
     */
    public static List<Integer> dynamicArray(int n, List<List<Integer>> queries) {
        List<List<Integer>> sequences = new ArrayList<>(); //Create 2 sequences to store the values
        List<Integer> first = new ArrayList<>();
        List<Integer> second = new ArrayList<>();
        List<Integer> lastAnswers = new ArrayList<>();
        sequences.add(first);
        sequences.add(second);
        int lastAnswer = 0; // Initialize the last answer
        for(int i = 0; i<n; i++){
            List<Integer> operands = queries.get(i); //Get the list of this line
            int typeOfQuery = operands.get(0);
            int x = operands.get(1);
            int y = operands.get(2);
            int currIndexOfSequences = (x^lastAnswer) % n; // Find the index of the sequence
            if(typeOfQuery == 1){
                sequences.get(currIndexOfSequences).add(y); // Execute query 1
            }else{  // Exectue query 2
                int sequence = (x^lastAnswer) %2;
                int element = y % sequences.get(sequence).size();
                lastAnswer =sequences.get(sequence).get(element) ;
                lastAnswers.add(lastAnswer);
                System.out.println(lastAnswer);
            }
        }
        return lastAnswers;
    }

    @Test
    public void  test(){
        List<List<Integer>> test = new ArrayList<>();
        List<Integer> first = new ArrayList<>();
        first.add(1);
        first.add(0);
        first.add(5);
        test.add(first);
        List<Integer> second = new ArrayList<>();
        second.add(1);
        second.add(1);
        second.add(7);
        test.add(second);
        List<Integer> third = new ArrayList<>();
        third.add(1);
        third.add(0);
        third.add(3);
        test.add(third);
        List<Integer> fourth = new ArrayList<>();
        fourth.add(2);
        fourth.add(1);
        fourth.add(0);
        test.add(fourth);
        List<Integer> fifth = new ArrayList<>();
        fifth.add(2);
        fifth.add(1);
        fifth.add(1);
        test.add(fifth);
        dynamicArray(5,test);
    }
}
