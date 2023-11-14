public class Main {
    public static void numberToWords(int number) {
        if (number < 0) {
            System.out.println("Invalid Value");
        } else if (number == 0) {
            System.out.println("Zero");
        } else {
            int reversedNumber = reverse(number);
            int originalDigitCount = getDigitCount(number);
            int reversedDigitCount = getDigitCount(reversedNumber);

            while (reversedNumber != 0) {
                int digit = reversedNumber % 10;
                switch (digit) {
                    case 0 -> System.out.println("Zero");
                    case 1 -> System.out.println("One");
                    case 2 -> System.out.println("Two");
                    case 3 -> System.out.println("Three");
                    case 4 -> System.out.println("Four");
                    case 5 -> System.out.println("Five");
                    case 6 -> System.out.println("Six");
                    case 7 -> System.out.println("Seven");
                    case 8 -> System.out.println("Eight");
                    case 9 -> System.out.println("Nine");
                }
                reversedNumber /= 10;
            }

            for (int i = reversedDigitCount; i < originalDigitCount; i++) {
                System.out.println("Zero");
            }
        }
    }

    public static int reverse(int number) {
        int reversed = 0;
        while (number != 0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number /= 10;
        }
        return reversed;
    }

    public static int getDigitCount(int number) {
        if (number < 0) return -1;
        return number == 0 ? 1 : (int) Math.log10(number) + 1;
    }
}
