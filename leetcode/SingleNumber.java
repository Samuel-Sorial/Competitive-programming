public class SingleNumber{
    public int singleNumber(int[] nums) {
        Map<Integer,Boolean> repeated = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            if(repeated.get(nums[i]) == null)
                repeated.put(nums[i],false);
            else
                repeated.put(nums[i],true);
        }
        for(Integer n : repeated.keySet()) {
            if (repeated.get(n) == false)
                return n;
        }
        return 0;
    }
}