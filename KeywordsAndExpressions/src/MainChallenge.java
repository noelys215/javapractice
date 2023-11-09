public class MainChallenge {
    public static void printEqual(int a, int b, int c) {
        System.out.println(a < 0 || b < 0 || c < 0 ? "Invalid Value" :
                (a == b && b == c) ? "All numbers are equal" :
                        (a != b && b != c && a != c) ? "All numbers are different" :
                                "Neither all are equal or different");
    }


    public static void main(String[] args) {
        printEqual(1, 1, 1); //should print text All numbers are equal
        printEqual(1, 1, 2); //should print text Neither all are equal or different
        printEqual(-1, -1, -1); //should print text Invalid Value
        printEqual(1, 2, 3); //should print text All numbers are different
    }

}
