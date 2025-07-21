import java.util.*;

public class MinMovesToSeat {
    public static int minMovesToSeat(int[] seats, int[] students) {
        Arrays.sort(seats);
        Arrays.sort(students);

        int totalMoves = 0;
        for (int i = 0; i < seats.length; i++) {
            totalMoves += Math.abs(seats[i] - students[i]);
        }

        return totalMoves;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of seats/students: ");
        int n = scanner.nextInt();

        int[] seats = new int[n];
        int[] students = new int[n];

        System.out.print("Enter seat positions: ");
        for (int i = 0; i < n; i++) {
            seats[i] = scanner.nextInt();
        }

        System.out.print("Enter student positions: ");
        for (int i = 0; i < n; i++) {
            students[i] = scanner.nextInt();
        }

        int result = minMovesToSeat(seats, students);
        System.out.println("Minimum number of moves to seat everyone: " + result);
    }
}
