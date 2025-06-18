class Solution:
    def findWordsContaining(self, words: list[str], x: str) -> list[int]:
        res = []
        for i in range(len(words)):
            if x in words[i]:
                res.append(i)
        return res

# --- Driver Code ---
if __name__ == "__main__":
    # Sample input
    words = input("Enter words separated by spaces: ").split()
    x = input("Enter the character to search: ")

    sol = Solution()
    result = sol.findWordsContaining(words, x)
    print("Indices with words containing", x, ":", result)
