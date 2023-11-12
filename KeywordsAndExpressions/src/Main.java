public class Main {
    public static int sumDigits(int number) {
        if (number < 0) return -1;


        int sum = 0;

        while (number > 0) {
            // Extract the least-significant digit
            int digit = number % 10;
            sum += digit;

            // Remove the least-significant digit
            number /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println("Sum of the digits in 125 is " + sumDigits(125));
        System.out.println("Sum of the digits in -125 is " + sumDigits(-125));
        System.out.println("Sum of the digits in 4 is " + sumDigits(4));
        System.out.println("Sum of the digits in 4 is " + sumDigits(1000));
    }


}
