public class Main {

    public static void main(String[] args) {
        int primeCount = 0;

        // Loop through a range of numbers (e.g., 1 to 1000)
        for (int i = 1; i <= 1000; i++) {
            if (isPrime(i)) {
                System.out.println(i + " is a prime number");
                primeCount++;

                // Exit the loop if three prime numbers are found
                if (primeCount == 3) {
                    break;
                }
            }
        }
    }

    public static boolean isPrime(int wholeNumber) {
        if (wholeNumber < 2) {
            return false;
        }
        for (int divisor = 2; divisor <= Math.sqrt(wholeNumber); divisor++) {
            if (wholeNumber % divisor == 0) {
                return false;
            }
        }
        return true;
    }
}
