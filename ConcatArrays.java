import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Solution {
    public List<Integer> getConcatenation(int[] nums) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < 2; i++) {
            for (int num : nums) {
                result.add(num);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take array size input
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        // Input array elements
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        // Call the method and print result
        Solution sol = new Solution();
        List<Integer> output = sol.getConcatenation(nums);

        System.out.println("Concatenated Array:");
        for (int val : output) {
            System.out.print(val + " ");
        }
    }
}
