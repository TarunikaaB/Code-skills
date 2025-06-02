import java.util.*;
public class FinalValueAfterOperations {
    public static int finalValueAfterOperations(String[] operations) {
        int pos = 0, neg = 0;
        for (String op : operations) {
            if (op.equals("++X") || op.equals("X++")) {
                pos++;
            } else {
                neg++;
            }
        }
        return pos - neg;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter number of operations: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // consume newline

        String[] operations = new String[n];
        System.out.println("Enter operations (e.g., ++X, X++, --X, X--):");
        for (int i = 0; i < n; i++) {
            operations[i] = scanner.nextLine();
        }

        int result = finalValueAfterOperations(operations);
        System.out.println("Final value after operations: " + result);
    }
}
