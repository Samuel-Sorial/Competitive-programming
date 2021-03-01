"https://leetcode.com/submissions/detail/462155311/?from=explore&item_id=3657"
class Solution:
    def distributeCandies(self, candyType: List[int]) -> int:
        doctorMaximum = len(candyType) // 2
        differentTypes = len(set(candyType))
        return min(doctorMaximum, differentTypes)
