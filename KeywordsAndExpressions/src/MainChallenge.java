public class MainChallenge {
    public static boolean hasTeen(int num1, int num2, int num3) {
        if (num1 >= 13 && num1 <= 19) {
            return true;
        } else if (num2 >= 13 && num2 <= 19) {
            return true;
        } else if (num3 >= 13 && num3 <= 19) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isTeen(int num1) {
        if (num1 >= 13 && num1 <= 19) {
            return true;
        } else {
            return false;
        }
    }


    public static void main(String[] args) {
        System.out.println(hasTeen(9, 99, 19));  // should return true
        System.out.println(hasTeen(25, 15, 42));  // should return true
        System.out.println(hasTeen(22, 23, 34)); // should return true
        System.out.println(isTeen(9)); // should return true
        System.out.println(isTeen(13)); // should return true
    }

}
