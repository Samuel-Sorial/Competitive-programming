from collections import defaultdict
"https://leetcode.com/explore/challenge/card/march-leetcoding-challenge-2021/588/week-1-march-1st-march-7th/3658/"

class Solution:
    def findErrorNums(self, nums: List[int]) -> List[int]:
        visited_numbers = defaultdict(int)
        duplicated, lost = -1, -1
        for number in nums:
            visited_numbers[number] += 1
        for number in range(1,len(nums)+1):
            if visited_numbers[number] == 2:
                duplicated = number
            if visited_numbers[number] == 0:
                lost = number
        return duplicated, lost

