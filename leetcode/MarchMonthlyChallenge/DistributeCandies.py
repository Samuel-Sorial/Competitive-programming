class Solution:
    def distributeCandies(self, candyType: List[int]) -> int:
        doctorMaximum = len(candyType) // 2
        differentTypes = len(set(candyType))
        return differentTypes if differentTypes < doctorMaximum else doctorMaximum
