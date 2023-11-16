import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int currentYear = 2024;

        try {
            System.out.println(getConsoleInput(currentYear));
        } catch (NullPointerException e) {
            System.out.println(getScannerInput(currentYear));
        }
    }

    public static String getConsoleInput(int currentYear) {
        String name = System.console().readLine("Hi, What's your name?");
        System.out.println("Hi " + name + ", thanks for taking this course! c: ");
        String dateOfBirth = System.console().readLine("What year were you born?");
        int age = currentYear - Integer.parseInt(dateOfBirth);

        return "So you're " + age + " years old?";
    }

    public static String getScannerInput(int currentYear) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hi, What's your name? ");
        String name = scanner.nextLine();
        System.out.println("Hi " + name + ", thanks for taking this course! c: ");
        System.out.println("What year were you born? ");

        boolean validDOB = false;
        int age = 0;
        do {
            System.out.println("Enter a year of birth >= " + (currentYear - 125) + " and <= " + (currentYear));
            try {
                age = checkData(currentYear, scanner.nextLine());
                validDOB = age < 0 ? false : true;
            } catch (NumberFormatException badUserData) {
                System.out.println("Characters not allowed!");
            }
        } while (!validDOB);

        return "So you're " + age + " years old?";
    }


    public static int checkData(int currentYear, String dateOfBirth) {
        int dob = Integer.parseInt(dateOfBirth);
        int minYear = currentYear - 125;

        if ((dob < minYear) || (dob > currentYear)) return -1;

        return currentYear - dob;
    }

}
