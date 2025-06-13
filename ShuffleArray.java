import java.util.*;

public class ShuffleArray {
    public int[] shuffle(int[] nums, int n) {
        int[] ans = new int[nums.length];
        int index = 0;
        
        for (int i = 0; i < n; i++) {
            ans[index++] = nums[i];
            ans[index++] = nums[i + n];
        }
        
        return ans;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ShuffleArray sol = new ShuffleArray();

        System.out.print("Enter value of n (half the size of array): ");
        int n = scanner.nextInt();
        int size = 2 * n;
        int[] nums = new int[size];

        System.out.println("Enter " + size + " numbers:");
        for (int i = 0; i < size; i++) {
            nums[i] = scanner.nextInt();
        }

        int[] result = sol.shuffle(nums, n);

        System.out.println("Shuffled Array: " + Arrays.toString(result));
    }
}
