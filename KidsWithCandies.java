import java.util.*;

public class KidsWithCandies {
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<>();
        int max = Arrays.stream(candies).max().getAsInt();

        for (int candy : candies) {
            result.add(candy + extraCandies >= max);
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of kids: ");
        int n = scanner.nextInt();
        int[] candies = new int[n];

        System.out.print("Enter the candies each kid has: ");
        for (int i = 0; i < n; i++) {
            candies[i] = scanner.nextInt();
        }

        System.out.print("Enter extra candies: ");
        int extraCandies = scanner.nextInt();

        List<Boolean> result = kidsWithCandies(candies, extraCandies);
        System.out.println("Kids with greatest number of candies possible: " + result);
    }
}

