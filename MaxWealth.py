class Solution:
    def maximumWealth(self, accounts: list[list[int]]) -> int:
        max_wealth = 0
        for account in accounts:
            current_wealth = sum(account)
            if current_wealth > max_wealth:
                max_wealth = current_wealth
        return max_wealth

if __name__ == "__main__":
    accounts = []
    n = int(input("Enter number of customers: "))
    for i in range(n):
        amounts = list(map(int, input(f"Enter wealth values for customer {i+1} separated by space: ").split()))
        accounts.append(amounts)

    sol = Solution()
    result = sol.maximumWealth(accounts)
    print("Maximum Wealth:", result)
