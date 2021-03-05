
// O(N) Time, O(1) Space for https://leetcode.com/explore/challenge/card/march-leetcoding-challenge-2021/588/week-1-march-1st-march-7th/3659/
/**
 * @param {number[]} nums
 * @return {number}
 */
var missingNumber = function(nums) {
    let summation = 0;
    for(let number of nums){
        summation += number;
    }
    const completeSummation = nums.length * (nums.length+1) / 2;
    return completeSummation - summation;
};