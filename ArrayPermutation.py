class Solution:
    def buildArray(self, nums: list[int]) -> list[int]:
        q = len(nums)
        for i, c in enumerate(nums):
            nums[i] += q * (nums[c] % q)
        for i in range(len(nums)):
            nums[i] //= q
        return nums
nums = list(map(int, input("Enter the list of numbers: ").split()))
s = Solution()
if sorted(nums) != list(range(len(nums))):
    print("Invalid input: list must be a zero-based permutation (0 to n-1 with no duplicates).")
else:
    print(s.buildArray(nums))
print(s.buildArray(nums))
