package ProblemSolving.Arrays;


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

}
