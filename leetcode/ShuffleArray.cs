public class ShuffleArray {
    // Solution for https://leetcode.com/problems/shuffle-the-array/

    public int[] Shuffle(int[] nums, int n) {
        int[] shuffled = new int[nums.Length];

        int j = 0; //cursor to navigate through the original values
        for(int i = 0; i <nums.Length; i++ ){
            if(i%2 == 0){ // if it's in first place, set as original
                shuffled[i] = nums[j];
                j++;
            }else{ // in second place, set as the nth element
                shuffled[i] = nums[j+n-1];
            }
        }
        return shuffled;
    }
}