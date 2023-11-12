public class Main {

    public static void main(String[] args) {
        int evenNum = 0;
        int oddNum = 0;
        int i = 4;

        while (i <= 20) {
            i++;
            if (isEvenNumber(i)) {
                System.out.println(i);
                evenNum += 1;

            }
            if (!isEvenNumber(i)) oddNum += 1;
            if (evenNum >= 5) break;

        }
        System.out.println("Even Numbers: " + evenNum);
        System.out.println("Odd Numbers: " + oddNum);
    }

    public static boolean isEvenNumber(int num) {
        return num % 2 == 0;
    }


}
