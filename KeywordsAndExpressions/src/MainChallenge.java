import java.util.Scanner;

public class MainChallenge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Double max = null;
        Double min = null;

        while (true) {
            System.out.println("Enter a number/char to exit: ");
            if (scanner.hasNextDouble()) {
                double validNum = scanner.nextDouble();

                if (min == null || validNum < min) min = validNum;
                if (max == null || validNum > max) max = validNum;

            } else {
                break; // Exit loop if the next input is not a double
            }
            scanner.nextLine(); // Handle end of line after number input
        }

        if (min != null && max != null) {
            System.out.println("min = " + min + ", max = " + max);
        } else {
            System.out.println("Invalid Data Entered");
        }

        scanner.close();
    }
}
