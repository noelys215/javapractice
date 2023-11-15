public class Main {
    public static void main(String[] args) {
        int currentYear = 2024;
        System.out.println(getConsoleInput(currentYear));
        System.out.println(getScannerInput(currentYear));
    }

    public static String getConsoleInput(int currentYear) {
        String name = System.console().readLine("Hi, What's your name?");
        System.out.println("Hi " + name + ", thanks for taking this course! c: ");
        String dateOfBirth = System.console().readLine("What year were you born?");
        int age = currentYear - Integer.parseInt(dateOfBirth);

        return "So you're " + age + " years old?";
    }

    public static String getScannerInput(int currentYear) {

        return "";
    }


}
