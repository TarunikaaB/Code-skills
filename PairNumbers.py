from typing import List

class Solution:
    def numIdenticalPairs(self, nums: List[int]) -> int:
        pair = 0
        n = len(nums)
        for i in range(n - 1):
            for j in range(i + 1, n):
                if nums[i] == nums[j] and i < j:
                    pair += 1
        return pair

# --- Sample usage ---

if __name__ == "__main__":
    # Sample input
    nums = [1, 2, 3, 1, 1, 3]
    # Create an instance of Solution
    sol = Solution()
    # Call the method and print the result
    print("Input:", nums)
    print("Number of good pairs:", sol.numIdenticalPairs(nums))
