package ProblemSolving.Arrays;

import java.io.*;
import java.util.*;
public class SparseArray {

    // Complete the matchingStrings function below.
    static int[] matchingStrings(String[] strings, String[] queries) {
        HashMap<String, Integer> countString = new HashMap<>();
        countString = prepareMap(countString, strings);
        int[] recurrences = new int[queries.length]; // The return value will be calculated here.
        for(int i = 0; i<queries.length; i++) {
            recurrences[i] = countString.getOrDefault(queries[i], 0); // Fetch the recurrences from the map.
        }
        return recurrences;
    }

    /**
     *
     * @param map
     * @param strings
     * @return a map between each string with it's number of recurrences at the array.
     */
    private static HashMap<String, Integer> prepareMap(HashMap<String, Integer> map ,String[] strings) {
        for(String s : strings) {
            if(map.containsKey(s))
                map.replace(s , map.get(s) +1);
            else
                map.put(s, 1);
        }
        return map;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int stringsCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String[] strings = new String[stringsCount];

        for (int i = 0; i < stringsCount; i++) {
            String stringsItem = scanner.nextLine();
            strings[i] = stringsItem;
        }

        int queriesCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String[] queries = new String[queriesCount];

        for (int i = 0; i < queriesCount; i++) {
            String queriesItem = scanner.nextLine();
            queries[i] = queriesItem;
        }

        int[] res = matchingStrings(strings, queries);

        for (int i = 0; i < res.length; i++) {
            bufferedWriter.write(String.valueOf(res[i]));

            if (i != res.length - 1) {
                bufferedWriter.write("\n");
            }
        }

        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
