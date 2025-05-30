def minimum_operations(nums):
    ans = 0
    for num in nums:
        ans += min(3 - (num % 3), num % 3)
    return ans

# Input from user
input_str = input("Enter numbers separated by space: ")
nums = list(map(int, input_str.split()))

# Calculate and display result
result = minimum_operations(nums)
print("Minimum Operations:", result)
