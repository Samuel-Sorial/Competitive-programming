import java.util.HashMap;

public class FindPivotIndex {



    public static void main(String[] args){
        System.out.println(pivotIndex(new int[]{1, 7, 3, 6, 5, 6}));
    }
    public static int pivotIndex(int[] nums){
        int totalSum = 0;
        HashMap<Integer, Integer> sumBefore = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            sumBefore.put(i, totalSum);
            totalSum += nums[i];
        }
        return findEqualBeforeAndAfter(sumBefore, totalSum,nums);
    }

    private static int findEqualBeforeAndAfter(HashMap<Integer, Integer> sumBefore, int totalSum, int[] nums) {
        for(int i : sumBefore.keySet()){
            if(totalSum - nums[i] == 2 * sumBefore.get(i))
                return i;
        }
        return -1;
    }
}
