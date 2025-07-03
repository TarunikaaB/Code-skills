from typing import List

class Solution:
    def numberOfEmployeesWhoMetTarget(self, hours: List[int], target: int) -> int:
        count = 0 
        for i in hours:
            if i >= target:
                count += 1 
        return count

# Example usage:
if __name__ == "__main__":
    hours = list(map(int, input("Enter employee hours separated by space: ").split()))
    target = int(input("Enter target hours: "))
    
    sol = Solution()
    result = sol.numberOfEmployeesWhoMetTarget(hours, target)
    print("Number of employees who met or exceeded the target:", result)
